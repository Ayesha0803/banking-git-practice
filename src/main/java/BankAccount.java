public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance=1000.0;

    public String deposit(double amount){
        if(amount<=0)
            return "Invalid deposit amount";

        balance=balance+amount;
        return "Account balance :" + balance;
    }

}