package June.Replit.Arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] arr=sentence.split(" ");
        for (String str:arr) {
            System.out.println(str);
        }
    }
}
/*
Given a String variable **sentence,** write code to type each word in separate lines.

Example:

```
sentence -> "Java is fun"

Print

Java
is
fun
```
 */
