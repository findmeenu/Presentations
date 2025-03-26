package RelationShipBetweenLamdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Examples of terminal operations");
        System.out.println();

        System.out.println("Example, forEach");
        List<String> words = Arrays.asList("Ahmed", "is", "best");
        words.stream().forEach(System.out::println);
        System.out.println("");

        System.out.println("Example, collect");
        List<String> animals = Arrays.asList("LION", "ZEBRA", "ELEPHANT");
        List<String> collectedList = animals.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(collectedList);
        System.out.println("");

        System.out.println("Example reduce");
        List<Integer> Valuesnum = Arrays.asList(1, 2, 3, 4, 5);
        int sum = Valuesnum.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("");


        // Examples of intermediate operations
        System.out.println("Examples of intermediate operations");
        // Example(1) Filter
        System.out.print("Example of a filter");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("\n " + evenNumbers);
        // Example(2) Map
        System.out.print("\n Example of a Map");
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        List<Integer> wordLengths = fruits.stream()
                .map(String::length) // calculates the length of each word
                .collect(Collectors.toList());
        System.out.print("\n "+ wordLengths);
        // Example (3) FlatMap
        System.out.println("\n\n Example of FlatMAp");
        List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6));
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(" " + flattenedList);

        System.out.println();




    }
}


