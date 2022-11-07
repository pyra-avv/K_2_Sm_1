import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private final double [][]arr;

    public Matrix(int xM, int yM) {
        this.arr = new double[xM][yM];
        for (double[] doubles : arr) {
            Arrays.fill(doubles, 0);
        }
    }
    public void print_matrix() {
        for (double[] doubles : arr) {
            for (double aDouble : doubles) {
                System.out.printf("%f ", aDouble);
            }
            System.out.print("\n");
        }
    }
    public int getX() { return arr.length; }
    public int getY() { return arr[0].length; }
    public double getIJ(int i, int j) {
        return arr[i][j];
    }
    public void setIJ(double e, int i, int j) { this.arr[i][j] = e; }



}
