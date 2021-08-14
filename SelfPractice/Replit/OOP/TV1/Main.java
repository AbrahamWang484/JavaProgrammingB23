package Replit.OOP.TV1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt()); //setChannel

        TV tv2 = new TV(in.next());// set brand name
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt()); //channel
        tv2.setChannel(in.nextInt());//channel
        tv2.setVolumeLevel(in.nextInt());//volume
        tv2.volumeUp();
    }
}
