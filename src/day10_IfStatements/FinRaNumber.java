package day10_IfStatements;

public class FinRaNumber {
    public static void main(String[] args) {
        int number =15;
        String result ="";

        if (number%3==0 && number%5==0){
            result = "FINRA";//first should assign the large range, to avoide the conflict with small range
        }else if (number%3 == 0){
            result = "FIN";
        }else if (number%5 == 0){
            result = "RA";
        }else {
            result = ""+number; //use concatation to change the number from int to String
        }
        System.out.println("result = " + result);

    }
}
/*
Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of
    both 3 and 5, print "FINRA" instead of the number.
    		ex:
    			number = 3

    		output:
    			FIN

    			number = 10

			output:
				RA

				number = 15

			output:
				FINRA

				other number
				number = specific number
 */