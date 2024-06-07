package AbstarctTask;

import java.util.Scanner;

public class BankingSystemMain {
    public static void main(String[] args) throws Exception {
    Bank bank = new Bank(10);
        Scanner sc = new Scanner(System.in);
  
        while (true) {
    
            System.out.println("Welcome to the Banking System Project:");
            System.out.println("1. Add Savings Account");
            System.out.println("2. Add Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Accounts");
            System.out.println("6. Calculate Interest (Savings Account)");
            System.out.println("7. Check Overdraft (Checking Account)");
            System.out.println("8. Remove Account");
            System.out.println("9. Exit");
            System.out.print("Enter Your CHice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Saving account number: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter Saving account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter initial balance of Saving account: ");
                    double initialBalance = sc.nextDouble();
                    System.out.print("Enter rate of interest of Saving account: ");
                    double rateOfInterest = sc.nextDouble();
                    bank.addAccount(new SavingsAccount(accountNumber, accountHolderName, initialBalance, rateOfInterest));
                    System.out.println("Saving Account No."+accountNumber +" Created Successfully!!!.....");
                    break;
                case 2:
                    System.out.print("Enter Checking account number: ");
                    int accountNumber1 = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter Checking account holder name: ");
                    String accountHolderName1 = sc.nextLine();
                    System.out.print("Enter initial balance of Checking account: ");
                    double initialBalance1 = sc.nextDouble();
                    System.out.print("Enter overdraft limit of Checking account: ");
                    double overdraftLimit = sc.nextDouble();
                    bank.addAccount(new CheckingAccount(accountNumber1, accountHolderName1, initialBalance1, overdraftLimit));
                    System.out.println("Checking Account No."+accountNumber1 +" Created Successfully!!!.....");
                    break;
                case 3:
                    System.out.print("Enter deposit account number: ");
                    int depositAccountNumber = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    Account depositAccount = bank.getAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                        System.out.println("Amount Deposited Successfully!!!...");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter withdrawl account number: ");
                    int withdrawlAccountNumber = sc.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    Account withdrawlAccount = bank.getAccount(withdrawlAccountNumber);
                    if (withdrawlAccount != null) {
                        withdrawlAccount.withdraw(withdrawalAmount);
                        System.out.println("Amount withdrawl Successfully!!!...");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter Account Number To Display Accounts:");
                    int accountNumbers = sc.nextInt();
                    bank.displayAccounts(accountNumbers);
                    break;
                case 6:
                    System.out.print("Enter savings account number to Calculate Rate of Interest: ");
                    int CalculatecAccountNumber = sc.nextInt();
                    Account savCalcAccount = bank.getAccount(CalculatecAccountNumber);
                    if (savCalcAccount instanceof SavingsAccount) {
                        SavingsAccount savAccount = (SavingsAccount) savCalcAccount;
                        System.out.println("Rate of Interest earned: " + savAccount.calculateRateOfInterest());
                    } else {
                        System.out.println("Account not found or not a Savings Account.");
                    }
                    break;
                case 7:
                    System.out.print("Enter checking account number to Check Overdraft: ");
                    int OverdraftAccountNumber = sc.nextInt();
                    System.out.print("Enter amount to check overdraft: ");
                    double checkOverdraftAmount = sc.nextDouble();
                    Account checkOverdraftAccount = bank.getAccount(OverdraftAccountNumber);
                    if (checkOverdraftAccount instanceof CheckingAccount) {
                        CheckingAccount checkAccount = (CheckingAccount) checkOverdraftAccount;
                        System.out.println("Overdraft check: " + checkAccount.checkOverdraft(checkOverdraftAmount));
                    } else {
                        System.out.println("Account not found or not a Checking Account.");
                    }
                    break;

                case 8:
                    System.out.println("Enter Account number To Remove");
                    int accountNumberToRemove =sc.nextInt();
                    bank.removeAccount(accountNumberToRemove);
                    System.out.println("Remove the Account Number"+accountNumberToRemove);
                    
                case 9:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

