package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {
        //1. write a program that can swap the first and last elements of an ArrayList
        String[] names = {"Esraa", "Sabir", "Raphael", "Mousa"};

        ArrayList<String> students = new ArrayList<>( );
        students.addAll( Arrays.asList(names ) );

        System.out.println(students);

        Collections.swap(students, 0, students.size() -1 );

        System.out.println(students);

        System.out.println("-------------------------------------------------");
        //2. write a program that can return the first unique element of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9,10));

        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf( p -> Collections.frequency(uniques, p) != 1 );
        int firstUnique = uniques.get(0);

        System.out.println(uniques);
        System.out.println("firstUnique = " + firstUnique);

        /*
        int firstUnique = 0;
        for (Integer each : list) {
            if( Collections.frequency(list, each) == 1){
                firstUnique = each;
                break;
            }
        }
         */



        System.out.println("---------------------------------------------------------------");
        //3. write a program that can find the frequency of character from a String
        String str = "AABBCCDDEECCCDDDDDDDE";
        String result = ""; //A2B2C2D2E2

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList( str.split("") ) );

        for (String each : StringUtility.removeDup(str).split("")) { //each:  A, B, C, D, E
            int frequency = Collections.frequency(list2, each);           //  2  2  2  2  2
            result += each + frequency;
        }

        System.out.println(list2);
        System.out.println(result);

        System.out.println("---------------------------------------------------------------");
    // Write a program that can return the nth largest number from an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        ArrayList<Integer> original = new ArrayList<>(numbers);

        // Collections.sort(numbers); //asc
        // Collections.reverse(numbers); // desc

        // 5th maximum number:
        int n = 5;
        for (int i = 1; i < n ; i++) {
            numbers.removeIf( p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("fifthMaxNumber = " + fifthMaxNumber);







    }


}
/*
warmup tasks:
	1. write a program that can swap the first and last elements of an ArrayList
	2. write a program that can return the first unique element of an ArrayList
	3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
	4. Write a program that can return the nth largest number from an ArrayList of integers
 */