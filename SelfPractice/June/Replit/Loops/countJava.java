package June.Replit.Loops;

import java.util.Scanner;

public class countJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int countJava = 0;
//for count type quesstion: 1. create loop; 2, use substring function to filter all the length equal words; 3,use if statement, compare the filter word with target word, if equal, count +1
        //4, output the number;
        for (int i = 0; i <= word.length() - 4; i++) {
            String java = word.substring(i, i + 4);

            if (java.equals("java")) {
                countJava++;
            }
        }
        System.out.println(countJava);
    }
}
/*
Print the number of times that the string "java" appears anywhere in the given string **word**

Example:

```
input: javaxjava

output: 2
```


Example:


```
input: javaxjavaapplepearjavaegg

output: 3
 */
