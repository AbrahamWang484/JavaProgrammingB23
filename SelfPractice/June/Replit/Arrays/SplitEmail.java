package June.Replit.Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] arr=email.split("@");
        if (!email.contains("@") || arr.length>2)
            System.out.println("invalid email");
        else {
            System.out.println("Email id: "+arr[0]);
            System.out.println("Email domain: "+arr[1]);
        }


    }
}
/*
Given a String variable **email**, write code using split method to print email id and domain in separate lines.

Example:

```
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
```

If email contains no @ character or multiple @ characters then print _**invalid email**_:

```
email -> hello-gmail.com

Output:
invalid email
```

```
email -> my@fancy@email.com

Output:
invalid email
```
 */