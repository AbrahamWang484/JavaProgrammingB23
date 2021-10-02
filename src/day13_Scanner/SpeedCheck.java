package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit =35;

        System.out.println("Enter your speed:");
        int currentSpeed = new Scanner(System.in).nextInt();//for one time use, not for re-usable;
                         //         scan.nextInt();      Scanner scan = new Scanner(System.in);
        int overSpeedLimit = currentSpeed - speedLimit;

        if(overSpeedLimit>0){
            System.out.println("You are driving "+overSpeedLimit+" miles over speed limit. Slow Down!");
        }
    }
}
/*
when the speed over 50, print warning: you are driving "speed", please slow down!
 */