import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Point3D a = new Point3D();
        scan_point(a);
        System.out.print("a: " + a);
        Point3D b = new Point3D();
        scan_point(b);
        System.out.print("b: " + b);

        if (a.equals(b)) System.out.print("Точки равны\n");
        else System.out.print("Расстояние между точками равно " + a.distans(b) + "\n");

        Point3D c = new Point3D();
        scan_point(c);
        System.out.print("c: ");

        Triangle3D abc = new Triangle3D(a, b, c);
        System.out.print(abc);

        System.out.print("Перимитр равен  " + abc.P() + "\n");
        System.out.print("Площадь равна  " + abc.S() + "\n");
        System.out.print("Медианы пересекаются в точке " + abc.M());

        Scanner in = new Scanner(System.in);
        System.out.print("Введите угол поворота в радианах: ");
        double corner = in.nextDouble();

    }
    public static void scan_point(Point3D A) { // ввод точки с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Point:\nx =");
        double x = in.nextDouble();
        A.setX(x);
        System.out.print("y = ");
        double y = in.nextDouble();
        A.setY(y);
        System.out.print("z = ");
        double z = in.nextDouble();
        A.setZ(z);
    }

}
