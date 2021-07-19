package day17_StringCont;

import sun.lwawt.macosx.CInputMethod;

import java.util.Scanner;

public class AccountNumber {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String account= scan.next();

        char firstChar= account.charAt(0);
        String result="";
        scan.close();

        switch (firstChar){
            case '2'://if the first character of account is 2
                if (account.length() == 7){
                    result = "Valid account";
                }else {
                    result ="Invalid:should be 7 characters long";
                }
                break;
            case '5':
                    if (account.length() == 10){
                        result ="Valid account";
                    }else {
                        result ="Invalid:should be 10 characters long";
                    }
                    break;
            default:
                result ="Invalid: firstChar should be 2 or 5";
                }
        System.out.println(result);
        }
    }


/*
1.Ask the user enter an account number (String). Check if these account number is valid.
	    > If the account number begins with a “2” the account number should be 7 characters long
	    > If the account number begins with a “5” the account number should be 10 characters long
	    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
*/