/******************************************************************************

	 * Purpose:  Insertion sort for word of string
	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/

package algorithmsPrograms;

import bridgeit.util.Utility;

public class InsertionSortStringWord {

	public static void insertionSortForStringword(String[] array) {
		int hole, i;
		String value;
		for (i = 1; i < array.length; i++) {
			value = array[i];
			hole = i;
			while (hole > 0) {
				if (value.compareTo(array[hole - 1]) > 0) {
					break;
				}
				array[hole] = array[hole - 1];
				hole = hole - 1;
			}
			array[hole] = value;

		}
		System.out.println("insertion Sort array of string ");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		try {

			System.out.println("Enter no. of words to be printed: ");
			int size = Utility.getIntNumber();

			// create string array
			String array[] = new String[size];
			System.out.println();
			System.out.println("Enter the Strings ");

			for (int i = 0; i < array.length; i++) {
				array[i] = Utility.getWordString();
			}
			System.out.println();
			insertionSortForStringword(array);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
