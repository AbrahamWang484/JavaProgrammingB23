package Replit.String;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        int length =txt.length();
        System.out.println(txt.substring(0,length-1));//substring exclude the right number

    }
}
/*
Given a String **txt** print the value without the last letter

Ex:

```
Input:
foo
```
```
Output:
fo
```

```
Input:
run
```
```
Output:
ru
```

Hint: Use substring() and length()ds
 */