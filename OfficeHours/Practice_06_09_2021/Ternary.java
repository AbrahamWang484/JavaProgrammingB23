package Practice_06_09_2021;

public class Ternary {
    public static void main(String[] args) {
        int age = 17;
        int weight = 60;


        if (age >= 18) {

            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }

        } else {

            System.out.println("Age must be greater than 18");
        }
        System.out.println("------------------------------");
        String result = (age>=18)?(weight>50)?"You are eligible to donate blood":"You are not eligible to donate blood":"Age must be greater than 18";
        System.out.println("result = " + result);
    }
}
/*
? -----if
:------else
condition? true:false;

Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age : ");

 */