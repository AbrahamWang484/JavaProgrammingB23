package day11_Switch;
public class PassOrFail {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case'A':
            case'B':
            case'C':
            case'D':
                System.out.println("Passed");
                break;

            case'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}
/*
pass: A,B,C,D
Failed: F
 */