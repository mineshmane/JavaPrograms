
/*************************************************************************************************************
 * @purpose	:Read file and search word from that file by using binary search
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package algorithmsPrograms;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import bridgeit.util.Utility;

public class SearchWordFile {

	public static String[] fileRead(File file) throws IOException {
		String word = "";
		ArrayList<String> stringArraylist = new ArrayList<String>();
		FileReader filereader = new FileReader(file);
		int c;
		while ((c = filereader.read()) != -1) {
			if (c == 32) {
				stringArraylist.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		filereader.close();
		String[] s = new String[stringArraylist.size()];
		stringArraylist.toArray(s);
		return s;
	}


	public static void main(String[] args) throws Exception {
		
		try {
			File file = new File("/home/roha/min.txt");
			String arr[] = fileRead(file);
			for (String string : arr) {
				System.out.println(string);
			}
			System.out.println("Enter String to Search");
			String s1 = Utility.getString();
			int i = Utility.binarySearchForString(arr, s1);
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("String is found at " + i + " th index ");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

}
