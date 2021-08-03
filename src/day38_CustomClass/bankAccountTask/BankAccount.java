package day38_CustomClass.bankAccountTask;

public class BankAccount {
    /*
    attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw
     */
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void checkBalance() {
        System.out.println(accountHolder+"'s available balance is $"+balance);
    }

    public void setInfo(String accountHolder, long accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) { // -1
        if (amount <= 0) {
            System.out.println("Depositing amount can not be negative or zero");
            return; // break only use in for loop and switch, others case for exit, use return;
        }

        System.out.println("Depositing $" + amount + " to the account " + accountNumber);
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount <= 0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        if (balance <= 0) {
            System.out.println("Sorry, your account balance is less than or equal 0, can not withdraw the cash");
            return;
        }
        if (amount > balance) {
            balance -=35;
        }
        System.out.println("Withdrawing $"+ amount +" from the account "+accountNumber);
        balance -= amount;
    }

}

