package AbstarctTask;

public class Bank {
    private Account[] accounts;
    private int numberOfAccounts;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        numberOfAccounts = 0;
    }

     
	 public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}


	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}
 
    public void addAccount(Account account) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = account;
        } else {
            System.out.println("Bank is at full capacity.");
        }
    }

 
    public void removeAccount(int accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i] = accounts[--numberOfAccounts];
                accounts[numberOfAccounts] = null;
                return;
            }
        }
        System.out.println("Account not found.");
    }


    public void displayAccounts(int accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].getAccountInfo());
        }
    }

    public Account getAccount(int accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}

