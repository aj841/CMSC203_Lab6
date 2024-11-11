/*
 Class: CMSC203 CRN 22502
 Program: Assignment 4 Design
 Instructor: Dr. Kuijt
 Summary of Description: CheckingAccount
 Due Date: 11/10/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student: Alex Kim
*/

public class CheckingAccount extends BankAccount{
	private static final double FEE = .15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);
	}
}
