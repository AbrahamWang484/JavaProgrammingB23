package day10_IfStatements;

public class ConvertNumberToWords {
    public static void main(String[] args) {
        int number = 9;
        String word ="";

        if(number>=0 && number<=9){
            if (number ==1){
                word ="one";
            }else if (number ==2){
                word ="two";
            }else if (number ==3){
                word ="three";
            }else if (number ==4){
                word ="four";
            }else if (number ==5){
                word ="Five";
            }else if (number ==6){
                word ="six";
            }else if (number ==7){
                word ="seven";
            }else if (number ==8){
                word ="eight";
            }else if (number ==9){
                word ="Nine";
            }else {
                word ="zero";
            }
        }else {
            word ="Invalid";
        }System.out.println("word = " + word);
    }
}
/*
Convert number to word: 0~9
 */
