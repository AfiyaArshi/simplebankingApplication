package simplebankingapplication1;


	import java.util.Scanner;

	class BankAccount {
	    private String name;
	    private long accountNumber;
	    private double balance;
	    private String email;
	    private long phoneNumber;

	    public BankAccount(String name, long accountNumber, double balance, String email, long phoneNumber) {
	        this.name = name;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit of " + amount + " successful.");
	        System.out.println("New balance: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance < amount) {
	            System.out.println("Insufficient balance.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " successful.");
	            System.out.println("New balance: " + balance);
	        }
	    }

	    public void printAccountDetails() {
	        System.out.println("Account Holder Name: " + name);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Balance: " + balance);
	        System.out.println("Account Holder Email: " + email);
	        System.out.println("Account Holder Phone Number: " + phoneNumber);
	    }

		public void balance(double balance2) {
			// TODO Auto-generated method stub
			
		}
	}

	public class SimpleBankingApplication {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        BankAccount account1 = new BankAccount("John Smith", 123456789, 50000, "john.smith@gmail.com", 1234567890);

	        System.out.println("Welcome to the Banking Application.");
	        System.out.println("Please select an option:");
	        System.out.println("1. 3000");
	        System.out.println("2. 10000");
	        System.out.println("3. 123456789");
            System.out.println("4. 50000");
	        int option = scanner.nextInt();

	        switch (option) {
	            case 1:
	                System.out.println("5000:");
	                double depositAmount = scanner.nextDouble();
	                account1.deposit(depositAmount);
	                break;
	            case 2:
	                System.out.println("10000:");
	                double withdrawalAmount = scanner.nextDouble();
	                account1.withdraw(withdrawalAmount);
	                break;
	            case 3:
	                account1.printAccountDetails();
	                break;
	            case 4:
	            	System.out.println("50000");
	            	double balance =scanner. nextDouble();
	            	account1.balance(balance);
	            default:
	                System.out.println("Invalid option selected.");
	                break;
	        }
	    }
	

		// TODO Auto-generated method stub

	}

