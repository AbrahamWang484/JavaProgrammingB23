package Replit.OOP.ParkingMeter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeter pm = new ParkingMeter(in.nextInt());//30 maxTime
        pm.add(in.nextInt());//25
        pm.tick();
        System.out.println(pm.timeLeft);//29
        System.out.println(pm.isExpired());//f

    }
}