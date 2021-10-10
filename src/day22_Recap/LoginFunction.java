package day22_Recap;

import java.util.Scanner;

public class LoginFunction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String username="cybertek";
        String password="cybertek12345";

        System.out.println("Please enter username: ");
        String usernameinput=scan.next();
        System.out.println("Please enter password: ");
        String passwordinput=scan.next();

        if (usernameinput.equals(username) && passwordinput.equals(password)){
            System.out.println("Logged in.");
        } else if (!usernameinput.equals(username) || !passwordinput.equals(password)){


            for (int i = 1; i <= 2; i++) {
                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Please enter username: ");
                 usernameinput=scan.next();
                System.out.println("Please enter password: ");
                 passwordinput=scan.next();
                if (usernameinput.equals(username) && passwordinput.equals(password)){
                    System.out.println("Logged in.");
                    break; //exits the loop
                    //continue; skip the current loop
                    //System.exit(0); exit whole system
                }
                if (i ==2){
                    System.out.println("Your account is locked.");
                    System.exit(0);//exits whole system
                }
            }
        }
        System.out.println("Hello Cybertek!");

        scan.close();
    }
}
/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek

                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter
                correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */