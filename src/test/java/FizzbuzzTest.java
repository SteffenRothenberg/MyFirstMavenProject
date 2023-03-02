import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void whenDividibleByThreeAndNotByFiveThenReturnsFizz() {
        //GIVEN
        int i = 3;

        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);

        //THEN
        assertEquals("Fizz", result);

    }

    @Test
    void whenDividibleByFiveAndNotByThreeThenReturnsBuzz() {
        //GIVEN
        int i = 5;

        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);

        //THEN
        assertEquals("Buzz", result);

    }

    @Test
    void whenGivenFifteenThenReturnFizzBuzz() {
        //GIVEN
        int i = 15;

        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);

        //THEN
        assertEquals("FizzBuzz", result);
    }

    @Test
    void whenGiven11ThenReturn11() {
        //GIVEN
        int i = 11;

        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);

        //THEN
        assertEquals(Integer.toString(i), result);
    }
}