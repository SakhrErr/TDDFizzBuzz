import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnFizzWhenInputIs3() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(5);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturn1WhenInputIs1() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void shouldReturn2WhenInputIs2() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(2);

        Assert.assertEquals("2", result);
    }

    @Test
    public void shouldReturnFizzWhenInputIs6() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(6);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs10() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(10);

        Assert.assertEquals("Buzz", result);
    }



}
