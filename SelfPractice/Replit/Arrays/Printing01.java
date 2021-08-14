package Replit.Arrays;

public class Printing01 {
    public static void main(String[] args) {
        String[] arr = {"hello", "how", "are", "you", "doing"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));

        }
    }
}
/*
The code provided in your main method will take in five Strings and save them into an array called **arr**.
Print out the first three letter of each element on seperate lines.  You can assume that every element of arr is at least 3 letters long.

```
Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
```
 */
