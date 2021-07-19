package day11_Switch;

public class TernaryEntranceFee {
    public static void main(String[] args) {
        String sport ="Soccer";
        int price =(sport.equals("Soccer") || sport.equals("Tennis"))?100:50;
        System.out.println("price = " + price);
    }

}

/*
2. Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
 */