package day24_ArraysContinue;

import java.util.Arrays;

public class toCharArray {

    public static void main(String[] args) {

        //public char[] toCharArray()
        //Return : It returns a newly allocated character array.


        String s = "GeeksforGeeks";
        char[] gfg = s.toCharArray();
        for (int i = 0; i < gfg.length; i++) {
            System.out.print(gfg[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(gfg));
    }
}
/*
    The java string toCharArray() method converts the given string into a sequence of characters. The returned array length is equal to the length of the string.

    Syntax :

    public char[] toCharArray()
    Return : It returns a newly allocated character array.

     */