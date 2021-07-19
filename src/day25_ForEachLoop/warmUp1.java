package day25_ForEachLoop;

import java.util.Arrays;

public class warmUp1 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};
        // ["avaJ", "nohtyP", "#C"]
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) { //i : index number of the array(Starting from 0)
            String element = array[i], temp = "";
            for (int j = array[i].length() - 1; j >= 0; j--) { //index numbers of the String
                temp += element.charAt(j); //get the characters from the string element
            }//concatenate  with last letter first == assign the index 0 first
            reversed[i] = temp;  //assigning reversed element to the index of the array
        }
        System.out.println(Arrays.toString(reversed));


    }

}


/*
1. write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"};

            output:
                ["avaJ", "nohtyP", "#C"]
 */