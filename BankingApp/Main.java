package BankingApp;

public class Main {
  
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount("S12345", 1000.0, 3.5);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        double interest = savingsAccount.calculateInterest(6);
        System.out.println("Interest for 6 months: $" + interest);
        savingsAccount.displayAccountInfo();

        System.out.println("-------------------------");

        // Create a checking account
        CheckingAccount checkingAccount = new CheckingAccount("C12345", 1500.0, 3, 2.0);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(100);
        checkingAccount.withdraw(50);
        checkingAccount.withdraw(50); // This should trigger a transaction fee
        checkingAccount.displayAccountInfo();
    }


}
