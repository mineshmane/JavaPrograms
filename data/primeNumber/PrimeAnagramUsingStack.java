package primeNumber;

import BridgeIt.util.Utility;
import DSUtility.StackUsingLinkedList;

public class PrimeAnagramUsingStack {

	/**
	 * @param args : it takes string array as command line arguments
	 */
	public static void main(String[] args) {
		// creating object to stackusinglinkedlist class to store elements
		StackUsingLinkedList<Integer> sll = new StackUsingLinkedList<Integer>();
		// storing primeanagram elements in a array
		final int prime_Anagram[] = Utility.convertToIntegerArray();
		/* for loop to push elements to object */
		for (int i = 0; i < prime_Anagram.length; i++) {
			// caling method to push elements
			sll.push(prime_Anagram[i]);
		}
		// method to display elements in object
		sll.display();
	}

}
