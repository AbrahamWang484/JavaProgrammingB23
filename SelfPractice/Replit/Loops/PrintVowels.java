package Replit.Loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        String result="";
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                result+=ch;
        }
        System.out.println(result);
    }
}
/*
Create a program that will take the given String **In** and print out all the vowels from the String.


Example:

```
Input: howdyho

Output: oo
```

```
Input: huehuehuehue

Output: ueueueue
```
 */
