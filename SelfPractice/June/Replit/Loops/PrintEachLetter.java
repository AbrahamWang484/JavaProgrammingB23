package June.Replit.Loops;

import java.util.Scanner;

public class PrintEachLetter {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();


        for (int i = 0; i<word.length();i++){
             char eachLetter = word.charAt(i);
            System.out.println(eachLetter);
        }

    }
}
/*
Given a String, use a loop to print every character from the String on a new line.

Examples:

```
Input: hello
h
e
l
l
o
```

```
Input: zimbabwe
z
i
m
b
a
b
w
e
```

```
Input: wow!
w
o
w
!
```
 */
