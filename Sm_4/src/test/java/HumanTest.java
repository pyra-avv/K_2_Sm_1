import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HumanTest {
    @Test
    void HumanTest1() {
        Human a = new Human();
        Data aa = new Data();
        Human b = new Human("Петрович", "Василий", "Иванович", aa);
        assertEquals("Иван", a.getName());
        assertEquals("Иванов", a.getSurname());
        assertEquals("Иванович", a.getPatronymic());
        assertEquals(aa, a.getBirth());
        assertEquals("Петрович", b.getName());
        assertEquals("Василий", b.getSurname());
        assertEquals("Иванович", b.getPatronymic());
        assertEquals(aa, b.getBirth());
    }
}