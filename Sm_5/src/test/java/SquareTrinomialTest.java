import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTrinomialTest {
    @Test
    void SquareTrinomialTest1() {
        SquareTrinomial a = new SquareTrinomial(3, 8, 0);
        assertEquals(3, a.getA());
        assertEquals(8, a.getB());
        assertEquals(0, a.getC());
    }

    @Test
    void equationRoots() {
        SquareTrinomial a = new SquareTrinomial(1, -4, 4);
        SquareTrinomial b = new SquareTrinomial(1, -6, 5);
        assertArrayEquals(new double[]{ 2 }, a.EquationRoots());
        assertArrayEquals(new double[]{ 1, 5 }, b.EquationRoots());
    }

    @Test
    void discriminant() {
        SquareTrinomial a = new SquareTrinomial(1, -4, 4);
        SquareTrinomial b = new SquareTrinomial(1, -6, 5);
        assertEquals(0, a.Discriminant());
        assertEquals(16, b.Discriminant());
    }
    @Test
    void multipliers() {
        SquareTrinomial a = new SquareTrinomial(1, -4, 4); // 2
        SquareTrinomial b = new SquareTrinomial(1, -6, 5); // 1 5
        SquareTrinomial c = new SquareTrinomial(6, 0, 0); // 0
        SquareTrinomial d = new SquareTrinomial(1, 4, 0); // 0 -4
        Polynomial[] arrA = { new Polynomial(new double[] { 2, 1 }), new Polynomial(new double[] { 2, 1 }) };
        Polynomial[] arrB = { new Polynomial(new double[] { 1, 1 }), new Polynomial(new double[] { 5, 1 }) };
        Polynomial[] arrC = { new Polynomial(new double[] { 0, 0, 1 }) };
        Polynomial[] arrD = { new Polynomial(new double[] { -4, 1 }), new Polynomial(new double[] { 0, 1 }) };
        assertArrayEquals(arrA, a.Multipliers());
        assertArrayEquals(arrB, b.Multipliers());
        assertArrayEquals(arrC, c.Multipliers());
        assertArrayEquals(arrD, d.Multipliers());
    }
}