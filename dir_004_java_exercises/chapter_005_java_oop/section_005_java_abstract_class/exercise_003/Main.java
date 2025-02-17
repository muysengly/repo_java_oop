// Main.java
// Subclass Main

// Define public class Main
public class Main {
  // Define the main method
  public static void main(String[] args) {
    // Declare double variables for initial balance, deposit amount, and withdrawal
    // amount
    double ibal, damt, wamt;

    // Set initial balance for SavingsAccount
    ibal = 1000.00;
    // Create a new SavingsAccount object with the initial balance
    SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
    // Print initial balance of SavingsAccount
    System.out.println("Savings A/c: Initial Balace: $" + ibal);

    // Set deposit amount
    damt = 500.00;
    // Deposit amount into SavingsAccount
    savingsAccount.deposit(damt);

    // Set first withdrawal amount
    wamt = 250.00;
    // Withdraw amount from SavingsAccount
    savingsAccount.withdraw(wamt);

    // Set second withdrawal amount
    wamt = 1600.00;
    // Print attempt to withdraw larger amount
    System.out.println("\nTry to withdraw: $" + wamt);
    // Attempt to withdraw larger amount from SavingsAccount
    savingsAccount.withdraw(wamt);

    // Print an empty line for separation
    System.out.println();

    // Set initial balance for CurrentAccount
    ibal = 5000.00;
    // Create a new CurrentAccount object with the initial balance
    CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
    // Print initial balance of CurrentAccount
    System.out.println("Current A/c: Initial Balace: $" + ibal);

    // Set deposit amount for CurrentAccount
    damt = 2500.00;
    // Deposit amount into CurrentAccount
    currentAccount.deposit(1000.0);

    // Set first withdrawal amount for CurrentAccount
    wamt = 1250.00;
    // Withdraw amount from CurrentAccount
    currentAccount.withdraw(3000.0);

    // Set second withdrawal amount for CurrentAccount
    wamt = 6000.00;
    // Print attempt to withdraw larger amount from CurrentAccount
    System.out.println("\nTry to withdraw: $" + wamt);
    // Attempt to withdraw larger amount from CurrentAccount
    savingsAccount.withdraw(wamt);
  }
}
// CurrentAccount.java
// Subclass CurrentAccount

// Define CurrentAccount class that extends BankAccount
class CurrentAccount extends BankAccount {

  // Constructor to initialize account number and balance
  public CurrentAccount(String accountNumber, double balance) {
    super(accountNumber, balance); // Call superclass constructor with account number and balance
  }

  // Override deposit method from BankAccount
  @Override
  public void deposit(double amount) {
    // Add deposit amount to current balance
    setBalance(getBalance() + amount);
    // Print successful deposit message with updated balance
    System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
  }

  // Override withdraw method from BankAccount
  @Override
  public void withdraw(double amount) {
    // Check if there are sufficient funds for the withdrawal
    if (getBalance() >= amount) {
      // Subtract withdrawal amount from current balance
      setBalance(getBalance() - amount);
      // Print successful withdrawal message with updated balance
      System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
    } else {
      // Print insufficient funds message if withdrawal cannot be made
      System.out.println("Insufficient funds. Withdrawal failed.");
    }
  }
}
// SavingsAccount.java

// Define a subclass named SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount {
  // Constructor that accepts account number and balance, and passes them to the
  // superclass constructor
  public SavingsAccount(String accountNumber, double balance) {
    super(accountNumber, balance);
  }

  // Override the deposit method to add an amount to the balance
  @Override
  public void deposit(double amount) {
    // Update the balance by adding the deposit amount
    setBalance(getBalance() + amount);
    // Print a message indicating the deposit was successful
    System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
  }

  // Override the withdraw method to subtract an amount from the balance
  @Override
  public void withdraw(double amount) {
    // Check if the balance is sufficient for the withdrawal
    if (getBalance() >= amount) {
      // Update the balance by subtracting the withdrawal amount
      setBalance(getBalance() - amount);
      // Print a message indicating the withdrawal was successful
      System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
    } else {
      // Print a message indicating insufficient funds
      System.out.println("Insufficient funds. Withdrawal failed.");
    }
  }
}
// BankAccount.java

// Define an abstract class named BankAccount
abstract class BankAccount {
  // Declare private variables for account number and balance
  private String accountNumber;
  private double balance;

  // Constructor that accepts account number and balance, and sets them to the
  // corresponding variables
  public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // Getter method for account number
  public String getAccountNumber() {
    return accountNumber;
  }

  // Getter method for balance
  public double getBalance() {
    return balance;
  }

  // Protected setter method for balance
  protected void setBalance(double balance) {
    this.balance = balance;
  }

  // Declare an abstract method for depositing an amount
  public abstract void deposit(double amount);

  // Declare an abstract method for withdrawing an amount
  public abstract void withdraw(double amount);
}
