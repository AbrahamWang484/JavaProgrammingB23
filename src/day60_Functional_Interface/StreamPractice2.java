package day60_Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args) {
        // map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println("-----------------------------");
        //filter: The filter method is used to select elements as per the Predicate passed as argument.
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("-----------------------------");
        // sorted: The sorted method is used to sort the stream.
        List<String> names1 = Arrays.asList("Reflection", "Collection", "Stream");
        List result1 = names1.stream().sorted().collect(Collectors.toList());
        System.out.println(result1);
        System.out.println("-----------------------------");
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);//[16, 4, 9, 25]

        System.out.println("-----------------------------");
        // demonstration of forEach method number=2,3,4,5
        number.stream().map(x->x*x).forEach(y->System.out.println(y));//4,9,16,25

        // demonstration of reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
