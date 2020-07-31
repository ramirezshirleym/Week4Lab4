import java.util.Arrays;

public class Numbers {

	// Define static method called nextLargest
	public static void nextLargest(int[] inputArray) {

		// Create copy of array to be sorted
		int[] sortedArray = Arrays.copyOf(inputArray, inputArray.length);

		// Sort array
		Arrays.sort(sortedArray);

		int inputLen = inputArray.length;

		// Search for value in sorted array and return next largest value
		for (int index = 0; index < inputLen; index++) {

			int currentNum = inputArray[index];
			System.out.print(currentNum + " : ");

			int currentInd = Arrays.binarySearch(sortedArray, currentNum);
			int nextInd = (currentInd + 1);
			int nextLarge;

			if (nextInd == inputLen) {
				nextLarge = Integer.MAX_VALUE;
			} else {
				nextLarge = sortedArray[nextInd];
			}

			System.out.print(nextLarge);
			System.out.println();

		}

	}

	public static void main(String[] args) {

		int[] array = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };

		Numbers.nextLargest(array);

	}

}
