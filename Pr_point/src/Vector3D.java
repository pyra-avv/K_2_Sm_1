import java.util.Scanner;

public class Vector3D {

    public static final Vector3D ZERO = new Vector3D();
    private double x;
    private double y;
    private double z;
    public Vector3D() { // конструктор по умолчанию
    }
    public Vector3D(double xV, double yV, double zV) { // конструктор по параметрам
        x = xV;
        y = yV;
        z = zV;
    }
    public Vector3D(Point3D a, Point3D b) { // конструктор по точкам
        x = b.getX() - a.getX();
        y = b.getY() - a.getY();
        z = b.getZ() - a.getZ();
    }
    public double length() { // длина вектора
        return Math.sqrt(x * x + y * y + z * z);
    }
    @Override
    public boolean equals(Object o) { // сравнение векторов
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector = (Vector3D) o;
        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0 && Double.compare(vector.z, z) == 0;
    }
    @Override
    public String toString() {
        return "vector { " + x + ", " + y + ", " + z + '}' + "\n";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setX(double e) {
        this.x = e;
    }
    public void setY(double e) {
        this.y = e;
    }
    public void setZ(double e) {
        this.z = e;
    }
}
