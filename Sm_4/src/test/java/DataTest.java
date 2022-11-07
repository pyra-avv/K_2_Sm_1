import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DataTest {
    @Test
    public void DataTest1() {
        Data a = new Data();
        Data b = new Data(1, "январь", 1000);
        Data c = new Data(31, "сентябрь", 2000);
        Data d = new Data(29, "февраль", 2001);
        Data e = new Data(-3, "февраль", 2001);
        Data f = new Data(23, 3, 2001);
        Data g = new Data(23, 30, 2001);
        assertEquals(1970, b.getYear());
        assertEquals(30, c.getDey());
        assertEquals(1, e.getDey());
        assertEquals(28, d.getDey());
        assertEquals("март", f.getMonth());
        assertEquals("январь", g.getMonth());
    }
}