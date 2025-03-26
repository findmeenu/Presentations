package RelationShipBetweenLamdasAndStreams;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfSquaresComparison {
    public static void main(String[] args) {
        // Generate a list of random integers
        List<Integer> numbers = generateRandomList(100_000_000);

        // Measure the running time of Streams/Lambdas approach
        long startTimeStreams = System.currentTimeMillis();
        long sumStreams = calculateSumOfSquaresStreams(numbers);
        long endTimeStreams = System.currentTimeMillis();
        System.out.println("Sum using Streams: " + sumStreams);
        System.out.println("Time taken using Streams: " +
                (endTimeStreams - startTimeStreams) + " milliseconds");

        // Measure the running time of Traditional approach
        long startTimeTraditional = System.currentTimeMillis();
        long sumTraditional = calculateSumOfSquaresTraditional(numbers);
        long endTimeTraditional = System.currentTimeMillis();
        System.out.println("Sum using Traditional approach: " + sumTraditional);
        System.out.println("Time taken using Traditional approach: " +
                (endTimeTraditional - startTimeTraditional) + " milliseconds");
    }

    // Generate a list of random integers
    private static List<Integer> generateRandomList(int size) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(1000));
        }
        return randomList;
    }

    // Calculate the sum of squares of even numbers using Streams/Lambdas
    private static long calculateSumOfSquaresStreams(List<Integer> numbers) {
        long result =  numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToLong(n -> (long) n * n)
                .sum();
        return result;
    }

    // Calculate the sum of squares of even numbers using a traditional approach
    private static long calculateSumOfSquaresTraditional(List<Integer> numbers) {
        long sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += (long) n * n;
            }
        }
        return sum;
    }
}


