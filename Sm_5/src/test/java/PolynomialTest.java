import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {
    @org.junit.jupiter.api.Test
    void PolynomialTest1() {
        double[] arr = { 1, 2, 9, -9, 7, 0, 7 };
        Polynomial xxx = new Polynomial(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], xxx.getI(i));
        }
    }
    @org.junit.jupiter.api.Test
    void degree() {
        double[] arr1 = { 1, 2, 9, -9, 7, 0, 7 };
        double[] arr2 = { 1, 2, 9, -9, 7, 0, 0 };
        double[] arr3 = { 0, 0, 0 };
        Polynomial xxx1 = new Polynomial(arr1);
        Polynomial xxx2 = new Polynomial(arr2);
        Polynomial xxx3 = new Polynomial(arr3);
        assertEquals(6, xxx1.degree());
        assertEquals(4, xxx2.degree());
        assertEquals(0, xxx3.degree());
    }

    @org.junit.jupiter.api.Test
    void calculation() {
        double[] arr1 = { 1, 2, 9, -9 };
        double[] arr2 = { 0, 0, 0 };
        double[] arr3 = { -3, 0, 0 };
        Polynomial xxx1 = new Polynomial(arr1);
        Polynomial xxx2 = new Polynomial(arr2);
        Polynomial xxx3 = new Polynomial(arr3);
        assertEquals(-5813, xxx1.calculation(9));
        assertEquals(1, xxx1.calculation(0));
        assertEquals(0, xxx2.calculation(5));
        assertEquals(-3, xxx3.calculation(5));
    }

    @org.junit.jupiter.api.Test
    void derivative() {
        double[] arr1 = { 1, 2, 9, -9 };
        double[] arr2 = { 0, 0, 0 };
        double[] arr3 = { -3, 0, 0 };
        Polynomial xxx1 = new Polynomial(arr1);
        Polynomial xxx2 = new Polynomial(arr2);
        Polynomial xxx3 = new Polynomial(arr3);
        assertEquals(-187, xxx1.derivative(3));
        assertEquals(2, xxx1.derivative(0));
        assertEquals(0, xxx2.derivative(3));
        assertEquals(0, xxx3.derivative(6));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        double[] arr1 = { 1, -2, 9, -9 };
        double[] arr2 = { 0, 0, 0 };
        double[] arr3 = { -3, 0, 0 };
        double[] arr4 = { 1, 0, 1 };
        double[] arr5 = { -8, -9 };
        Polynomial xxx1 = new Polynomial(arr1);
        Polynomial xxx2 = new Polynomial(arr2);
        Polynomial xxx3 = new Polynomial(arr3);
        Polynomial xxx4 = new Polynomial(arr4);
        Polynomial xxx5 = new Polynomial(arr5);
        assertEquals("-9.0x^(3)+9.0x^(2)-2.0x+1.0", xxx1.toString());
        assertEquals("", xxx2.toString());
        assertEquals("-3.0", xxx3.toString());
        assertEquals("x^(2)+1.0", xxx4.toString());
        assertEquals("-9.0x-8.0", xxx5.toString());
    }
}