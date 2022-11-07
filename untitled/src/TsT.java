import java.util.Scanner;

public class TsT {
    void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start");
        double a = scan.nextDouble();
        System.out.print("Enter finish");
        double b = scan.nextDouble();
        System.out.print("Enter step");
        double step = scan.nextDouble();

        if (step <= 0 || a >= b)
        {
            System.out.println("Error! Wrong value ");
        }
        else
        {
            double newX = a;
            if ((newX + step) > b)
            {
                double func = Math.sin(newX);
                System.out.printf("При x = %f , sin(x) = %f \n", newX, func);
                System.out.println("Out of line");
            }
            else
            {
                while ((newX) <= b)
                {
                    double func = Math.sin(newX);
                    System.out.printf("For x = %f , sin(x) = %f \n", newX, func);
                    newX = newX + step;
                }
                System.out.println("Out of line");
            }

        }
    }
}
