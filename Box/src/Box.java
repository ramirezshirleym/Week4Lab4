public class Box {

	// Declare instance variable with default value
	public int size = 0;

	// Define printBox instance method - no parameters
	public void printBox() {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Define printBox instance method - char c as parameter
	public void printBox(char c) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print('c');
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		// Create new Box object
		Box starBox = new Box();

		// Change size to 5 for starBox object
		starBox.size = 5;

		// Invoke each version of printBox method
		System.out.println("Overloading printBox Method");
		System.out.println();
		System.out.println("No Parameters:");
		starBox.printBox();
		System.out.println();
		System.out.println("One Parameter: char c ");
		starBox.printBox('c');
	}

}
