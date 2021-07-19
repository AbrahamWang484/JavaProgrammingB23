package June.Replit;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo = scan.next();
        int numberOfPeople = scan.nextInt();
        double checkAmount = scan.nextDouble();
        String serviceQuality = scan.next();
        double tipLevel =1;
        double tip =1;
        double totalAmount=0;
        //Split or not
        String sign ="";
        if (yesOrNo.equalsIgnoreCase("yes")) {
            for (int i = 1; i <= numberOfPeople; i++) {
                sign +="&";
            }
            System.out.println("Number of people entered: "+sign);
        }
        // Tips level
        if (serviceQuality.equalsIgnoreCase("poor")){
            tipLevel=0.05;
            tip=checkAmount *tipLevel;
        }else if (serviceQuality.equalsIgnoreCase("fair")){
            tipLevel=0.10;
            tip=checkAmount *tipLevel;
        }else if (serviceQuality.equalsIgnoreCase("good")){
            tipLevel=0.15;
            tip=checkAmount *tipLevel;
        }else if (serviceQuality.equalsIgnoreCase("great")){
            tipLevel=0.20;
            tip=checkAmount *tipLevel;
        }else if (serviceQuality.equalsIgnoreCase("excellent")){
            tipLevel=0.25;
            tip=checkAmount *tipLevel;
        }
         //Total Pay:

        totalAmount= checkAmount+tip;
        System.out.println("Total to pay: "+totalAmount);
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+totalAmount/numberOfPeople);
        System.out.println("Tip per person: "+tip/numberOfPeople);
    }
}

/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip
given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

> Poor = 5%
> Fair = 10%
> Good = 15%
> Great = 20%
> Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) yes
Number of people entered: (number) (each person = & in output)4
Check amount: (number) 476.0
Service Quality: (String) excellent
Total to pay: 595.0
Total tip:476 * 25%=119.0
Total per person:595.0/4 =148.75
Tip per person:119.0/4

```
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
