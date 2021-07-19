package Practice_06_09_2021;

import java.util.Scanner;

public class LetterTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your letter");
        char ch = 'f';

        if(ch>='A' && ch<='Z'){
            System.out.println(ch +"is an Uppercase");
        }else if (ch>='a' && ch<='z'){
            System.out.println(ch +" is an lowercase");
        }else {
            System.out.println(ch +"is not an aplhabetic character");
        }
    }
}
