package day10_IfStatements;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 4;// 1~7
        String name="";
        if (number>=1 && number <=7) {
            /*
            if (number == 1) {
                name = "Monday";
            } else if (number == 2) {
                name = "Tuesday";
            } else if (number == 3) {
                name = "Wednesday";
            } else if (number == 4) {
                name = "Thurday";
            } else if (number == 5) {
                name = "Friday";
            } else if (number == 6) {
                name = "Saturday";
            } else {
                name = "Sunday";
            }
            above and below all right.
            */
            name = (number == 1)?"Monday":(number ==2)?"Tuesday":(number ==3)?"Wendesday":(number==4)?"Thursday":(number==5)?"Friday":(number ==6)?"Saturday":"Sunday";
        }else {
                name = "invalid";
            }System.out.println("Day's name = " + name);
        System.out.println("---------------------");
        System.out.println('A');
    }

    }

