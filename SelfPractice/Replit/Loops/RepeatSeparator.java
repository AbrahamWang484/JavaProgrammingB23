package Replit.Loops;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result="";

        for (int i = 0; i < count; i++) {
        result+=(word+separator);
        }
        result=result.substring(0,result.length()-separator.length());
        System.out.println("result = " + result);
    }
}
/*
Given two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word, separated by the separator string.


Example:


```
input:
Word
X
3

output: WordXWordXWord
```

Example:


```
input:
This
And
2

output: ThisAndThis
```


Example:


```
input:
This
And
1

output: This
 */