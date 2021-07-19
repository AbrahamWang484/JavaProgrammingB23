package day14_Recap;

import java.util.Scanner;

public class TernarySwitchPractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        int number = scan.nextInt();

        String name = (number>=1 && number<=7)?
                (number ==1)?"Monday":(number ==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":(number ==6)?"Saturday":"Sunday"
        :"Invalid Day";
        System.out.println("name = " + name);
        System.out.println("------------------");

        String name2 ="";
        if(number>=1 && number<=7){
            switch (number){
                case 1: name2 = "Monday"; break;
                case 2: name2 ="Tuesday"; break;
                case 3: name2 = "Wed"; break;
                case 4: name2 ="Thur"; break;
                case 5: name2 = "Fri"; break;
                case 6: name2 ="Sat"; break;
                default:name2="Sunday";
            }

        }else {
            name2 ="no such a Day";
        }
        System.out.println("name2 = " + name2);
    }
}
