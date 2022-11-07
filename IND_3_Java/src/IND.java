import java.util.Scanner;

public class IND {
    public static void main(String[] args) { // тестиркющая программа
        Scanner in = new Scanner(System.in);
        int x = 0, y = 0, r = -1, x1 = 0, x2 = 0;
        int msl, sl, slo = 0;
        int t = 0, k = 0;
        x_y(x, y);
        Matrix arr = new Matrix(x, y);
        double[] s = new double[x];
        do {
            menu();
            msl = in.nextInt();
            if (msl == 1) { // Заполнить таблицу
                if (t > 0) System.out.print("!!!Таблица уже есть!!!\n");//x_y(x, y);
                else {
                    do {
                        System.out.print("Выберите цифру для соответствующего действия\n1: Заполнить таблицу случайно\n2: Заполнить таблицу самостоятельно\n");
                        sl = in.nextInt();
                        if (sl != 1 && sl != 2) System.out.print("!!!Выберите другое значение!!!\n");
                    } while (sl != 1 && sl != 2);
                    if (sl == 1) rand(arr); // Заполнить таблицу случайно
                    if (sl == 2) scan__arr(arr); // Заполнить таблицу самостоятельно
                    System.out.print("Таблица заполнена\n");
                    t++;
                }
            }
            if (t == 0 && (msl == 2 || msl == 3 || msl == 4)) System.out.print("Сначала заполните таблицу\n");
            else {
                if (msl == 2) arr.print_matrix();
                if (msl == 3) { // Обработать таблицу
                    do {
                        System.out.print("Выберите цифру для соответствующего действия\n1: Найти скалярное произведение всех столбцов на столбец с наибольшей суммой элементов\n2: Найти строки таблицы, скалярное произведение которых минимально\n");
                        slo = in.nextInt();
                        if (slo != 1 && slo != 2) System.out.print("!!!Выберите другое значение!!!\n");
                    } while (slo != 1 && slo != 2);
                    if (slo == 1) r = skal_p2(arr, s);
                    if (slo == 2) r = skal_p3(arr, x1, x2);
                    if (r == 0) {
                        System.out.print("Таблица обработана\n");
                        if (slo == 2) {
                            x1 += 1; // корректирование номера строк
                            x2 += 1;
                        }
                        k = t; // готов результат
                    } else System.out.print("!!!Ошибка!!!\n");
                }
                if (msl == 4) { // Вывод результата
                    if (k != t) System.out.print("Сначала обработайте таблицу\n"); // таблица не обработанна
                    else if (k == t) {
                        if (r == 1) System.out.print("Размеры таблицы введены некорректно\n"); // Защита от дурака
                        else {
                            if (slo == 1) {
                                System.out.print("Скалярные произведения всех столбцов таблицы на последний из столбцов, имеющих наибольшую сумму элементов:\n");
                                for (int j = 0; j < arr.getY(); j++) { // вывод произведений
                                    System.out.printf("%f ", s[j]);
                                }
                            }
                            if (slo == 2) System.out.print("Cтроки таблицы, скалярное произведение которых минимально: " + x1 + " " + x2 + "\n"); // результат
                        }
                    }
                    else System.out.print("Ошибка\n"); // Защита от дурака
                }
            }
            if (msl != 1 && msl != 2 && msl != 3 && msl != 4 && msl != 5) System.out.print("!!!Выберите другое значение!!!\n");
        } while (msl != 5);
    }
    public static void menu() { // меню тестирующей программы
        System.out.print("Выберите цифру для соответствующего действия\n");
        System.out.print("1: Заполнить таблицу\n");
        System.out.print("2: Вывод таблицы\n");
        System.out.print("3: Обработать таблицу\n");
        System.out.print("4: Вывод результата\n");
        System.out.print("5: Завершение работы\n");
    }
    public static void scan__arr(Matrix arr) {
        Scanner in = new Scanner(System.in);
        double e;
        System.out.print("Вводите значения элементов:\n");
        for (int i = 0; i < arr.getX(); i++) {
            for (int j = 0; j < arr.getY(); j++) {
                System.out.print("arr[" + i + "][" + j + "]=");
                e = in.nextDouble();
                arr.setIJ(e, i, j);
            }
        }
    }
    public static void rand(Matrix arr) {
        for (int i = 0; i < arr.getX(); i++) {
            for (int j = 0; j < arr.getY(); j++) {
                arr.setIJ(Math.random()*(100) - 50, i, j) ;
            }
        }
    }
    public static void x_y(int x, int y) { // размеры таблицы
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите размеры таблицы\n");
            x = in.nextInt();
            y = in.nextInt();
            if (x <= 0 || y <= 0) System.out.print("!!!Размеры таблицы введены некорректно!!!\n");
        } while (x <= 0 || y <= 0);
    }
    public static int skal_p3(Matrix arr, int x1, int x2) { // подпрограмма находит строки с минимальным скалярным произведением
        double min = 1.7976931348623157e308, s;
        /*s = скалярное произведение строк
	    min = минимальное скалярное произведение строк*/
        for (int k = 0; k < arr.getX(); k++) {
            for (int i = 0; i < arr.getX(); i++) {
                s = 0;
                for (int j = 0; j < arr.getY(); j++) {
                    s += arr.getIJ(k, j) * arr.getIJ(i, j); // скалярное произведение строки k на строку i
                }
                if (s < min) { // нахождение минимального
                    min = s;
                    x1 = k;
                    x2 = i;
                }
            }
        }
        return 0;
    }
    public static int skal_p2(Matrix arr, double []s) { // находит скалярное произведение всех столбцов на столбец с наибольшей суммой элементов
        int g = 1, i, j;
        double max = -1.7976931348623157e308, sum = 0;

        for (j = 0; j < arr.getY(); j++) {
            sum = 0;
            for (i = 0; i < arr.getX(); i++) {
                sum += arr.getIJ(i, j);
            }
            if (sum >= max) {
                max = sum;
                g = j;
            }
        } // g = номер столбца с наибольшей суммой элементов
        for (j = 0; j < arr.getY(); j++) {
            s[j] = 0;
            for (i = 0; i < arr.getX(); i++) {
                s[j] += arr.getIJ(i, j) * arr.getIJ(i, g); // скалярное произведение столбца j на столбец g
            }
        }
        return 0;

    }
    /*public static int sort(double [][]arr, int x, int y) { //Отсортировать столбцы матрицы по неубыванию сумм положительных элементов. Сортировка простым выбором
        int k, t;
        double t1;
        double[] a = new double[x];

        for (int i = 0; i < x; i++) {
            a[i] = 0;
            for (int j = 0; j < y; j++) if (arr[i][j] > 0) a[i] += arr[i][j];
        }

        for (int i = 0; i < x - 1; i++) {
            k = i;
            t = a[i];
            t1 = arr[i];
            for (int j = i + 1; j < x; j++) {
                if (a[j] > t) {
                    k = j;
                    t = a[j];
                    t1 = arr[j];
                }
            }
            a[k] = a[i];
            a[i] = t;
            arr[k] = arr[i];
            arr[i] = t1;
        }
    }*/
}
