import java.util.Scanner;

public class Kv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, x1 = 0, x2 = 0;
        System.out.print("a= ");
        a = in.nextDouble();
        System.out.print("b= ");
        b = in.nextDouble();
        System.out.print("c= ");
        c = in.nextDouble();

        if (a != 0) System.out.print(a + "*x^(2)");
        if (b > 0 && a != 0) System.out.print("+");
        if (b != 0)  System.out.print(b + "*x");
        if (c > 0 && (b != 0 || a != 0)) System.out.print("+");
        if (c != 0 || (a == 0 && b == 0)) System.out.print(c);
        System.out.print("=0\n");

        int k = 0;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) k -= 1;
            } else {
                x1 = -c / b;
                k += 1;
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (a * 2.);
                x2 = (-b - Math.sqrt(d)) / (a * 2.);
                k += 2;
                if (d == 0) k -= 1;
            }
        }

        if (k < 0) System.out.print("Корень любой");
        if (k == 0) System.out.print("Кореней нет");
        if (k == 1) System.out.print("Корень один\nx=" + x1);
        if (k == 2) System.out.print("Кореней два\nx1=" + x1 + "\nx2=" + x2);
    }
}
