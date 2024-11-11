/*
 Class: CMSC203 CRN 22502
 Program: Assignment 4 Design
 Instructor: Dr. Kuijt
 Summary of Description: SavingsAccount
 Due Date: 11/10/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student: Alex Kim
*/

public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount other, double amount) {
		super(other, amount);
		this.savingsNumber = other.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest() {
		double balance = super.getBalance();
		double monthly = rate/12*balance;
		super.setBalance(balance + monthly);
	}
	
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
}
