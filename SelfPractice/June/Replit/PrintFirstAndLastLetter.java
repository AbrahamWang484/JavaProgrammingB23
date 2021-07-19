package Replit;

import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word= scan.next();
        int length = word.length();
        String firstLetter =""+word.charAt(0);
        String lastLetter = ""+word.charAt(length-1);
        System.out.println(firstLetter+lastLetter);





    }
}
/*
Write a program that will print out first and last letters together.

```
Input: adobe
```

```
Output: ae
 */