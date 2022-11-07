import java.util.Scanner;

public class SLU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a1, b1, a2, b2, c1, c2, x1, x2, D, D1, D2;
        System.out.print("a1= ");
        a1 = in.nextDouble();
        System.out.print("b1= ");
        b1 = in.nextDouble();
        System.out.print("c1= ");
        c1 = in.nextDouble();
        System.out.print("a2= ");
        a2 = in.nextDouble();
        System.out.print("b2= ");
        b2 = in.nextDouble();
        System.out.print("c2= ");
        c2 = in.nextDouble();

        D = a1 * b2 - a2 * b1;
        if(D == 0) System.out.print("Система имеет бесконечно много рашений или не имеет их");
        else {
            D1 = c1 *b2 - b1 * c2;
            D2 = a1 * c2 - a2 * c1;
            x1 = D1 / D;
            x2 = D2 / D;
            System.out.print("x1=" + x1 + "\nx2=" + x2);
        }
    }
}
