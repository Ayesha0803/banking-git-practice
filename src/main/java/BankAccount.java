public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance;

    public String withdraw(double amount){
        if(amount<=0) return "Invalid withdrawal amount";

        balance=balance-amount;
        return "Account balance :"+balance;

    }

}