package bai8.thuchanh;

import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void  testFizz3(){
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz5(){
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.FizzBuzz(number);
        assertEquals(expected, result);
    }
}
