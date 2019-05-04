package unOrderList;

import java.io.PrintWriter;

import DSUtility.LinkedList;

import BridgeIt.util.utility;

public class UnorderedListOperation {

	public static void main(String[] args) throws Exception {
		String outPut;
		String path = "/home/admin1/min.txt";// path to get file

		LinkedList<String> linkedList = new LinkedList<String>();

		PrintWriter printWriter = new PrintWriter("min.txt");

		String[] word = utility.fileReadString(path);// storing data into word after

		for (int i = 0; i < word.length; i++) {

			linkedList.add(word[i]);
		}
		linkedList.displayList();

		System.out.println("Enter element to search from  file ");
		String searchElement = utility.getStringName();

		if (linkedList.search(searchElement) == true) {

			System.out.println(searchElement + " Element is found form file ");

			System.out.println("Removing Element from  file");

			linkedList.delete(searchElement);

			linkedList.display();

			outPut = linkedList.getString();

			System.out.println(searchElement + " out");

			printWriter.write(outPut);
			// utility.writeTofile(linkedList, path);

		} else {
			System.out.println("Oops Element is not Found in file ");
			System.out.println("Adding Element to file where you wand to add ");

			System.out.println("Enter 1.add at first");
			System.out.println("Enter 2.add at specific position");
			System.out.println("Enter 3.add at middle");
			System.out.println("Enter 4.add at last");
			int ch = utility.getnumber();
			switch (ch) {
			case 1:

				linkedList.insertAtFirst(searchElement);
				break;
			case 2:
				System.out.println("Enter position ");
				int pos = utility.getnumber();
				linkedList.insertAtPosition(pos, searchElement);
				break;
			case 3:

				linkedList.insertAtMiddle(searchElement);
				break;
			case 4:
				linkedList.add(searchElement);
				break;

			}

			linkedList.display();
			linkedList.getlast();
			outPut = linkedList.getString();
			printWriter.write(outPut);
			// Utility.writeTofile(linkedList, path);
		}
		printWriter.flush();
		printWriter.close();
	}

}
