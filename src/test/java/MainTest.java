import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void exec() {
        Rule normalRule = new NormalRule();
        FizzBuzz fizzBuzz = new FizzBuzz(normalRule);
        fizzBuzz.doFizzBuzz(1, 100);
        // System.out.println(fizzBuzz);

        Rule leapYearRule = new LeapYearRule();
        FizzBuzz fizzBuzz2 = new FizzBuzz(leapYearRule);
        fizzBuzz2.doFizzBuzz(1, 20);
        System.out.println(fizzBuzz2);
    }

    @Test
    void normalRule() {
        NormalRule normalRule = new NormalRule();
        String actual = normalRule.checkFizzBuzz(3);
        String actual2 = normalRule.checkFizzBuzz(5);
        String actual3 = normalRule.checkFizzBuzz(15);
        String actual4 = normalRule.checkFizzBuzz(2);

        assertEquals(actual, "Fizz");
        assertEquals(actual2, "Buzz");
        assertEquals(actual3, "FizzBuzz");
        assertEquals(actual4, "");
    }

    @Test
    void leapYearRule() {
        LeapYearRule leapYearRule = new LeapYearRule();
        String actual = leapYearRule.checkFizzBuzz(4);
        String actual2 = leapYearRule.checkFizzBuzz(100);
        String actual3 = leapYearRule.checkFizzBuzz(200);
        String actual4 = leapYearRule.checkFizzBuzz(400);

        assertEquals(actual, "うるう年です");
        assertEquals(actual2, "");
        assertEquals(actual3, "");
        assertEquals(actual4, "うるう年です");
    }
}
