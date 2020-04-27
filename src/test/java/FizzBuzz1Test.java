import org.junit.Test;
import test1.FizzBuzz1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class FizzBuzz1Test {
    @Test
    public void fizzBuzzTest() {
        FizzBuzz1 fizzBuzz1 = new FizzBuzz1();
        assertEquals("1",fizzBuzz1.valueOf(1));
        assertEquals("Fizz",fizzBuzz1.valueOf(3));
        assertEquals("Buzz",fizzBuzz1.valueOf(5));
        assertEquals("FizzBuzz",fizzBuzz1.valueOf(15));
    }
    @Test
    public void fizzBuzzNewQueryTest() {
        FizzBuzz1 fizzBuzz1 = new FizzBuzz1();
        assertEquals("Fizz",fizzBuzz1.valueOf(13));
    }
}
