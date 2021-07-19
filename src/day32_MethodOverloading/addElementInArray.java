package day32_MethodOverloading;

import java.util.Arrays;

public class addElementInArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        double[] array1= {1.1,1.2,1.3,1.4};
        String[] array2={"apple","banana","orange","cucumber"};
        char[] array3={'a','b','c'};

        array=addElement(array,6);
        System.out.println(Arrays.toString(array));
        array1=addElement(array1,1.6);
        System.out.println(Arrays.toString(array1));
        array2=addElement(array2,"pineApple");
        System.out.println(Arrays.toString(array2));
        array3=addElement(array3,'d');
        System.out.println(Arrays.toString(array3));
    }
    public static int[] addElement(int[] array, int num){
        int[] copied=Arrays.copyOf(array, array.length+1);
        copied[copied.length-1]=num;
        return copied;
    }
    public static double[] addElement(double[] array, double num){
        double[] copied=Arrays.copyOf(array, array.length+1);
        copied[copied.length-1]=num;
        return copied;
    }
    public static String[] addElement(String[] array, String str){
        String[] copied=Arrays.copyOf(array, array.length+1);
        copied[copied.length-1]=str;
        return copied;
    }
    public static char[] addElement(char[] array, char ch){
        char[] copied=Arrays.copyOf(array, array.length+1);
        copied[copied.length-1]=ch;
        return copied;
    }


//    public static String[] addElementInArray1(int[] array, int num){
//        int[] newArray=new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i]=array[i];
//        }
//        newArray[array.length]=num;
//        return newArray;
//    }
}
/*
1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array
 */