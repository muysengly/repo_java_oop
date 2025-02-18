// Main.java
// Main Class

public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount();

        // Set values using setter methods
        account.setAccountNumber("SB-09876");
        account.setBalance(2000.0);

        // Get values using getter methods
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        // Print the values
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
// BankAccount.java

// BankAccount Class
class BankAccount {
    // Declare a private String variable for account number
    private String accountNumber;
    // Declare a private double variable for balance
    private double balance;

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
