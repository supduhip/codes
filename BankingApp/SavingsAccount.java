package BankingApp;

public class SavingsAccount extends BankAccount {
    
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest for a given period
    public double calculateInterest(int months) {
        return balance * (interestRate / 100) * months / 12;
    }

    // Overriding displayAccountInfo method
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }


}
