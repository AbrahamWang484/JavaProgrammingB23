package June.Replit.Methods;

import java.util.Scanner;

public class Method_RemoveDup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String uniqueChars="";
        for (int i=0; i<str.length();i++){
            if (!uniqueChars.contains(""+str.charAt(i))){
                uniqueChars+=str.charAt(i);
            }
        }
        return uniqueChars;



    }
}
/*
**uniqueChars** is a method that will accept any String and return the String with out any dupclicate characters

        Examples:

        ```
        uniqueChars("java") ==> "jav"
        ```

        ```
        uniqueChars("mama") ==> "ma"
        ```

        ```
        uniqueChars("spoon") ==> "spon"
        ```

 */