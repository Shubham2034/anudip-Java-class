package com.Lab5;

import java.util.List;

interface Account
{
	void deposit(double amount);
	void withdraw(double amount);
	double getalance();
}
class SavingsAccount implements Account
{ 
	private double balance;  
	private double interestRate;
	public void SavingAccount(double initialDeposit, double interestRate) 
	{
	 this.balance =initialDeposit;
	this.interestRate = interestRate;
}
	 @Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount; 
		
	}
	@Override
	public double getalance() {
		
		return balance;
	}
	public void applyInterest() {
		balance += balance * interestRate / 100;
	}
}
class CurrentAccount implements Account
{
	private double balance;  
	private double overdraftLimit;
	public CurrentAccount(double initialDeposit, double overdraftLimit) 
	{
	 this.balance =initialDeposit;
	this.overdraftLimit = overdraftLimit;
}

	@Override
public void deposit(double amount)
	{
		
		balance += amount;		
	
}

@Override
public void withdraw(double amount) {
	balance -= amount; 
	
}

@Override
public double getalance() {
	
	return balance;
}
class Bank
{
	private List accounts;
	public Bank () //constructor
	{
	   
    }
public class BankAccount {

	public void main(String[] args) {
		

	}

}



}
}
