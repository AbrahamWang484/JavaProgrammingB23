package day10_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 100_000;
        boolean isMarried = false; //suppoes the person is got married or not in here

        double  taxRate;

        if (salary>=130_000){
            taxRate = 0.35;
        }else if (salary>=100_000){
            taxRate = 0.3;
        }else if (salary>=80_000){
            taxRate = 0.25;
        }else{
            taxRate = 0.2;
        }


        if (isMarried){ //if married is true, then tax will be deducted
            taxRate -=0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
/*
2. Write a program that can calculate the salary after tax based on the following requirments.
				the tax rates are:
						35% for salary of 130K or more
						30% for salary of 100K to 129k
						25% for salary of 80K to 99K
						20% for salary of 79K or less

				in addition,if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax
 */