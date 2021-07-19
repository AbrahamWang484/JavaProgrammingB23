package day31_Recap;

import java.util.Arrays;

public class addElementToArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int num = 7;
        addElement(array,num);
    }

    public static void addElement(int[] array, int num){
        int[] copy=Arrays.copyOf(array,array.length+1);
        copy[array.length]=num;
        System.out.println(Arrays.toString(copy));
    }
}
/*
write a return method named addElement that can add an Integer  after the  last index of an integer array
 */
