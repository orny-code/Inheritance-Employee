package Inheritance;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    private int withrawLimit;
    private int withrawThisMonth;

    public SavingsAccount(String accountHolderName, String  accountNumber, double balance, double interestRate, int withrawLimit ){
        super(accountHolderName,accountNumber,balance);
        this.interestRate=interestRate;
        this.withrawLimit=withrawLimit;
        this.withrawThisMonth=0;
    }

    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    public boolean withraw(double amount) {
      if(this.withrawThisMonth<this.withrawLimit){
          boolean withrawDone = super.withraw(amount);
          if(withrawDone)
          {
              this.withrawThisMonth += 1;
              return withrawDone;
          }
          return withrawDone;
      }
      return false;
    }

    public boolean deposit(double amount) {
        boolean isDeposited= super.deposit(amount);
        return isDeposited;
    }
}
