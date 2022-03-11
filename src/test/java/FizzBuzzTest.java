import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1WhenInputIs1() {

        String result = FizzBuzz.fizzBuzzPrint(1);

        Assert.assertEquals("1 => 1", result);
    }

    @Test
    public void shouldReturn12FizzWhenInputIs3() {

        String result = FizzBuzz.fizzBuzzPrint(3);

        String expectedValue = "1 => 1\n" + "2 => 2\n" + "3 => Fizz";

        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn12Fizz4BuzzWhenInputIs5() {

        String result = FizzBuzz.fizzBuzzPrint(5);

        String expectedValue =  "1 => 1\n" +
                                "2 => 2\n" +
                                "3 => Fizz\n" +
                                "4 => 4\n" +
                                "5 => Buzz";

        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIs15() {
        String result = FizzBuzz.fizzBuzzPrint(15);

        String expectedValue = "1 => 1\n" +
                "2 => 2\n" +
                "3 => Fizz\n" +
                "4 => 4\n" +
                "5 => Buzz\n" +
                "6 => Fizz\n" +
                "7 => 7\n" +
                "8 => 8\n" +
                "9 => Fizz\n" +
                "10 => Buzz\n" +
                "11 => 11\n" +
                "12 => Fizz\n" +
                "13 => 13\n" +
                "14 => 14\n" +
                "15 => FizzBuzz";

        Assert.assertEquals(expectedValue, result);
    }

}
