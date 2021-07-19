package day10_IfStatements;

public class LoanAprrovedOrDenied {
    public static void main(String[] args) {
    int yearlySalary =65000, creditScore =640;
    String result = (yearlySalary>=60000 && creditScore >=660)?"Loan Approved":"Loan Denied";
        System.out.println("result = " + result);
    }
}
/*
1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
 */