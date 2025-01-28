class Account {
    private int balance;

    // Setter
    void setBalance(int amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Getter
    int getBalance() {
        return balance;
    }
}

// Main program
public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(5000);
        System.out.println("Balance: " + account.getBalance()); // Output: Balance: 5000
    }
}
