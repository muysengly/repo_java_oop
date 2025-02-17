import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
  private double balance;
  private Lock lock;

  public BankAccount() {
    balance = 0.0;
    lock = new ReentrantLock();
  }

  public void deposit(double amount) {
    lock.lock();
    try {
      balance += amount;
      System.out.println("Deposit: " + amount);
      System.out.println("Balance after deposit: " + balance);
    } finally {
      lock.unlock();
    }
  }

  public void withdraw(double amount) {
    lock.lock();
    try {
      if (balance >= amount) {
        balance -= amount;
        System.out.println("Withdrawal: " + amount);
        System.out.println("Balance after withdrawal: " + balance);
      } else {
        System.out.println("Try to Withdraw: " + amount);
        System.out.println("Insufficient funds. Withdrawal cancelled.");
      }
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    Thread depositThread1 = new Thread(() -> account.deposit(1000));
    Thread depositThread2 = new Thread(() -> account.deposit(300));
    Thread withdrawalThread1 = new Thread(() -> account.withdraw(150));
    Thread withdrawalThread2 = new Thread(() -> account.withdraw(1200));

    depositThread1.start();
    depositThread2.start();
    withdrawalThread1.start();
    withdrawalThread2.start();
  }
}
