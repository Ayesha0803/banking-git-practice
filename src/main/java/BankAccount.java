public class BankAccount {

    private long accountNumber;
    private String accountHolder;

    public String withdraw(double amount) {
        if (amount <= 0) return "Invalid withdrawal amount";

        balance = balance - amount;
        return "Account balance :" + balance;
    }

    private double balance=1000.0;

    public String deposit(double amount){
        if(amount<=0)
            return "Invalid deposit amount";

        balance=balance+amount;
        return "Account balance :" + balance;
    }

}