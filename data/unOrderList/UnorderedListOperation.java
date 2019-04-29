package unOrderList;

import java.io.PrintWriter;

import DSUtility.LinkedList;
import BridgeIt.util.Utility;
import BridgeIt.util.utility;

public class UnorderedListOperation {

	public static void main(String[] args) throws Exception {
		String outPut;
		String path = "/home/mineshmane/mm.txt";// path to get file
		LinkedList<String> linkedList = new LinkedList<String>();
		PrintWriter printWriter = new PrintWriter("mm.txt");
		String[] word = utility.fileReadString(path);// storing data into word after
		for (int i = 0; i < word.length; i++) {
			linkedList.add(word[i]);
		}
		(linkedList).display();
		System.out.println("Enter element to search from  file ");
		String searchElement = utility.getStringName();
		if (linkedList.search(searchElement) == true) {

			System.out.println(searchElement + " Element found form file ");
			System.out.println("Removing Element from  file");
			linkedList.delete(searchElement);
			linkedList.display();
			outPut = linkedList.getString();
			System.out.println("out");
			printWriter.write(outPut);
			Utility.writeTofile(linkedList,path);

		} else {
			System.out.println("Oops Element not Find form file ");
			System.out.println("Adding Element to file ");
			linkedList.add(searchElement);

			linkedList.display();
			outPut = linkedList.getString();
			printWriter.write(outPut);
			Utility.writeTofile(linkedList,path);
		}
		printWriter.flush();
		printWriter.close();
	}

}