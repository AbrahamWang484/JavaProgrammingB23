package day43_OOP_Encapsulation;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Depositing amount can not be negative of zero");
            return;
        }
        System.out.println("Depositing $ "+amount+" to the account "+accountNumber);
        balance+=amount;
    }
    public void withdraw(double amount){
        if (balance<=0){
            System.out.println("Insufficient balance");
            return ;
        }
        if (balance>amount) {
            System.out.println("Withdrawing $ " + amount + " from the account " + accountNumber);
            balance -= amount;
        }
    }
    public void checkBalance(){
        System.out.println(accountHolder+"'s avaliable balance is $"+ balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", new balance =" + balance +

                '}';
    }
}
