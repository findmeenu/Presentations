package RelationShipBetweenLamdasAndStreams;
import java.util.function.UnaryOperator;

public class LambdaExample {

    // Method that takes a lambda expression as an argument
    public static String manipulateString(String input,
                                          UnaryOperator<String> operation) {

        return operation.apply(input);
    }

    public static void main(String[] args) {
        // Define a lambda expression and pass it as an argument
        String result = manipulateString("hello", s -> s.toUpperCase());

        // Print the result
        System.out.println("Result: " + result);
    }
}



