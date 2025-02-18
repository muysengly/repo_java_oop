// Define the Account class
public class Account {
    // Private instance variables
    private String accountNumber;
    private double balance;

    // Parameterized constructor with validation
    public Account(String accountNumber, double balance) {
        // Validate accountNumber
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }
        // Validate balance
        if (balance < 0) {
            // Print error message if balance is negative
            System.err.println("Error: Balance cannot be negative.");
            return;
        }
        // Initialize accountNumber with the provided parameter
        this.accountNumber = accountNumber;
        // Initialize balance with the provided parameter
        this.balance = balance;
    }

    // Main method to test the Account class
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Test with valid data
        Account account1 = new Account("12340009", 1000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", 400.00);

        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);
    }
}
