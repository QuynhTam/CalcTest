import static org.junit.jupiter.api.Assertions.*;

class NextDaysTest {
    public boolean isLeapYear(int year) {
        boolean result = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    result = true;
                }
            } else
                result = true;
        }
        return result;
    }

    public int nextDay(int day, int month, int year) {

        return 0;
    }
}