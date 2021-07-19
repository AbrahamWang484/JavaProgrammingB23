package Replit;

import java.util.Scanner;

public class PrintLongestWord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word1= scan.next();
        String word2= scan.next();

        int length1 =word1.length();
        int length2= word2.length();

        if (length1>length2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
    }
}
/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

```
input:
bill
check

```
```
output: check
 */
