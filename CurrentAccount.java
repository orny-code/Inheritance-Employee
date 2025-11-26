package Inheritance;

public class CurrentAccount extends BankAccount {
    private double currentOverDraftLimit;
    private double maxOverDraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber,double balance, double maxOverDraftLimit, double currentOverDraftLimit ){
        super(accountHolderName,accountNumber,balance);
        this.currentOverDraftLimit=currentOverDraftLimit;
        this.maxOverDraftLimit=maxOverDraftLimit;
    }

    public boolean withraw(double amount){
        if(amount <= this.getBalance()){
            boolean withrawDone = super.withraw(amount);
            return withrawDone;
        } else if(amount<this.getBalance()+ this.currentOverDraftLimit){
            boolean iswithraw = super.withraw(this.getBalance());
            this.currentOverDraftLimit -= (amount-this.getBalance());
            return iswithraw;
        }
        else{
            return false;
        }
    }
    public boolean deposit(double amount){
        return true;
    }
}
