package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10, 5, 0, -1, 30, 40, 15, 20, 20, 20, 20));

        // Arrays.sort(list);

        Collections.sort(list);
        System.out.println(list);//[-1, 0, 5, 10, 10, 15, 20, 20, 20, 20, 30, 40]

        Collections.reverse(list);
        System.out.println(list);//[40, 30, 20, 20, 20, 20, 15, 10, 10, 5, 0, -1]

        Collections.swap(list, 11, 0);
        System.out.println(list);//[-1, 30, 20, 20, 20, 20, 15, 10, 10, 5, 0, 40]

        Collections.replaceAll(list, 10, 20);
        System.out.println(list); //[-1, 30, 20, 20, 20, 20, 15, 20, 20, 5, 0, 40]

        int f = Collections.frequency(list, 20);
        System.out.println(f); //6

        System.out.println("-------------------------------------------");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));

        /*
        ArrayList<Character> uniques = new ArrayList<>();
        for (Character each : chars) {
            if(Collections.frequency(chars, each) == 1 ){
                uniques.add(each);
            }
        }
         */

        ArrayList<Character> uniques = new ArrayList<>( chars );
        uniques.removeIf( p ->  Collections.frequency(uniques, p ) != 1);
        System.out.println(uniques); //[B, D]


        System.out.println("----------------------------------------------");

        /*
        String str = "ABABABCDEEEE";
        String unique = "";
        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );
        for(String each : result){
            if(Collections.frequency(result, each) == 1){
                unique+= each;
            }
        }
        System.out.println(unique);
         */

        String str = "ABABABCDEEEE";

        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );
        result.removeIf(p -> Collections.frequency(result, p) != 1 );

        System.out.println(result);//[C, D]


        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max); //max = 40
        System.out.println("min = " + min); //min = -1


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10, 9, 9, 8, 7, 6,5,4,3,2,1));
        int firstMax = Collections.max(numbers);

        numbers.removeIf( p ->  p ==  Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf( p ->  p ==  Collections.max(numbers));
        int thirdMax = Collections.max(numbers);


        System.out.println("firstMax = " + firstMax);//firstMax = 10
        System.out.println("secondMax = " + secondMax); //secondMax = 9
        System.out.println("thirdMax = " + thirdMax); //thirdMax = 8






    }
}
