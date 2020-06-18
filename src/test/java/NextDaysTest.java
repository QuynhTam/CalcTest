import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDaysTest {
    @Test
    void testAdd0And0() {
        int first = 29;
        int second = 2;
        int third = 2020;
        String expected = "1 3 2020";
        String result = NextDays.nextDay(first, second, third);
        assertEquals(expected, result);
    }
    @Test
    void testAdd0And1() {
        int first = 31;
        int second = 12;
        int third = 2018;
        String expected = "1 1 2019";
        String result = NextDays.nextDay(first, second, third);
        assertEquals(expected, result);
    }
}