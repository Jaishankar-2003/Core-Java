package lambda_stream_exp;

import java.util.Arrays;
import java.util.List;

public class lambda_ex1
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anu", "Bala", "Arun", "Vikram", "Ajay");

        names.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.forEach(n -> System.out.print(n)); //Lambda = function without a name.

// Streams are like a conveyor belt for data — you send your list into a stream and perform operations like filter, map, sort, count, etc., without writing loops manually.


        List<Integer> nums = List.of(2, 5, 8, 10, 3, 7);
        // Filter even numbers and print
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


    }
}
