import java.util.Scanner;

public class ArIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        int x = in.nextInt();
        System.out.print("y= ");
        int y = in.nextInt();
        System.out.print("z= ");
        int z = in.nextInt();

        int p=x*y*z;
        System.out.print("x*y*z= " + p);

        int sr=(x+y+z)/3;
        System.out.print("\nСреднее арифметическое (мщжет выдаватся некорректно) " + sr);

        int t;
        if (x > y) {
            t=x;
            x=y;
            y=t;
        }
        if (y > z) {
            t=z;
            z=y;
            y=t;
            if (x > y) {
                t=x;
                x=y;
                y=t;
            }
        }
        System.out.print("\n" + x + " " + y + " " + z);

        System.out.println( );
    }
}

