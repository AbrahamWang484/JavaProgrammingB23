package June.Replit.Arrays;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above
        String smallest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()<smallest.length()){
                smallest=str[i];
            }
        }
        System.out.println(smallest);



    }
}
/*
Write a program that will print the shortest word in the given array str.

```
input: java, cable, red, vivid, remedy, grace

output: red
```
 */
