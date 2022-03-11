public class FizzBuzz {

    public static String fizzBuzzPrint(int i) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        StringBuilder result = new StringBuilder();

        for(int j = 1; j <= i; j++) {
            result.append(String.format("%d => %s", j, fizzBuzzConverter.convert(j)));
            if( i != j ) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
