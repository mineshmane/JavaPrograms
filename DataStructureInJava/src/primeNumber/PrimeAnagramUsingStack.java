//Reveres order prime number


package primeNumber;

import BridgeIt.util.Utility;
import DSUtility.StackUsingLinkedList;

public class PrimeAnagramUsingStack {

	/**
	 * @param args : it takes string array as command line arguments
	 */
	public static void main(String[] args) {
		// creating object to stack using linked list class to store elements 
		
		StackUsingLinkedList<Integer> stackll = new StackUsingLinkedList<Integer>();
		
		// storing prime anagram elements in a array
		
		
		final int prime_Anagram[] = Utility.convertToIntegerArray();
		
		/* for loop to push elements to object */
		
		for (int i = 0; i < prime_Anagram.length; i++) {
			
			// calling method to push elements
			stackll.push(prime_Anagram[i]);
		}
		
		// method to display elements in object
		stackll.display();
	}

}
