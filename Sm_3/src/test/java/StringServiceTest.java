import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringServiceTest {

    @Test
    void count() {
        String[] arr = { "absd", "acab", "666666", "fff", null, "aijnj" , ""};
        assertEquals(3, StringService.Count(arr, 'a'));
    }
    @Test
    void element() {
        String[] arr = { "absd", "666", "666", "fff", null, "aijnj", "666", "617", "" };
        assertEquals(3, StringService.Element(arr, "666"));
    }
    @Test
    void noCount() {
        String[] arr = { "absd", "666", "666", "fff666", null, "aijnj", "666", "617", "" };
        assertEquals(4, StringService.NoCount(arr, "666"));
    }
    @Test
    void oneElement() {
        String[] arr = { "absd", "666", "666", "fff666", null, "aijnj", "666d666", "617", "" };
        assertEquals(3, StringService.OneElement(arr, "666"));
    }
    /*@Test
    void plus() {
        String[] arr = { "ab", "66", "66", "ff6", null, "aj", "66", "617" };
        assertEquals(new String[]{"0ab", "166", "266", "3ff6", "4", "5aj", "666", "7617"}, StringService.Plus(arr));
    }*/



}