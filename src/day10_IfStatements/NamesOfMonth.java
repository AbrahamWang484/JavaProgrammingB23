package day10_IfStatements;

public class NamesOfMonth {
    public static void main(String[] args) {
        int month = 111;
        String name = "";
        if(month>0 && month<13){
            if(month == 1){
                name = "Jan";
            }else if (month ==2){
                name = "Feb";
            }else if (month ==3){
                name = "March";
            }else if (month ==4){
                name ="April";
            }else if (month ==5){
                name ="May";
            }else if (month ==6){
                name ="June";
            }else if (month ==7){
                name ="July";
            }else if (month ==8){
                name ="August";
            }else if (month ==9){
                name ="Sepember";
            }else if (month ==10){
                name ="October";
            }else if (month ==11){
                name ="November";
            }else {
                name ="December";
            }
        }else {
            name ="Invalide";
        }
        System.out.println("name = " + name);
    }
}
/*
convert the number to Month name
 */
