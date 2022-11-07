import java.util.Scanner;

public class SinTbl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a= ");
        double a = in.nextDouble();
        System.out.print("b= ");
        double b = in.nextDouble();
        System.out.print("h= ");
        double h = in.nextDouble();

        double f, x = a;
        /*for(double x = a; b >= x; x += h) {
            f = Math.sin(x);
            System.out.print("sin(" + x + ")=" + f +"\n");
        }*/
        do {
            f = Math.sin(x);
            System.out.print("sin(" + x + ")=" + f +"\n");
            x += h;
        } while(b >= x);
    }
}
