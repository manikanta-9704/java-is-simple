package oops.inheritance;
   /*  BankAccount
    /      |        \
   /       |         \
  /        |          \
Savings  Current  FixedDeposit*/
//Parent:

//accountNumber
//balance
//deposit()
//
//Savings:
//
//calculateInterest()
//
//Current:
//
//withdraw()
//
//FixedDeposit:
//
//calculateMaturityAmount()
//
//Create objects for all three account types.
public class BankAccount {
	String accountNumber;
	double balance;
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	void checkBalance() {
		System.out.println("account balance:"+balance);
	}

}
//child class1
class savingsAccount extends BankAccount {

	double roi=0.6;
	void calculateIntrest() {
		balance*=roi;
	}
}
class Current extends BankAccount{

		// TODO Auto-generated method stub

	}

