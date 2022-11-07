public class Vector3DArray {
    private final Vector3D []arr;
    public Vector3DArray(int n) { // конструктор по длине массива
        this.arr = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Vector3D.ZERO;
        }
    }
    public void print_vectorArr() { // выведение массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]: " + arr[i]);
        }
    }
    public double max_length() { // поиск наибольшей длины вектора
        double max = 0;
        for (Vector3D vector : arr) {
            if (max < vector.length()) {
                max = vector.length();
            }
        }
        return max;
    }
    public int search(Vector3D e) { // поиск вектора
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public Vector3D sum_arr() { // сумма всех векторов
        Vector3D sum = new Vector3D();
        for (Vector3D vector : arr) {
            sum = Vector3DProcessor.sum_vector(sum, vector);
        }
        return sum;
    }
    public Vector3D LK_arr(double k[]) { // линейная комбинация всех векторов, умноженных на коэфициэнты из k[]
        Vector3D lk = Vector3D.ZERO;
        if (arr.length != k.length) {
            return lk;
        }
        for (int i = 0; i < arr.length; i++) {
            lk = Vector3DProcessor.sum_vector(lk, Vector3DProcessor.mult_vector(arr[i], k[i]));
        }
        return lk;
    }
    public void shift_point(Point3D P) { // сдвиг точки на вектора
        Point3D[] arr_point = new Point3D[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_point[i] = new Point3D();
        }
        for (int i = 0; i < arr.length; i++) {
            arr_point[i].setX(P.getX() + arr[i].getX());
            arr_point[i].setY(P.getY() + arr[i].getY());
            arr_point[i].setZ(P.getZ() + arr[i].getZ());
        }
        System.out.print("Точки полученные сдвигом точки P на вектора из массива:\n");
        for (Point3D point : arr_point) {
            System.out.print(point + "\n");
        }
    }
    public int getN() { return arr.length; }
    public void setI(Vector3D e, int i) { this.arr[i] = e; }
    public Vector3D getI(int i) { return arr[i]; }
}
