package June.Replit.String;

import java.util.Scanner;

public class EmailTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int index_=email.indexOf('_');
        int indexAt=email.indexOf('@');
        String firstName=email.substring(0,index_);
        String lastName=email.substring(index_+1,indexAt);
        String domain=email.substring(indexAt+1,email.indexOf('.'));

        System.out.println("First name: "+""+firstName.toUpperCase().charAt(0)+firstName.substring(1));
        System.out.println("Last name: "+""+lastName.toUpperCase().charAt(0)+lastName.substring(1));
        System.out.println("Domain: "+domain);


    }
}
/*
Write a program that will print out information about user based on email.
Print first name, last name, and domain.
First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

```
Input: craig_federighi@apple.com

```
```
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
