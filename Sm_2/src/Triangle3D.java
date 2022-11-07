public class Triangle3D {
    private Point3D a;
    private Point3D b;
    private Point3D c;
    public Triangle3D(Point3D aT, Point3D bT, Point3D cT) {
        if (Pr(aT, bT, cT)) {
            Point3D aO = new Point3D(1, 0, 0);
            Point3D bO = new Point3D(0, 1, 0);
            Point3D cO = new Point3D(0, 0, 1);
            this.a = aO;
            this.b = bO;
            this.c = cO;
        } else {
            this.a = aT;
            this.b = bT;
            this.c = cT;
        }
    }
    @Override
    public String toString() { return " {\n" + a + "," + b + "," + c + " }\n"; }
    public double P() {
        return a.distans(b) + c.distans(a) + b.distans(a);
    }
    public double S() {
        double p = P()/2;
        double k = p * (p - a.distans(b)) * (p - c.distans(a)) * (p - b.distans(a));
        return Math.sqrt(k);
    }
    public Point3D M() {
        return new Point3D((a.getX() + b.getX() + c.getX()) / 3,
                (a.getY() + b.getY() + c.getY()) / 3,
                (a.getZ() + b.getZ() + c.getZ()) / 3);
    }
    /*public Triangle3D turn(double corner) {
        return new Triangle3D();
    }*/
    public boolean Pr(Point3D aT, Point3D bT, Point3D cT) {
        return (aT.distans(bT) == cT.distans(aT) + bT.distans(aT)) ||
                (cT.distans(aT) == aT.distans(bT) + bT.distans(aT)) ||
                (bT.distans(aT) == aT.distans(bT) + cT.distans(aT));
    }
}
