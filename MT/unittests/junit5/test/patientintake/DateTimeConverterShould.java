package patientintake;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DateTimeConverter should")
class DateTimeConverterShould {


    @Nested
    @DisplayName("convert string with 'today' keyword")
    class TodayTests {
        @Test
       // @Disabled
        @DisplayName("correctly")
        void convertTodayStringCorrectly(){
            LocalDate today = LocalDate.of(2024, 1, 6);
            LocalDateTime result = DateTimeConverter.convertStringToDateTime("today 1:00 pm",
                    today);
            assertEquals(result, LocalDateTime.of(2024, 1, 6, 13, 0),
                    () -> "Failed to convert 'today' string to expected date time, today passed was: " +today);
        }
        @Tag("dateTime")
        @Test
        @DisplayName("regardless of case")
        void convertTodayStringCorrectlyCaseInsensitive(){
            LocalDate today = LocalDate.of(2024, 1, 6);
            LocalDateTime result = DateTimeConverter.convertStringToDateTime("ToDay 1:00 pm",
                    today);
            assertEquals(result, LocalDateTime.of(2024, 1, 6, 13, 0),
                    () -> "Failed to convert 'today' string to expected date time, today passed was: " +today);
        }
    }

    @Test
    @DisplayName("convert expected date time pattern ins string correctly")
    void convertCorrectPatternToDateTime(){
        LocalDateTime result = DateTimeConverter.convertStringToDateTime("1/6/2024 1:00 pm",
                LocalDate.of(2024,1,6));
        assertEquals(result, LocalDateTime.of(2024, 1, 6, 13, 0));
    }

    @Test
    @DisplayName("throw exception if entered pattern to string is incorrect")
    void throwExceptionIfIncorrectPatternProvided() {
        Throwable error = assertThrows(RuntimeException.class, () ->
                DateTimeConverter.convertStringToDateTime("1/6/2024 100 pm",
                        LocalDate.of(2024, 6, 1)));
    assertEquals("Unable to create date time from: [1/6/2024 100 pm], " +
            "please enter with format [M/d/yyyy h:mm a], Text '1/6/2024 100 PM' " +
            "could not be parsed at index 12", error.getMessage() );
    }
}
