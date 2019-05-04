package Calender;

import BridgeIt.util.Utility;
import DSUtility.QueueUsingLinkedList;
import DSUtility.StackUsingLinkedList;

public class CalenderUsingStack {

	public static void main(String[] args) {
		// Creating main object for stack using linkedlist class to sub objects
		StackUsingLinkedList<QueueUsingLinkedList<Integer>> stackMain = new StackUsingLinkedList<QueueUsingLinkedList<Integer>>();
		
		// Creating sub object for stack using linkedlist class to store week days
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		System.out.println("Enter month");
		
		// Calling method to take month from user
		final int Month = Utility.getInt();
		System.out.println("Enter year");
		
		// Calling method to take year from user
		final int Year = Utility.getInt();
	
		// Validating year and month
		if ((Month <= 12 && Month >= 1) && (Year >= 1000 && Year <= 9999)) {
			
			// Calling getday method to find the starting day of month
			final int Start_Day = Utility.getDay(Month, Year);
		
			// Storing number of days containing in each month
			final int Month_Arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			System.out.println(
					"Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thus" + "\t" + "Fri" + "\t" + "Sat");
			
			// Condition for checking year is a leap year or not
			if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
				Month_Arr[1] = 29;
			}
			/*
			 * This for is to store days to sub queues and storing sub queues in main queue
			 */
			for (int i = 1; i <= Month_Arr[Month - 1]; i++) {
				queue.insert(i);// calling insert method to insert elements in to object
			
				// Condition to create new sub queue
				if (((i + Start_Day) % 7 == 0 || i == Month_Arr[Month - 1])) {
					stackMain.push(queue);// inserting subqueue to main queue
					queue = new QueueUsingLinkedList<Integer>(); // creating new sub queue
				}
			}
		
			/* loop to print space where day does not falls */
			for (int i = 0; i < Start_Day; i++) {
				System.out.print("\t");
			}
		
			/* for loop to push elements from stack by poping them from main stack */
			final int Size = stackMain.size();
			StackUsingLinkedList<QueueUsingLinkedList<Integer>> stack = new StackUsingLinkedList<QueueUsingLinkedList<Integer>>();
			
			/* for loop to push elements from stack by poping them from main stack */
			for (int j = 0; j < Size; j++) {
				stack.push(stackMain.pop());// Pushing to stack
			}
			
			/* for loop to pop sub objects from stack */
			for (int i = 0; i < stackMain.size(); i++) {
			
				// Coping sub object and storing it in week
				QueueUsingLinkedList<Integer> week = stack.pop();
			
				/* for loop to print sub object elements */
				for (int j = 0; j < week.size(); j++) {
					System.out.print(week.remove() + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Please enter valid month and date");
		}
	}

}
