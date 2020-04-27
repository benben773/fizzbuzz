import org.junit.Test;
import test1.FizzBuzz1;

import static org.junit.Assert.assertEquals;

public class FizzBuzz1Test {
    @Test
    public void fizzBuzzTest() {
        FizzBuzz1 fizzBuzz1 = new FizzBuzz1();
        assertEquals(fizzBuzz1.valueOf(1),"1");
        assertEquals(fizzBuzz1.valueOf(3),"Fizz");
    }
}
