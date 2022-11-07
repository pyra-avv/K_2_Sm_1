import java.util.Scanner;

public class Test {
    public static void main(String[] args) { // тест
        // точки
        Point3D a = new Point3D();
        scan_point(a);
        System.out.print("a: " + a);
        Point3D b = new Point3D();
        scan_point(b);
        System.out.print("b: " + b);

        if (a.equals(b)) {
            System.out.print("Точки равны\n");
        } else {
            System.out.print("Точки не равны\n");
        }

        // вектора
        Vector3D ab = new Vector3D(a, b);
        System.out.print("Вектор по точкам a и b: " + ab);
        Vector3D v = new Vector3D();
        scan_vector(v);
        System.out.print("v: " + v);

        System.out.print("Длина вектора ab равна " + ab.length() + "\n" +
                "Длина вектора v равна " + v.length() + "\n");
        if (ab.equals(v)) {
            System.out.print("Вектор ab равен вектору v\n");
        } else {
            System.out.print("Вектор ab не равен вектору v\n");
        }

        // операции с векторами
        if (Vector3DProcessor.collinarity_check(ab, v)) {
            System.out.print("Вектора коллиноарны\n");
        } else {
            System.out.print("Вектора не коллиноарны\n");
        }
        System.out.print("Сумма векторов векторов ab и v равна вектору " + Vector3DProcessor.sum_vector(ab, v) +
                "Разность векторов векторов ab и v равна вектору " + Vector3DProcessor.diff_vector(ab, v) +
                "Скалярное произведение векторов ab и v равно " + Vector3DProcessor.sk_pr(ab, v) +
                "\nВекторноe произведение векторов ab и v равно вектору " + Vector3DProcessor.pr_vector(ab, v));

        // массив векторов
        Scanner in = new Scanner(System.in);
        System.out.print("Vector arr:\nn =");
        int n = in.nextInt();
        Vector3DArray arr = new Vector3DArray(n);
        scan_vectorArr(arr);
        arr.print_vectorArr();

        System.out.print("Длина самого длинного вектора из массива равна " + arr.max_length() + "\n" +
                "Сумма всех векторов в массиве равна " + arr.sum_arr());
        int m = arr.search(v);
        if (m == -1) {
            System.out.print("Вектора v нет в массиве\n");
        } else {
            System.out.print("Вектор v находитсы в массиве под индесом " + m + "\n");
        }
        System.out.print("P = a\n");
        arr.shift_point(a);

        // линейная комбинация векторов
        System.out.print("Введите коэфициэнты:\n");
        double[] K = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("K[" + i + "]= ");
            K[i] = in.nextDouble();
        }
        System.out.print("Линейна комбинация векторов " + arr.LK_arr(K));
    }
    public static void scan_point(Point3D A) { // ввод точки с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Point:\nx =");
        double x = in.nextDouble();
        A.setX(x);
        System.out.print("y = ");
        double y = in.nextDouble();
        A.setY(y);
        System.out.print("z = ");
        double z = in.nextDouble();
        A.setZ(z);
    }
    public static void scan_vector(Vector3D V) { // ввод вектора с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Vector:\nx =");
        double x = in.nextDouble();
        V.setX(x);
        System.out.print("y = ");
        double y = in.nextDouble();
        V.setY(y);
        System.out.print("z = ");
        double z = in.nextDouble();
        V.setZ(z);
    }
    public static void scan_vectorArr(Vector3DArray arr) {
        for (int i = 0; i < arr.getN(); i++) {
            Vector3D e = new Vector3D();
            System.out.print("arr[" + i + "] =\n");
            scan_vector(e);
            arr.setI(e, i);
        }
    }
}