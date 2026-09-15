package javaOOPS;

/*interfaces contain
 * -->abstract methods
 * -->default methods
 * -->private methods
 * -->static methods
 * -->stsrictfp*/
public interface Bank {
void savingsAccount();
void currentAccount();
default void personalLoan() {
	System.out.println("personal loan");
}
private void homeLoan() {
	System.out.println("home loan");
}
static void hello() {
	System.out.println("static method");
}

}
class SavingsAccount implements Bank{

	@Override
	public void savingsAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		personalLoan();
	} 
	@Override
	public void personalLoan() {
		System.out.println("overridden personalloan method");
	}
	
	
}
