package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice3 {


    public static void main(String[] args) {

        String str = "AAABBBBBCCCCCDDDDDDDDDDDDDDDEEEEEEEEEEEEEFFFFFFFFFFFFFF";
        String[] arr = str.split("");
        char[] arr2 = str.toCharArray();

        System.out.println(Arrays.toString(arr));//[A, A, A, B, B, B, B, B, C, C, C, C, C, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, E, E, E, E, E, E, E, E, E, E, E, E, E, F, F, F, F, F, F, F, F, F, F, F, F, F, F]
        System.out.println(Arrays.toString(arr2));//[A, A, A, B, B, B, B, B, C, C, C, C, C, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, E, E, E, E, E, E, E, E, E, E, E, E, E, F, F, F, F, F, F, F, F, F, F, F, F, F, F]

        String result = removeDuplicates(str);

        System.out.println(result); //ABCDEF


    }


    public static String  removeDuplicates(String str){  //"AABBBBCCCCCC"
        String result = "";  //"ABC"

        for(String each  : str.split("") ) {     //{"A", "A"....."C"}
            if(!result.contains(each)){ // if the character is not conatined in the result
                result += each;  // add the character to the result
            }
        }

        return result;
    }


}

/*
removeDuplicates:
        "AABBBBCCCCCC"
        "ABC"
isAnagram:
    create a function that can check if two strings are anagram, return true if they are anagram
    isAnagram("listen", "silent") ===> true
    isAnagram("Java", "C#")   ===> false
 */