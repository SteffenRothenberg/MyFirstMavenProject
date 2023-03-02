import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void checkAddition() {
        //given
        int correct1 = 10;
        int correct2 = 5;
        //when
        int actual = Main.addition(correct1, correct2);
        //then
        assertEquals(15, actual);
    }


    @Test
    void checkisBiggerThanHundred() {
        //GIVE
        int value1 = 15;
        int value2 = 20;

        //WHEN
        boolean result = Main.isBiggerThanHundred(value1 * value2);

        //THEN
        assertEquals(true, result);

    }
}

