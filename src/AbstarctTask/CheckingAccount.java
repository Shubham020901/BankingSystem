package AbstarctTask;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Checking");
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverDraftLimit() {
		return overdraftLimit;
	}

	public void setOverDraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

    public boolean checkOverdraft(double amount) {
        return balance + overdraftLimit >= amount;
    }
     

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    @Override
    public String getAccountInfo() {
        return "Account Number: " + getAccountNumber() + ", Holder Name: " + getAccountHolderName() + ", Balance: " + getBalance() + ", Account Type: " + getAccountType();
    }
 
    @Override
	public String toString() {
		return "CheckingAccounts [overDraftLimit=" + overdraftLimit + "]";
	}


}
