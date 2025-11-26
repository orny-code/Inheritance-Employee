package Inheritance;

public class TestBankAcc{
public static void main(String[] args){
    BankAccount a= new BankAccount("Orny", "Acc57878",768.675);
    SavingsAccount s = new SavingsAccount("Ornyyyy", "Acc572354878",500, 3, 700);
    CurrentAccount c = new CurrentAccount("Ornyy", "Bcc572354878",200, 3, 700);

    c.balanceTransfer(20,s);
    c.printbalance();

        }
}
