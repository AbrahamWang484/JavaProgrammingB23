package June.Replit.Loops;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int countOfHi =0;

        for (int i=0; i<=str.length()-2;i++){
            String hi=str.substring(i,i+2);
            if (hi.equals("hi")){
                countOfHi++;
            }
        }
        System.out.println(countOfHi);

    }
}
/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.


Example:


```
input: abc hi how hi

output: 2
```


Example:


```
input: hi code java please

output: 1
 */
