import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {
    @Test
    void adults() {
        Human a = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2000));
        Human b = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2005));
        Human c = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2003));
        Human d = new Human("Петрович", "Василий", "Иванович",
                new Data(5, 12, 2000));
        Human e = new Human("Петрович", "Василий", "Иванович",
                new Data(25, 12, 2000));
        Human[] arr = { a, b, c, d, e };
        assertArrayEquals(new Human[] { a, d, e }, HumanService.Adults(arr, new Data(5, 12, 2020)));
    }
    @Test
    void arrAge() {
        Human a = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2000));
        Human b = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2005));
        Human c = new Human("Петрович", "Василий", "Иванович",
                new Data(1, 12, 2003));
        Human d = new Human("Петрович", "Василий", "Иванович",
                new Data(5, 12, 2000));
        Human e = new Human("Петрович", "Василий", "Иванович",
                new Data(25, 12, 2000));
        Human[] arr = { a, b, c, d, e };
        assertArrayEquals(new int[] { 20, 15, 17, 20, 19 },
                HumanService.ArrAge(arr, new Data(5, 12, 2020)));

    }
}