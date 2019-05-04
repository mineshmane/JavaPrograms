package Orderedlist;

import java.io.PrintWriter;
import java.util.Arrays;

import BridgeIt.util.utility;
import DSUtility.LinkedList;

public class Runner {

	public static void main(String[] args) throws Throwable {
		String outPut;
		String path = "/home/admin1/list.txt";
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		PrintWriter printWriter = new PrintWriter("list.txt");
		int[] number = utility.ReadFileInt(path);
		Arrays.sort(number);
		for (int i = 0; i < number.length; i++) {
			linkedList.add(number[i]);
		}
		System.out.println("list is: ");
		linkedList.displayList();
		System.out.println("enter the value you want to search in file");
		final int SEARCH = utility.getnumber();// calling method to scan user word
		if (linkedList.search(SEARCH) == true) // calling search method to check condition
		{
			System.out.println("value is found in file");
			System.out.println("removing word from flie");

			linkedList.delete(SEARCH); // deleting the word
			// linkedList.display();// display element
			outPut = linkedList.getString(); // calling method to store elements in a single variable
			printWriter.write(outPut);// writing data to file
			linkedList.display();
		} else {
			System.out.println("word is not found in file");
			System.out.println("adding word to file");

			System.out.println("Adding Element to file where you wand to add ");

			System.out.println("Enter 1.add at first");
			System.out.println("Enter 2.add at specific position");
			System.out.println("Enter 3.add at middle");
			System.out.println("Enter 4.add at last");
			int ch = utility.getnumber();
			switch (ch) {
			case 1:

				linkedList.insertAtFirst(SEARCH);
				break;
			case 2:
				System.out.println("Enter position ");
				int pos = utility.getnumber();
				linkedList.insertAtPosition(pos, SEARCH);
				break;
			case 3:

				linkedList.insertAtMiddle(SEARCH);
				break;
			case 4:
				linkedList.add(SEARCH);
				break;

			}

			// linkedList.add(SEARCH);// adding element to object
			linkedList.display();
			outPut = linkedList.getString();// converting list words to a string
			printWriter.write(outPut);// writing the data to file
		}
		printWriter.flush();
		printWriter.close();
	}

}
