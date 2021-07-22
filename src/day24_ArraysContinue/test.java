package day24_ArraysContinue;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String word1="iceman";
        String word2="manice";
        String[] arr1=word1.toLowerCase().split("");
        String[] arr2=word2.toLowerCase().split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
