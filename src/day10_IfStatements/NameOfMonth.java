package day10_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 5;
        String name = "";// first make one variable for String
        if (number == 1){
            name ="Jan";
        }else if (number == 2){
            name ="Feb";
        }else if (number == 3){
            name ="March";
        }else if (number == 4){
            name = "April";
        }else {
            name = "May";
        }
        System.out.println("Month = " + name);//only use one print statement

    }
}
