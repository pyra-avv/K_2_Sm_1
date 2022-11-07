import java.util.Objects;
import java.util.Scanner;

public class Point3D {
    private double x;
    private double y;
    private double z;
    public Point3D() { // конструктор по умолчанию
    }
    public Point3D(double xP, double yP, double zP) { // конструктор по параметрам
        x = xP;
        y = yP;
        z = zP;
    }
    @Override
    public String toString() {
        return "point { " + x + ", " + y + ", " + z + " }" + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 && Double.compare(point3D.y, y) == 0 && Double.compare(point3D.z, z) == 0;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
}
