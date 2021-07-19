import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information\n" +
                "Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email =scan.nextLine();
        
    }
}
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 `int` variables: `age`, `zipcode`
Declare 2 `double` variables: `height`, `weight`.
Declare `boolean` variable: `isMarried` (for marriage status).
Declare 2 `long` variables: `workPhoneNumber` and `personalPhoneNumber`.

Create a `Scanner` object named `scan`.


Execution flow with example:
```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
```
- build contacts variable by concatenating work phone, personal phone and email

- build fullName variable by concatenating first name and last name

- build address variable by concatenating street, city, state, zip code

**Output in the console:**

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
 */