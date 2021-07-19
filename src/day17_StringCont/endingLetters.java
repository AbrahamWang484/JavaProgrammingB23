package day17_StringCont;

import java.util.Scanner;

public class endingLetters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter word");
        String word=scan.next();

        //boolean endsWithLY=word.substring(word.length()-2).equals("ly");
        boolean endsWithLY = word.endsWith("ly");

        if (endsWithLY){
            System.out.println("really?");
        }else {
            System.out.println("Never Mind");
        }
        scan.close();
    }
}
//check the word ending with "ly" or not?