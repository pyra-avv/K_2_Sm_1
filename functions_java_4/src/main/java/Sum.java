public class Sum <T extends IOneRealArgumentFunction> implements Functional<T> {
//    private double a;
//    private double b;
//    public Sum(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
    public Sum() {
    }
    @Override
    public double calculate(T func) {
//        if (a < func.getLeft() || b > func.getRight()) throw new IllegalArgumentException();
        return func.getValue(func.getRight()) + func.getValue(func.getLeft()) +
                func.getValue((func.getRight() + func.getLeft()) / 2);
    }
}
