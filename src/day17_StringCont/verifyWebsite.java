package day17_StringCont;

import java.util.Locale;
import java.util.Scanner;

public class verifyWebsite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String url = scan.nextLine().toLowerCase();

        boolean isValidWebsite = url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));
        if (isValidWebsite){
            System.out.println("valid website");
        }else {
            System.out.println("Invalid Website");
        }

        scan.close();
    }
}
/*
write a program that can check if the given website is valid website or not
			starts with: www.
			ends with: .com, .edu, .gov
 */