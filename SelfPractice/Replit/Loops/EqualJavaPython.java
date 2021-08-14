package Replit.Loops;

import java.util.Scanner;

public class EqualJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String word1 ="java", word2="python";
        int count1 = 0,count2=0;

        for(int i = 0; i <= sentence.length()-4; i++  ){ //
            String each = sentence.substring(i, i+4); // representing each four characters in sentence
            if(each.equals(word1))
                count1++;
        }

        for(int i = 0; i <= sentence.length()-6; i++  ){ //
            String each = sentence.substring(i, i+6); // representing each four characters in sentence
            if(each.equals(word2))
                count2++;
        }

        boolean isEqual=count1==count2;
        System.out.println("isEqual = " + isEqual);
    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the
number of appearances of "python" anywhere in the string (case sensitive).

Example:


```
input: We study java not python

output: true
```


Example:


```
input: What's the difference between java, javascript and python?

output: false
 */