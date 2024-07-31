package model;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Bank bank = new Bank();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Open account\n2. Deposit money\n3. Withdraw money\n4. Check balance\n5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter customer name: ");
	                    String name = scanner.next();
	                    bank.openAccount(name);
	                    break;
	                case 2:
	                    System.out.print("Enter account number: ");
	                    int accountNumber = scanner.nextInt();
	                    Account account = bank.getAccount(accountNumber);
	                    if (account != null) {
	                        System.out.print("Enter deposit amount: ");
	                        double amount = scanner.nextDouble();
	                        account.deposit(amount);
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter account number: ");
	                    accountNumber = scanner.nextInt();
	                    account = bank.getAccount(accountNumber);
	                    if (account != null) {
	                        System.out.print("Enter withdrawal amount: ");
	                        double amount = scanner.nextDouble();
	                        account.withdraw(amount);
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Enter account number: ");
	                    accountNumber = scanner.nextInt();
	                    account = bank.getAccount(accountNumber);
	                    if (account != null) {
	                        System.out.println("Balance: " + account.getBalance());
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	

	}


