package primeNumber;

import BridgeIt.util.Utility;

import DSUtility.QueueUsingLinkedList;

public class PrimeAnagramUsingQueue {
	
	
		/**
		 * @param args : it takes string array as command line arguments 
		 */
		public static void main(String[] args) 
		{ 
			//creating object for queue using linked list class
			QueueUsingLinkedList<Integer> list = new QueueUsingLinkedList<Integer>();
			// calling method to store all prime numbers in an array
			final int prime[] = Utility.convertToIntegerArray();
			/*for loop to add all prime numbers to object*/
			for (int i=0;i<prime.length;i++)
			{
				list.insert(prime[i]); // calling method to insert prime elements in to object
			}
			list.display(); // calling method to display elements in object
		}

}
