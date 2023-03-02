import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SmallerThanZeroTest {

    @Test
    void smallerThanZero(){
        //GIVEN
        int i = 1;

        //WHEN
        boolean result = SmallerThanZero.smallerThanZero(i);

        //THEN
        assertFalse(result);
    }

}
