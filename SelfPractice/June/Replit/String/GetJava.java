package June.Replit.String;

import java.util.Scanner;

public class GetJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word= scan.next();


        if (word.toLowerCase().contains("java")) {
            if (word.toLowerCase().indexOf("java") == 0 || word.toLowerCase().indexOf("java") == 1) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else {
                System.out.println("false");
            }

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