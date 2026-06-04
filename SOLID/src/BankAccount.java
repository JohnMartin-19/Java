//USING THIS TO LEARN ABOUT LISKOV PRINCIPLE OF SUBSTITUTION
//It basically states that - if class B extends class A, you should be able to use B anywhere A is used without breaking anything.


// Base class only has what ALL accounts can do
public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public double getBalance() { return balance; }
}

// Only accounts that CAN withdraw implement this interface
public interface Withdrawable {
    void withdraw(double amount);
}

// Regular account — can deposit and withdraw
public class SavingsAccount extends BankAccount implements Withdrawable {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
    }
}

// Fixed deposit — can only deposit, no withdraw
public class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(double balance) {
        super(balance);
    }
    // No withdraw — and that's fine because we don't promise one
}

// Now this method only accepts accounts that CAN withdraw — no surprises
public void processWithdrawal(Withdrawable account, double amount) {
    account.withdraw(amount);
}