package BankingApp;

public class CheckingAccount extends BankAccount {
    private int transactionLimit;
    private int transactionCount;
    private double transactionFee;

    // Constructor
    public CheckingAccount(String accountNumber, double initialBalance, int transactionLimit, double transactionFee) {
        super(accountNumber, initialBalance);
        this.transactionLimit = transactionLimit;
        this.transactionCount = 0;
        this.transactionFee = transactionFee;
    }

    // Overriding deposit method to include transaction fee logic
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        handleTransaction();
    }

    // Overriding withdraw method to include transaction fee logic
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        handleTransaction();
    }

    // Method to deduct transaction fee
    private void handleTransaction() {
        transactionCount++;
        if (transactionCount > transactionLimit) {
            balance -= transactionFee;
            System.out.println("Transaction fee of $" + transactionFee + " deducted.");
        }
    }

    // Overriding displayAccountInfo method
    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Transaction Limit: " + transactionLimit);
        System.out.println("Transaction Fee: $" + transactionFee);
    }
}
