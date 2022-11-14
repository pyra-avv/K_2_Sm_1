import java.util.Scanner;

public class MEIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a*x^(3)+b*x^(2)+c*x+d\na = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();
        System.out.print("d = ");
        double d = in.nextDouble();
        System.out.print("f(x)=" + fx3(a, b, c, d) + "\n");

        a *= 3;
        b *= 2;
        System.out.print("f'(x)=" + fx2(a, b, c) + "\n\n");
        double x1 = 0, x2 = 0;
        int k = quadratic(a, b, c, x1, x2);

        if (k == -1) {
            System.out.print("---");
        } else if (k == 0) {
            if (a > 0 || (a == 0 && c > 0)) {
                System.out.print("/\n");
            } else System.out.print("\\ \n");
        } else if (k == 1) {
            if (a == 0) {
                if (b > 0) {
                    System.out.print("\\" + x1 + "/");
                } else {
                    System.out.print("/" + x1 + "\\");
                }
            } else if (a > 0) {
                System.out.print("/" + x1 + "/");
            } else {
                System.out.print("\\" + x1 + "\\");
            }
        }
        else if (k == 2) {
            if (x1 > x2) {
                double t = x1;
                x1 = x2;
                x2 = t;
            }
            if (a > 0) {
                System.out.print("/" + x1 + "\\" + x2 + "/");
            } else {
                System.out.print("\\" + x1 + "/" + x2 + "\\");
            }
        }
    }
    public static int linear(double b, double c, double x1) {
        if (b == 0) {
            if (c == 0) {
                return -1;
            }
            return 0;
        }
        x1 = -c / b;
        return 1;
    }

    public static int quadratic(double a, double b, double c, double x1, double x2) {
        if (a == 0) {
            return linear(b, c, x1);
        }
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            x1 = (-b + Math.sqrt(d)) / (a * 2.);
            x2 = (-b - Math.sqrt(d)) / (a * 2.);
            if (x1 == x2) {
                return 1;
            }
        } else {
            return 0;
        }
        return 2;
    }


    public static String fx3(double a, double b, double c, double d) {
        StringBuilder f = new StringBuilder();
        if (a != 0)  {
            f.append(a).append("*x^(3)");
        }
        if (b > 0 && a != 0) {
            f.append("+");
        }
        if (b != 0) {
            f.append(b).append("*x^(2)");
        }
        if (c > 0 && (b != 0 || a != 0)) {
            f.append("+");
        }
        if (c != 0)  {
            f.append(c).append("*x");
        }
        if (d > 0 && (c != 0 || b != 0 || a != 0)) {
            f.append("+");
        }
        if (d != 0 || (a == 0 && b == 0 && c == 0)) {
            f.append(d);
        }
        return f.toString();
    }

    public static String fx2(double a, double b, double c) {
        StringBuilder f = new StringBuilder();
        if (a != 0) {
            f.append(a).append("*x^(2)");
        }
        if (b > 0 && a != 0) {
            f.append("+");
        }
        if (b != 0)  {
            f.append(b).append("*x");
        }
        if (c > 0 && (b != 0 || a != 0)) {
            f.append("+");
        }
        if (c != 0 || (a == 0 && b == 0)) {
            f.append(c);
        }
        return f.toString();
    }
    public static String fx1(double b, double c) {
        StringBuilder f = new StringBuilder();
        if (b != 0) {
            f.append(b).append("*x");
        }
        if (c > 0 && b != 0) {
            f.append("+");
        }
        if (c != 0 || b == 0) {
            f.append(c);
        }
        return f.toString();
    }
}
