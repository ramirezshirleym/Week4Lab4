public class Account {

	// Declare static variable with default value
	public static int numAccounts = 0;

	// Creates Account instance and counts # of instances created
	public Account() {

		numAccounts++;
	}

	// Static method called getNumAccounts() that returns numAccounts
	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void main(String[] args) {

		new Account();
		new Account();

		System.out.println("Accounts created: " + Account.getNumAccounts());

	}

}
