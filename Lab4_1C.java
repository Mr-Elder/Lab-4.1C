// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's 
//   bank accounts       
// ****************************************************************

public class Lab4_1C
{
    public static void main(String[] args)
    {
	Account acct1, acct2;

	//create account1 for Sally with $1000
	acct1 = new Account(1000, "Sally", 1111);

	//create account2 for Joe with $500
	acct2 = new Account(500, "Joe", 1112);


	//deposit $100 to Joe's account
	acct2.deposit(100);

	//print Joe's new balance (use getBalance())
	GetInfo.showMessage(acct2.getName() + " has $" + acct2.getBalance());

	//withdraw $50 from Sally's account
	acct1.withdraw(50);

	//print Sally's new balance (use getBalance())
	GetInfo.showMessage(acct1.getName() + " has $" + acct1.getBalance());

	//charge fees to both accounts
	GetInfo.showMessage(acct1.getName() + " has $" + acct1.chargeFee() + " after being charged a fee of $10");
	GetInfo.showMessage(acct2.getName() + " has $" + acct2.chargeFee() + " after being charged a fee of $10");

	//change the name on Joe's account to Joseph
	acct2.setName("Joeseph");

	//print summary for both accounts
	acct1.printSummary();
	acct2.printSummary();

    }
}
 
