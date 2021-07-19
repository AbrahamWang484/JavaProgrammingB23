package Practice_06_09_2021;

public class SwitchEx {
    public static void main(String[] args) {
        String animal ="CAT";
        String result ="";
        switch(animal){
            case "DOG":
            case "CAT":
               result = "domestic animal";
                break;
            case "TIGER":
                result="wild animal";
                break;
            default:
                result="unknown animal";
        }
        System.out.println("result = " + result);
    }
}
/*
1-Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
 */