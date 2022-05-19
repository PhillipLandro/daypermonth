import static org.junit.jupiter.api.Assertions.*;

class DayPerMonthTest {

    @org.junit.jupiter.api.Test
    void day30() {
        int days = DayPerMonth.dayPerMonth(Month.NOVEMBER, 2023);
        assertEquals(30, days);
    }

    @org.junit.jupiter.api.Test
    void day31() {
        int days = DayPerMonth.dayPerMonth(Month.JULY, 2023);
        assertEquals(31, days);
    }

    @org.junit.jupiter.api.Test
    void day29() {
        int days = DayPerMonth.dayPerMonth(Month.FEBRUARY, 2024);
        assertEquals(29, days);
        days = DayPerMonth.dayPerMonth(Month.FEBRUARY, 2020);
        assertEquals(29, days);
    }

    @org.junit.jupiter.api.Test
    void day28() {
        int days = DayPerMonth.dayPerMonth(Month.FEBRUARY, 2025);
        assertEquals(28, days);
    }

    @org.junit.jupiter.api.Test
    void monthIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DayPerMonth.dayPerMonth(null, 1582);
        });
        String expectedMessage = "Argument for @NotNull parameter 'month' of DayPerMonth.dayPerMonth must not be null";

        assertEquals(expectedMessage, exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void yearSmaller1581() {
        int days = DayPerMonth.dayPerMonth(Month.APRIL, 1580);
        assertEquals(0, days);
    }

    @org.junit.jupiter.api.Test
    void isMonthWith30Days() {
        assertTrue(DayPerMonth.isMonthWith30Days(Month.APRIL));
        assertFalse(DayPerMonth.isMonthWith30Days(Month.JANUARY));
    }
}