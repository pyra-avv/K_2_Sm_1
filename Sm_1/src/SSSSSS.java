import java.util.Scanner;

public class SSSSSS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "Hell"; // yазатель на область памяти
        String S1 = new String("Hell"); // yазатель на область памяти подругоме (то же самое)

        System.out.print("n= ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = (int) in.nextInt();
        }
        //for (int i = 0; i < n; i++) System.out.print("arr[" + i + "]=" + arr[i] + "\n");
        //main_print(arr);
        zdvig(arr, n);
        main_print(arr);
        System.out.print("искомый элемент= ");
        int x = in.nextInt();
        System.out.print("Число вхождений=" + poisk(arr, x));

    }
    public static void main_print(int []ar) {
        int j = 0;
        for (int Valiu : ar) {
            System.out.print("arr[" + j + "]=" + Valiu + "\n");
            j++;
        }
    }
    public static int poisk(int []ar, int x) {
        int k = 0;
        for (int Valiu : ar) if(x == Valiu) k++;
        return k;
    }
    public static void zdvig(int []ar, int n) {
        int temp = ar[--n];
        while ( n > 0 ) ar[n--] = ar[n-1];
        ar[0] = temp;
    }
}
