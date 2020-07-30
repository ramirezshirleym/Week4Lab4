import java.util.Random;

public class Card {
	// Declares arrays for suits and face values
	private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static String[] faceValue = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	int suitInd;
	int faceInd;

	public Card() {
		Random generator = new Random();
		suitInd = generator.nextInt(4);
		faceInd = generator.nextInt(13);
	}

	public String toString() {
		return (suit[suitInd] + " " + faceValue[faceInd]);
	}

	public static void main(String[] args) {
		// Draws 5 random cards
		for (int count = 1; count <= 5; count++) {
			System.out.println(new Card());
		}
	}

}
