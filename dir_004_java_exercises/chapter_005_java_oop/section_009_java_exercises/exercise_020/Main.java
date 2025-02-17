// Define the BankAccount class
class BankAccount {

  // Attribute for account number
  private String accountNumber;

  // Attribute for account holder's name
  private String accountHolderName;

  // Attribute for account balance
  private double balance;

  // Constructor to initialize BankAccount object
  public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
  }

  // Method to deposit money into the account
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount + ". New balance: " + balance);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  // Method to withdraw money from the account
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount + ". New balance: " + balance);
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }
  }

  // Method to check the account balance
  public double checkBalance() {
    return balance;
  }

  // Getter method for account number
  public String getAccountNumber() {
    return accountNumber;
  }

  // Getter method for account holder's name
  public String getAccountHolderName() {
    return accountHolderName;
  }
}

// Define the SavingsAccount subclass that extends BankAccount
class SavingsAccount extends BankAccount {

  // Attribute for interest rate
  private double interestRate;

  // Constructor to initialize SavingsAccount object
  public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
    super(accountNumber, accountHolderName, initialBalance); // Call the constructor of the superclass
    this.interestRate = interestRate;
  }

  // Method to apply interest to the balance
  public void applyInterest() {
    double interest = checkBalance() * interestRate / 100; // Calculate interest
    deposit(interest); // Add interest to the balance
    System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
  }

  // Getter method for interest rate
  public double getInterestRate() {
    return interestRate;
  }

  // Setter method for interest rate
  public void setInterestRate(double interestRate) {
    if (interestRate > 0) {
      this.interestRate = interestRate;
    } else {
      System.out.println("Interest rate must be positive.");
    }
  }
}

// Main class to test the BankAccount and SavingsAccount classes
public class Main {
  public static void main(String[] args) {
    // Create a BankAccount object
    BankAccount account = new BankAccount("123456789", "Henri Lionel", 1000.0);
    System.out.println("Current balance: " + account.checkBalance()); // Check balance
    account.deposit(4000.0); // Deposit money
    account.withdraw(3000.0); // Withdraw money
    System.out.println("Current balance: " + account.checkBalance()); // Check balance

    // Create a SavingsAccount object
    SavingsAccount savings = new SavingsAccount("888888888", "Amphitrite Jun", 2000.0, 5.0);
    savings.applyInterest(); // Apply interest
    System.out.println("Savings account balance: " + savings.checkBalance()); // Check balance
  }
}
