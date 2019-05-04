package Orderedlist;

import java.io.PrintWriter;

import java.util.Arrays;

import BridgeIt.util.Utility;
import BridgeIt.util.utility;
import DSUtility.LinkedList;

public class Orderlist {

	public static void main(String[] args) throws Throwable {
		String outPut;
		String path = "/home/mineshmane/list.txt";
		LinkedList<Integer> lList = new LinkedList<Integer>();
		PrintWriter printWriter = new PrintWriter("list.txt");
		int[] number = utility.ReadFileInt(path);
		Arrays.sort(number);
	
		for (int i = 0; i < number.length; i++) {
			lList.add(number[i]);
		}
		System.out.println("list is: ");
		lList.displayList();
		lList.getSize();
		System.out.println("enter the value you want to search in file");
		final int SEARCH = utility.getnumber();// calling method to scan user word
		if (lList.search(SEARCH) == true) // calling search method to check condition
		{
			System.out.println(SEARCH + " number is found in file");
			System.out.println("removing number from flie");

			lList.delete(SEARCH); // deleting the word
			lList.display();// display element
			outPut = lList.getString(); // calling method to store elements in a single variable
			printWriter.write(outPut);// writing data to file
		//	lList.display();
			Utility.writeTofile(lList, path);
		} else {
			System.out.println("number is not found in file");
			System.out.println("where you want to add the number ");

			System.out.println("Enter 1.Add at First");
			System.out.println("Enter 2.Add at Specific Position");
			System.out.println("Enter 3.Add at Middle");
			System.out.println("Enter 4.Add at Last");
			int ch = Utility.getInt();
			switch (ch) {
			case 1:

				lList.insertAtFirst(SEARCH);
				break;
			case 2:
				System.out.println("Enter Postiion ");
				int pos = Utility.getInt();
				lList.insertAtPosition(pos, SEARCH);
				break;
			case 3:

				lList.insertAtMiddle(SEARCH);
				break;
			case 4:
				lList.add(SEARCH);
				break;

			}
			// lList.add(SEARCH);// adding element to object
			lList.display();

			lList.getlast();
		
			lList.getSize();
			outPut = lList.getString();// converting list words to a string
			printWriter.write(outPut);// writing the data to file
			Utility.writeTofile(lList, path);
		}
		printWriter.flush();
		printWriter.close();
	}

}
