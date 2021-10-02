package day11_Switch;

public class TernaryPractice {
    public static void main(String[] args) {
        double  salary =90_000;
        int creditScore = 750;
        String result =(salary >= 60000 && creditScore >=650) ? "Loan Approved" : "Loan Dennied";

        /*
        String result = "";// for the error in println, in here, should first assign the value empty"".
        if (salary >= 60000 && creditscore >= 650){
            result ="Loan Approved";
        }else{
            result ="Loan Denied";
        }
        */
        System.out.println("result = " + result);
    }
}
