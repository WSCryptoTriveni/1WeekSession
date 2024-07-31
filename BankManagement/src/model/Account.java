package model;

import java.util.HashMap;
import java.util.Map;

public class Account {
	
	  private Customer customer;
	    private double balance;

	    public Account(Customer customer) {
	        this.customer = customer;
	        this.balance = 0.0;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }



   @Override
      public String toString() {
        return "BankAccount{customer=" + customer + ", balance=" + balance + '}';
}
}

//Bank class to manage multiple accounts
class Bank {
private Map<Integer, Account> accounts = new HashMap<>();
private int nextAccountNumber = 1;

public Account openAccount(String customerName) {
    Customer customer = new Customer(customerName, nextAccountNumber++);
    Account account = new Account(customer);
    accounts.put(customer.getAccountNumber(), account);
    System.out.println("Account opened for " + customerName + " with account number " + customer.getAccountNumber());
    return account;
}

public Account getAccount(int accountNumber) {
    return accounts.get(accountNumber);
}

}
