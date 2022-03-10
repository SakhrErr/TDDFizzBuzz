import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzShouldReturn12FizzWhenValue3() {

        String result = FizzBuzz.printList(3);
        String expectedValue = String.format(
                "1 => 1\n" +
                "2 => 2\n" +
                "3 => Fizz\n"
        );

        Assert.assertEquals(expectedValue, result);
    }

}
