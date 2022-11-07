import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размеры массива\n");
        int n = in.nextInt();
        int[] A = new int[n];
        arr_scan(A);
        print_arr(A);
        System.out.print("\na = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("\nВ массиве " + search_a_b(A, a, b) + " элементов, входящих в [" + a + ", " + b + "]\n");
        System.out.print("Сумма всех элементов массива равна " + sum(A));
        System.out.print("\nВ массиве " + search(A) + " чётных чисел\n");
        if (examination(A)) System.out.print("Все элементы массива положительные\n");
        else System.out.print("Не все элементы массива положительные\n");
        permutation(A, n);
        System.out.print("Элементы массива в обратном порядке:\n");
        print_arr(A);
    }

    public static void print_arr(int[] arr) { // подпрограмма для вывода массива
        for (int Valiu : arr) {
            System.out.print(Valiu + " ");
        }
    }

    public static void arr_scan(int[] arr) { // подпрограмма для заполнения массива
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = in.nextInt();
        }
    }

    public static int sum(int[] arr) { // подпрограмма для нахождения суммы элементов массива
        int s = 0;
        for (int Valiu : arr) s += Valiu;
        return s;
    }

    public static int search(int[] arr) { // подпрограмма для нахождения кол-ва чётных чисел
        int p = 0;
        for (int Valiu : arr) if (Valiu % 2 == 0) p++;
        return p;
    }

    public static int search_a_b(int[] arr, int a, int b) { // подпрограмма для нахождения кол-ва элементов входящих в [a, b]
        int p = 0;
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        for (int Valiu : arr) if (Valiu >= a && Valiu <= b) p++;
        return p;
    }

    public static boolean examination(int[] arr) { // подпрограмма для определения все ли элементы массива положительные
        for (int Valiu : arr) if (Valiu < 0) return false;
        return true;
    }

    public static void permutation(int[] arr, int n) {
        int t;
        for (int i = 0; i < n / 2; i++) {
            t = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = t;
        }
    }
}
