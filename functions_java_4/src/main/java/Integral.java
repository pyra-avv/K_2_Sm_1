public class Integral <T extends IOneRealArgumentFunction> implements Functional<T>{
    private double a;
    private double b;
    public Integral(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculate(T func) throws IllegalArgumentException {
        if (a < func.getLeft() || b > func.getRight()) throw new IllegalArgumentException();
        int n = 100;
        double I = 0.0;
        double d = Math.abs(b - a) / n;

        for (int i = 0; i < n; i++) {
            I += func.getValue(a + i * d + d / 2) * d;
        }
        return I;
    }
}
