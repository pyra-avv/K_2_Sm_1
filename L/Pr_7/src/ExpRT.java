import java.math.BigDecimal;
import java.util.Scanner;

public class ExpRT {

    //BigInteger result = BigInteger.ONE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, eps, sum_e = 0, e_x, fact_i = 1;
        //java.math.BigDecimal i = BigDecimal.valueOf(0);
        double i = 0;
        System.out.print("x= ");
        x = in.nextDouble();
        System.out.print("eps= ");
        eps = in.nextDouble();

        e_x = Math.exp(x);
        do {
            sum_e += Math.pow(x, i)/fact_i;
            i++;
            fact_i *= i;
            System.out.print(i + "  " + sum_e + " \n");
        } while(Math.abs(sum_e - e_x) >= eps);

        System.out.printf("%e", sum_e);
    }
}
