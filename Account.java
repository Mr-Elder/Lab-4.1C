//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

import java.text.*;

public class Account
{
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  
  public String getName(){
  	return this.name;
  }
  
  public long getNumber(){
  	return this.acctNum;
  }

  //----------------------------------------------
  // Prints name, account number, and balance.
  //----------------------------------------------
  public void printSummary()
  {
  	String builder = "";
    //print name
    builder += getName() + "\n";;

    //print acct number
	builder += getNumber() + "\n";
	
    //print balance
	builder += getBalance();
	
	GetInfo.showMessage(builder);
  }

  //----------------------------------------------
  // Deducts $10 service fee if balance is under $1000
  //----------------------------------------------
  public double chargeFee()
  {
    if(getBalance() < 1000)
    	this.balance -= 10;
    	
    return getBalance();
  }

  //----------------------------------------------
  // Changes the name on the account 
  //----------------------------------------------
  public void setName(String newName)                       
  {
	this.name = newName;
  }

}

 
