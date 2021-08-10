package day39_CustomClass_Statics.salaryCalcutorTask;

public class EmployeeSalaries {
    public static void main(String[] args) {
        SalaryCalculator employee1 = new SalaryCalculator();
        employee1.setInfo(65,0.07,0.23,45);
        System.out.println(employee1);

        SalaryCalculator employee2 = new SalaryCalculator();
        employee2.setInfo(50,0.05,0.25,40);
        System.out.println(employee2);
    }



}
