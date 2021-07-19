package June.Replit.String;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


    }
}
/*
Given a string **_word_**, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.


Example:

```
input: javapython

output: true
```

```
input: cjavac++

output: true
```

```
input: c#javaruby

output: false
 */