package day07_ShortHand_Relational;

public class ValidTriangle {

    public static void main(String[] args) {
        int     angle1 = 60,
                angle2 = 90,
                angle3 = 75;

        boolean isValid = (angle1 + angle2 + angle3) == 180;

        System.out.println("isValid = " + isValid);

        System.out.println(3 + 2); //5
        System.out.println(30 + 50 + "Hello World" + 20 + " YES" + 10); // 80Hello World20 YES10
        System.out.println("hello" + 5 + 2);//hello52
    }

}
