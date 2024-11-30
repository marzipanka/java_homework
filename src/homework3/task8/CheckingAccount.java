package homework3.task8;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double calculateInterest() {
        return this.getBalance();
    }
}
