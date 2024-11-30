package homework3.task8;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double calculateInterest() {
        return this.getBalance() * 1.05;
    }
}
