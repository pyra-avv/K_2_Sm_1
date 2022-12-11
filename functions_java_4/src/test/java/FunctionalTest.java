import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalTest {
    @Test
    void calculateSum() {
        SinF S0 = new SinF(0, 1, 7, -1);
        SinF S1 = new SinF(3, 1, 9, 1);
        LinearF L0 = new LinearF(0, -6, 9, 1);
        LinearF L1 = new LinearF(9, 3, 9, 1);
        ExpF E0 = new ExpF(0, -6, 9, 1);
        ExpF E1 = new ExpF(3, -6, 9, 1);
        RacF R0 = new RacF(0, 6, 0, 1, 9, 1);
        RacF R1 = new RacF(6, -6, 1, 3, 9, 1);
        Sum<IOneRealArgumentFunction> Sum = new Sum<>();
        assertEquals(0, Sum.calculate(S0));
        assertEquals(3 * Math.sin(9) + 3 * Math.sin(1) + 3 * Math.sin(5), Sum.calculate(S1));
        assertEquals(-18, Sum.calculate(L0));
        assertEquals(144, Sum.calculate(L1));
        assertEquals(-18, Sum.calculate(E0));
        assertEquals(3 * Math.exp(1) - 6 + 3 * Math.exp(9) - 6 + 3 * Math.exp(5) - 6, Sum.calculate(E1));
        assertEquals(18, Sum.calculate(R0));
        assertEquals(7, Sum.calculate(R1));
    }
}