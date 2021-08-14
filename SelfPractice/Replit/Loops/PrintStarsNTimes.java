package Replit.Loops;

import java.util.Scanner;

public class PrintStarsNTimes {
    public static void main(String[] args) {
        int str = new Scanner(System.in).nextInt();

        for (int i = 1 ; i <= str; i++){
            System.out.print("*");
        }
    }
}
/*
Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.

Example:

```
input: 1

output: *
```

Example:

```
input: 3

output: ***
 */
