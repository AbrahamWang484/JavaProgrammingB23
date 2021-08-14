package Replit.Arrays;

import java.util.Scanner;

public class ReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: start your code here
        String[] str = sentence.split(" ");
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i]+" ");
        }
    }
}
/*
Given a String variable **sentence,** write code to get each word and assign to String **reversed** in reverse order.

Example:

```
sentence -> Java is fun

reversed > fun is Java
```
 */