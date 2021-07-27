package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,-3,4,-5,6,-7,1,1,1,2,3,4,4,5,5));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list); //descending order
        System.out.println(list);

        Collections.swap(list,0,2);
        System.out.println(list);

        Collections.replaceAll(list, -7 ,0);
        System.out.println(list);

        int frequency = Collections.frequency(list,1);
        System.out.println(frequency);

        System.out.println("------------");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','B','B','C','V','D','S'));
        ArrayList<Character> uniques = new ArrayList<>(chars);
        uniques.removeIf(p -> Collections.frequency(uniques,p) !=1);
//        //method 1
//        for (Character each : chars) {
//            if (Collections.frequency(chars,each) ==1){
//                uniques.add(each);
//            }
//        }
        System.out.println(uniques);

        System.out.println("----------------------");

        String str ="AABABABBCCCDDDEEFF";
        String unique="";

        ArrayList<String> result  = new ArrayList<>(Arrays.asList(str.split("")));
//        for (String each : result) {
//            if (Collections.frequency(result,each)==1){
//                unique+=each;
//            }
//        }
        result.removeIf(p -> Collections.frequency(result,p) !=1);
        System.out.println(unique);

        System.out.println("------------------------------");

        int max =Collections.max(list);
        int min =Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,9,6,6,6,5,5,4,4,4));
        int firstMax =Collections.max(numbers);
        numbers.removeIf(p -> p== Collections.max(numbers));

        int secondMax = Collections.max(numbers);
        numbers.removeIf(p -> p== Collections.max(numbers));

        int thirdMax = Collections.max(numbers);

        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);





    }
}
