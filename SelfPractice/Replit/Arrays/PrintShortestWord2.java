package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        //Split String to array
        String[] strings = str.split(", ");

        String shortest = strings[0];
        String count = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
                count="";//clear the previous count value
            }
            //saving the shortest to count
            if (strings[i].length() == shortest.length()){
                count += strings[i] + ", ";
            }
        }
        String[] results=count.split(", ");
        Arrays.sort(results);
        System.out.println(Arrays.toString(results));

    }



}

/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

> Hint: Split values by comma: split(", ");

```
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
```
 */