package day38_CustomClass.bankAccountTask;

import java.util.ArrayList;
import java.util.Arrays;

public class BankActivity {
    public static void main(String[] args) {
         BankAccount account1= new BankAccount();
        account1.setInfo("Wang",123,0);

        BankAccount account2= new BankAccount();
        account2.setInfo("Abraham",222,100);

        BankAccount account3= new BankAccount();
        account3.setInfo("Ahmed",223,50);

        BankAccount[] arr = {account1,account2,account3};
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(arr));

        for(BankAccount each : accounts){
            each.checkBalance();
           // System.out.println("After Deposit, Balance will be: "+each.deposit(10));
        }
        account1.withdraw(10);
        account1.deposit(1000);
        account1.checkBalance();
        //account2.withdraw(10);
        account1.withdraw(999);
        account1.checkBalance();
        account1.withdraw(25);
        account1.checkBalance();
        account1.withdraw(10);
account1.checkBalance();
account1.deposit(10000);
account1.checkBalance();










    }
}
