import java.util.Scanner;

public class Point3D {
    private double x;
    private double y;
    private double z;
    public Point3D() { // конструктор по умолчанию
        x = 0;
        y = 0;
        z = 0;
    }
    public Point3D(double xP, double yP, double zP) { // конструктор по параметрам
        x = xP;
        y = yP;
        z = zP;
    }
    @Override
    public String toString() {
        return " ( " + x + ", " + y + ", " + z + " )" + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 && Double.compare(point3D.y, y) == 0 && Double.compare(point3D.z, z) == 0;
    }
    public double distans(Point3D b) {
        if (equals(b)) return 0;
        else return Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2) + Math.pow(b.z - z, 2));
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