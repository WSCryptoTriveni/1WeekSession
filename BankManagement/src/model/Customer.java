package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
	
	
	 private String name;
	    private int accountNumber;

	    public Customer(String name, int accountNumber) {
	        this.name = name;
	        this.accountNumber = accountNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    @Override
	    public String toString() {
	        return "BankCustomer{name='" + name + "', accountNumber=" + accountNumber + '}';
	    }

	

}
