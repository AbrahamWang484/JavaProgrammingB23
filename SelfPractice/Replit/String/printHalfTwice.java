package Replit.String;

import java.util.Scanner;

public class printHalfTwice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int length = word.length();

        if(length%2==0){
            String twice1 =""+word.substring(0,length/2);
            System.out.println(twice1+twice1);
        }else {
            String twice2 =""+word.substring(0,(length-1)/2);
            System.out.println(twice2+twice2);
        }

    }
}
/*
Write a program that will print out first half of the word twice.


Example:

```
input: java

output: jaja
```
```
input: unity

output: unun
```
 */
