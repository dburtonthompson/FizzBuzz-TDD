package FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test() {

    }

    @Test

    public void shouldProcessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        // String output = fizzBuzz.processNumber(1);
        assertEquals("1", fizzBuzz.processNumber(1));
        assertEquals("2", fizzBuzz.processNumber(2));
    }
}