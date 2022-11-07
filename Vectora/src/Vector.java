import java.util.Scanner;

public class Vector { // вектор заданный классом
    private double x, y, z;
    private String name;
    public Vector(String nameV, double xV, double yV, double zV) { // подпрограмма для создания вектора
        name = nameV;
        x = xV;
        y = yV;
        z = zV;
    }
    public Vector() {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("name =");
        name = scanner.nextLine();
        System.out.print("x =");
        x = in.nextDouble();
        System.out.print("y = ");
        y = in.nextDouble();
        System.out.print("z = ");
        z = in.nextDouble();

    }
    public void print_vector() { // подпрограмма для выведения вектора
        System.out.print(name + " (" + x + ", " + y + ", " + z + ")\n");
    }

    public void print_sk_pr(Vector v2, double p) { // подпрограмма для выведения скалярного произведения
        System.out.print("(" + name + "; " + v2.name + ") = " + p + "\n");
    }

    public void print_vec_pr(Vector v2, Vector p) { // подпрограмма для выведения векторного произведения
        System.out.print("[" + name + "; " + v2.name + "] = ");
        p.print_vector();
    }
    public void print_sm_pr(Vector v2, Vector v3, double p) { // подпрограмма для выведения смешанного произведения
        System.out.print("<" + name + "; " + v2.name + "; " + v3.name + "> = " + p + "\n");
    }
    public double sk_pr(Vector v2) { // подпрограмма для скалярного произведения
        return x * v2.x + y * v2.y + z * v2.z;
    }
    public Vector vec_pr(Vector v2) { // подпрограмма для векторного произведения
        String name = "";
        double x = y * v2.z - z * v2.y;
        double y = z * v2.x - x * v2.z;
        double z = x * v2.y - y * v2.x;
        Vector P = new Vector(name, x, y, z);
        return P;
    }
    public double sm_pr(Vector v1, Vector v2) { // подпрограмма для смешанного произведения
        Vector pp = new Vector("", 0, 0, 0);
        double p;
        pp = v1.vec_pr(v2);
        p = x * pp.x + y * pp.y + z * pp.z;
        return p;
    }
}
