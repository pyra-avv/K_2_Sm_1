import java.util.Scanner;

public class SinTbl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        double a = scan.nextDouble();
        System.out.print("b= ");
        double b = scan.nextDouble();
        System.out.print("h= ");
        double h = scan.nextDouble();
        if(h < 0) h *= -1;
        if(a > b) {
            double t = a;
            a = b;
            b = t;
        }

        double x = a, f;
        while (b >= x || (Math.abs(x - b) < 1e-9)) {
            f = Math.sin(x);
            System.out.printf("sin(%f) = %f\n", x, f);
            //System.out.print(x + "\n");
            x += h;
        }
    }
}
