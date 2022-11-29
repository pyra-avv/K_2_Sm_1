public class Polynomial {
    private final double[] coefficient;
    public Polynomial(double[] arr) { // Конструктор (по массиву коэффициентов)
        this.coefficient = new double[arr.length];
        System.arraycopy(arr, 0, coefficient, 0, arr.length);
    }
    public int degree() { // Получить степень
        for (int i = coefficient.length - 1; i >= 0; i--) {
            if (coefficient[i] != 0) {
                return i;
            }
        }
        return 0;
    }
    public double calculation(double x) { // Вычислить значение при заданном x
        double s = 0;
        for (int i = 0; i < coefficient.length; i++) {
            s += Math.pow(x, i) * coefficient[i];
        }
        return s;
    }
    public double derivative(double x) { // Вычислить значение производной при заданном x
        double s = 0;
        for (int i = 1; i < coefficient.length; i++) {
            s += Math.pow(x, i - 1) * coefficient[i] * i;
        }
        return s;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (degree() > 1) {
            for (int i = coefficient.length - 1; i >= 2; i--) {
                if (coefficient[i] != 0) {
                    if (coefficient[i] != 1) {
                        str.append(coefficient[i]);
                    }
                    str.append("x^(").append(i).append(")+");
                }
                if (coefficient[i - 1] < 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            }
        }
        if (coefficient[1] != 0) {
            if (coefficient[1] != 1) {
                str.append(coefficient[1]);
            }
            str.append("x");
            if (coefficient[0] >= 0) {
                str.append("+");
            }
        }
        if (coefficient[0] != 0) {
            str.append(coefficient[0]);
        }
        return str.toString();
    }
    public double getI(int i) {
        return coefficient[i];
    }
}
class SquareTrinomial extends Polynomial {
    public SquareTrinomial(double a, double b, double c) { // Конструктор по коэффициентам
        super(new double[] { c, b, a });
        if (a == 0) {
           throw new IllegalArgumentException("a == 0");
        }
    }
    public double[] EquationRoots() { // Вычислить корни
        double D = Discriminant();
        if (D < 0) {
            throw new IllegalArgumentException("Нет действительных корней");
        }
        if (D == 0) {
            return new double[] { -getB() / (getA() * 2.) };
        }
        return new double[] { (-getB() - Math.sqrt(D))/ (getA() * 2.), (-getI(1) + Math.sqrt(D))/ (getA() * 2.) };
    }
    public double Discriminant() { // Вычислить дискриминант
        return getB() * getB() - 4 * getA() * getC();
    }
    public String Multipliers() { // Разложение на множители
        double[] x = EquationRoots();
        if (x.length == 1) {
            if (x[0] == 0) {
                return "x^(2)";
            }
            if (x[0] < 0) {
                return "(x+" + -x[0] + ")^(2)";
            }
            return "(x" + -x[0] + ")^(2)";
        }
        if (x[1] == 0) {
            if (x[0] < 0) {
                return "x(x+" + -x[0] + ")";
            }
            return "x(x" + -x[0] + ")";
        }
        if (x[0] == 0) {
            if (x[1] < 0) {
                return "x(x+" + -x[1] + ")";
            }
            return "x(x" + -x[1] + ")";
        }
        if (x[1] < 0) {
            if (x[0] < 0) {
                return "(x+" + -x[0] + "(x+" + -x[1] + ")";
            }
            return "(x" + -x[0] + "(x+" + -x[1] + ")";
        }
        if (x[0] < 0) {
            return "(x+" + -x[0] + "(x" + -x[1] + ")";
        }
        return "(x" + -x[0] + "(x" + -x[1] + ")";
    }
    public double getA() {
        return getI(2);
    }
    public double getB() {
        return getI(1);
    }
    public double getC() {
        return getI(0);
    }
}

