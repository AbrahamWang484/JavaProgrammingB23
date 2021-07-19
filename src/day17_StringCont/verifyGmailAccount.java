package day17_StringCont;

import java.util.Locale;
import java.util.Scanner;

public class verifyGmailAccount {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String email = scan.next();
        scan.close();
        email= email.toLowerCase();
        if (email.endsWith("@gmail.com")){
            System.out.println("a valid gmail account");
        }else   {
            System.out.println("invalid gmail account");
        }
    }
}
/*
1. write a program to verify if the gmail is valid
			requirements:
					a valid gmail account should end with @gmail.com
 */