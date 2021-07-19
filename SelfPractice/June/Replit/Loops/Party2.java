package June.Replit.Loops;

import java.util.Scanner;

public class Party2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "";

        System.out.println("Please enter guest name:");

        String name = input.next();
        list+=name + ", ";

        for (int i = 0 ; true;){

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if(answer.equals("no")){
                list=list.substring(0,list.length()-2);
                break;
            }else if(answer.equals("yes")) {
                System.out.println("Please enter guest name:");
                name = input.next();
                list += name + ", ";
            }
        }

        System.out.println("Guest's list: " + list);
    }
}
