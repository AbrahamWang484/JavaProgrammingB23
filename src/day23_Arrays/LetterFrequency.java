package day23_Arrays;

public class LetterFrequency {
    public static void main(String[] args) {
        String str= "aabcccd";
        int count=0;
        char input='a';

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);//find the each letter
            if (ch==input){ //for char, we cannot use class methods,  only use operator == to find the char
                count ++;
            }
        }
        System.out.println("count: "+count);
    }
}
/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str ="aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */
