import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MainTest {

    @Test
    void name() {
        Rule normalRule = new NormalRule();
        FizzBuzz fizzBuzz = new FizzBuzz(normalRule);
        fizzBuzz.doFizzBuzz(1, 100);
        // System.out.println(fizzBuzz);

        Rule leapYearRule = new LeapYearRule();
        FizzBuzz fizzBuzz2 = new FizzBuzz(leapYearRule);
        fizzBuzz2.doFizzBuzz(1, 20);
        System.out.println(fizzBuzz2);
    }
}
