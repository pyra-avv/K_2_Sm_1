import java.math.BigDecimal;
import java.util.Scanner;

public class ExpRT {

    //BigInteger result = BigInteger.ONE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        double x = in.nextDouble();
        System.out.print("eps= ");
        double eps = in.nextDouble();

        double sum_e = 1,  i = 2, fact = x;
        do {
            sum_e += fact;
            fact *= x/i;
            i++;
            System.out.print(i + " " + fact + " " + sum_e + "\n");
        } while(Math.abs(fact) >= eps);

        System.out.print(sum_e);
    }
}
