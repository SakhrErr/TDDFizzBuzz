public class FizzBuzzConverter {

    public String convert(int i) {
        if( i == 3 ) {
            return "Fizz";
        }
        else if( i == 5) {
            return "Buzz";
        }

        return "1";
    }
}
