package Replit.Statement;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int screenSizePrice=0, cpuPrice=0, ramPrice=0, storagePrice=0, screenResolutionPrice=0;
        double totalPrice=0;

        //Screen

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 1.3){
            screenSizePrice=200;
            totalPrice+=screenSizePrice;
        }else if (screenSize==15.0){
            screenSizePrice=300;
            totalPrice+=screenSizePrice;
        }else if (screenSize==17.3){
            screenSizePrice=400;
            totalPrice+=screenSizePrice;
        }

        //CPU
        System.out.println("Select CPU type:");
        String cpu=scan.next();
        if (cpu.equalsIgnoreCase("i3")){
            cpuPrice=150;
            totalPrice+=cpuPrice;
        }else if (cpu.equalsIgnoreCase("i5")){
            cpuPrice=250;
            totalPrice+=cpuPrice;
        }else if (cpu.equalsIgnoreCase("i7")){
            cpuPrice=350;
            totalPrice+=cpuPrice;
        }
        // RAM
        System.out.println("Select RAM size:");
        int ram= scan.nextInt();
        ramPrice= 50*(ram/4);
        totalPrice+=ramPrice;

        //Storage
        System.out.println("Select storage type:");
        String storage = scan.next();
        System.out.println("Enter memory size:");
        int memorySize =scan.nextInt();
        if (storage.equalsIgnoreCase("hdd")){
            storagePrice=50*(memorySize/500);
            totalPrice+=storagePrice;
        }else if (storage.equalsIgnoreCase("ssd")){
            storagePrice=100*(memorySize/500);
            totalPrice+=storagePrice;
        }

        //Screen Resolution
        System.out.println("Enter screen resolution:");
        String screenResolution= scan.next();
        if(screenResolution.equalsIgnoreCase("fullhd")){
            screenResolutionPrice=100;
            totalPrice+=screenResolutionPrice;
        }else if (screenResolution.equalsIgnoreCase("4k")){
            screenResolutionPrice=200;
            totalPrice+=screenResolutionPrice;
        }

        System.out.println("Laptop price is: $"+totalPrice);
    }
}
/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.
- If screen size is equals to 13.3, add  $200 to the laptop price.
- If screen size is equals to  15.0 - add  $300 to the laptop price.
- If screen size is equals to  17.3 - add  $400 to the laptop price.

Then ask user for CPU type.
- If CPU type equals to i3, add  $150 to the laptop price.
- If CPU type equals to i5, add  $250 to the laptop price.
- If CPU type equals to i7, add  $350 to the laptop price.

Then ask user for RAM size.
- Add  $50 for every 4GB of ram to the laptop price.

Then, ask user for storage type. There are 2 options: SSD and HDD.
- If it's HDD - add $50 to the laptop price for every 500gb.
- If it's SSD - add $100 to the laptop price for every 500GB.

Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
- Add $100 if it's FULLHD screen
- Add $200 if it's 4K screen.

Example:

```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
```

Example #2


```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
```
 */
