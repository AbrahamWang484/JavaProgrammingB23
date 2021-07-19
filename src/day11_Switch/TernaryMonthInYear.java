package day11_Switch;

public class TernaryMonthInYear {
    public static void main(String[] args) {
        int number =12;
        String name = "";
        if (number >=1 && number<=12){
            name =(number ==1)?"Jan":(number ==2)?"Feb":(number ==3)?"Mar":(number ==4)?"Apr":(number ==5)?"May":(number==6)?"Jun"
                    :(number ==7)?"Jul":(number==8)?"Aug":(number ==9)?"Sep":(number==10)?"Oct"
                    :(number == 11)?"Nov":"Dec";
        }else{
            name ="invalid";
        }
        System.out.println("name = " + name);
    }
}
