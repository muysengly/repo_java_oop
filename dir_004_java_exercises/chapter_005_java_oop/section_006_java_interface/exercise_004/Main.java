import java.util.ArrayList;
import java.util.List;

// Declare the Account interface
interface Account {
  void deposit(double amount);

  void withdraw(double amount);

  double getBalance();
}

// Implement a concrete class for the Account interface
class SavingsAccount implements Account {
  private double balance;

  public SavingsAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  @Override
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  @Override
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    }
  }

  @Override
  public double getBalance() {
    return balance;
  }
}

// Declare the Bank class
class Bank {
  private List<Account> accounts;

  // Constructor for initializing the list of accounts
  public Bank() {
    accounts = new ArrayList<>();
  }

  // Method to add an account to the bank
  public void addAccount(Account account) {
    accounts.add(account);
  }

  // Method to get the total balance of all accounts
  public double getTotalBalance() {
    double total = 0;
    for (Account account : accounts) {
      total += account.getBalance();
    }
    return total;
  }
}

// Main class to test the implementation
public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    Account account1 = new SavingsAccount(1000);
    Account account2 = new SavingsAccount(2000);

    bank.addAccount(account1);
    bank.addAccount(account2);

    account1.deposit(500);
    account2.withdraw(300);

    System.out.println("Total balance in the bank: " + bank.getTotalBalance());
  }
}
