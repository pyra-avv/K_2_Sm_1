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
    }
}