package day29_ReturnMethods;

import java.util.Arrays;

public class warmup {
    public static void main(String[] args) {
        posOrNegOrZero(9);
        combinationTwoArrays(new int[]{1, 2, 3}, new int[]{2, 3, 4});
        fullNameInRegularFormat("YULIANG","WANG");
        printMaxNumber(3, 6);
        int[] array={1,2,3,4,5};
        printDescendingArray(array);
    }
    public static void posOrNegOrZero(int number){
        if(number>0){
            System.out.println("postive");
        }else if (number<0){
            System.out.println("negative");
        }else if (number==0){
            System.out.println("zero");
        }
    }
    public static void combinationTwoArrays(int[] array1, int[] array2){
        int[] array3= new int[array1.length+ array2.length];
        int i=0;
        for (int each : array1) {
            array3[i]=each;
            i++;
        }
        for (int each : array2) {
            array3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(array3));
    }
    public static void fullNameInRegularFormat(String firstName, String lastName){
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);
    }
    public static void printMaxNumber(int num1, int num2){
        System.out.println((num1> num2 ? num1:num2)+ " is max number");
    }
    public static void printDescendingArray(int[] array){  // descending

        Arrays.sort(array);
        int[] result=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--, j++) {
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order
 */