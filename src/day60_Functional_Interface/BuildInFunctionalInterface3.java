package day60_Functional_Interface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import static day40_CustomClass_Statics.StaticBlocks.list;

public class BuildInFunctionalInterface3 {
    public static void main(String[] args) {
        //create a funciton for anagram strings
        BiPredicate<String,String> anagram=(a,b)->{
            char[] ch1=a.toCharArray();
            char[] ch2=b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1,ch2);
        };
        boolean r1= anagram.test("abc","bac");
        System.out.println(r1);

        System.out.println("-----------------------");
        //Create a function to check the array contains the specific element or not
        BiPredicate<int[],Integer> contains=(arr,n)->{
            for (int each : arr) {
                if (each==n)
                    return true;
            }
            return false;
        };
        int[] arr ={1,2,3,4,5};
        boolean r2=contains.test(arr,3);
        System.out.println(r2);

        System.out.println("---------------------");
        //create a function that can merge two Arrays into one ArrayList
        BiFunction<Integer[],Integer[], List<Integer>> merge2Arrto1List=(
                arr1,arr2
        )->{
            List<Integer> list= new ArrayList<>();
            list.addAll(Arrays.asList(arr1));
            list.addAll(Arrays.asList(arr2));
            return list;
        };
        System.out.println(merge2Arrto1List.apply(new Integer[]{1, 2, 3, 4},new Integer[]{2, 3, 4, 5}));
    //create Map from arrays of Strings and Integers
        BiFunction<List<String>,List<Integer>, Map<String,Integer>> addListsToMap =(a,b)->{
            Map<String,Integer> m=new LinkedHashMap<>();
            for (int i = 0; i < a.size(); i++) {
                m.put(a.get(i),b.get(i));
            }
            return m;
        };
        List<String> name=new ArrayList<>(Arrays.asList("Oz","Wang","Ivan")) ;
        List<Integer> age=new ArrayList<>(Arrays.asList(33,11,55)) ;
        Map<String,Integer>employees =addListsToMap.apply(name,age);
        System.out.println(employees);

        System.out.println("-------------------------------");
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        //nums.forEach(p-> System.out.println(p));
        nums.forEach(System.out::println);
/*
Notice the double colons :: . These signal to the Java compiler that this is a method reference.
The method referenced is what comes after the double colons.
 Whatever class or object that owns the referenced method comes before the double colons.
 */

    }
}

