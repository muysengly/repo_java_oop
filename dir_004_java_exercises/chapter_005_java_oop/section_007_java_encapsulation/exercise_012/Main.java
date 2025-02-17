public class Main {
  // Main method to test the Account class
  public static void main(String[] args) {
    // Create a new Account object
    Account account = new Account();

    // Set the account number, account holder, and initial balance
    account.setAccountNumber("123456789");
    account.setAccountHolder("Rodolfo Desiree");
    account.setBalance(1000.0);

    // Deposit an amount to the account
    account.deposit(500.0);

    // Withdraw an amount from the account
    account.withdraw(200.0);

    // Print the details of the account
    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Account Holder: " + account.getAccountHolder());
    System.out.println("Balance: $" + account.getBalance());
  }
}

// Define the Account class
class Account {
  // Private instance variables
  private String accountNumber;
  private String accountHolder;
  private double balance;

  // Public getter for the accountNumber variable
  public String getAccountNumber() {
    return accountNumber;
  }

  // Public setter for the accountNumber variable
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  // Public getter for the accountHolder variable
  public String getAccountHolder() {
    return accountHolder;
  }

  // Public setter for the accountHolder variable
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  // Public getter for the balance variable
  public double getBalance() {
    return balance;
  }

  // Public setter for the balance variable
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // Method to deposit an amount and increase the balance
  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
    }
  }

  // Method to withdraw an amount and decrease the balance
  public void withdraw(double amount) {
    if (amount > 0 && this.balance >= amount) {
      this.balance -= amount;
    }
  }
}
