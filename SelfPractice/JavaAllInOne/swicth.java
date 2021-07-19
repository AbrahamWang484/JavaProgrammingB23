package JavaAllInOne;

public class swicth {
    public static void main(String[] args) {
        long z=10;//there are 4 dataType can not be performed: long float double boolean
        switch((int) z){ //so here, should cast to int

            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            case 13:
                System.out.println("Thursday");
            case 14:
                System.out.println("Friday");
            default:
                System.out.println("invalid");
        }
    }
}
