package June.Replit.Loops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] words = new String[5];
        String longest="";
        for (String word:words) {

            if (word.length()>longest.length()){
                longest =word;
            }


        }
        System.out.println(longest);

        //write your code below
    }
}

