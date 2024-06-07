package AbstarctTask;

public class SavingsAccount  extends Account{
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
    public double calculateRateOfInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Amount to withdraw.");
        }
    }

    @Override
    public String getAccountInfo() {
        return "Account Number: " + getAccountNumber() + ", Holder Name: " + getAccountHolderName() + ", Balance: " + getBalance() + ", Account Type: " + getAccountType();
    }

    @Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	}
    
}

