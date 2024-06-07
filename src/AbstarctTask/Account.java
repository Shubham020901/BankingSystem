package AbstarctTask;

public abstract class Account {
    private int accountNumber;
    private String accountHolderName;
    protected double balance;
    private String accountType;

    public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract String getAccountInfo();

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;  
    }
    
    public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    @Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", accountType=" + accountType + "]";
	}

}

