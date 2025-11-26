package Inheritance;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName,String accountNumber, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public boolean withraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance -=amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount){
        if(amount>0){
            this.balance +=amount;
            return true;
        }
        return false;
    }

    boolean balanceTransfer(double amount, BankAccount b) {
        if (withraw(amount)) {
            b.deposit(amount);
            return true;
        }
        return false;
    }

    public void printbalance(){
        System.out.println("Balance: "+ this.balance);
    }
}
