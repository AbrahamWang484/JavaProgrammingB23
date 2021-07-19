package day14_Recap;

import java.util.Scanner;

public class SwitchLiveWith {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int num = scan.nextInt(); //if one time use, so no need assign the variable again.
        if(num>=1){
            switch (num){
                case 1:
                case 2:
                    System.out.println("Live with less than 3 people");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Live with 3 - 6 people");
                    break;
                default:
                    System.out.println("Live with more than 6 people");
        }
            }

        }
    }

/*
Switch:
        Ask the user how many people they live with?
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */