package day38_CustomClass.SalaryTask;

public class SalaryDetail {
    public static void main(String[] args) {
        Salary salary1 = new Salary();
        salary1.setInfo(15,0.08,0.025,40);
        Salary salary2 = new Salary();
        salary2.setInfo(14,0.05,0.035,45);
        Salary salary3 = new Salary();
        salary3.setInfo(13,0.032,0.034,30);
        Salary salary4 = new Salary();
        salary4.setInfo(12,0.04,0.025,20);
        Salary salary5 = new Salary();
        salary5.setInfo(15,0.065,0.035,38);

        System.out.println(salary1.salary());
        System.out.println(salary1.stateTax());
        System.out.println(salary1.federalTax());
        System.out.println(salary1.salaryAfterTax());
        System.out.println(salary1);

        //Salary[] arr = {salary1,salary2,salary3,salary4,salary5};
    }

}
