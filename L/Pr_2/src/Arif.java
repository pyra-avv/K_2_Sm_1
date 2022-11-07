import java.util.Scanner;

public class Arif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        double x = in.nextDouble();
        System.out.print("y= ");
        double y = in.nextDouble();
        System.out.print("z= ");
        double z = in.nextDouble();

        double p = x * y * z;
        System.out.print("x*y*z= " + p);

        double sr = (x + y + z) / 3;
        System.out.print("\nСреднее арифметическое " + sr);

        double t;
        if (x > y) {
            t = x;
            x = y;
            y = t;
        }
        if (y > z) {
            t = z;
            z = y;
            y = t;
            if (x > y) {
                t = x;
                x = y;
                y = t;
            }
        }
        System.out.print("\n " + x + " " + y + " " + z);

        System.out.println();
    }
}
