/******************************************************************************
	
	 * Purpose: Insertion Sort for Integer values
	 * @author minesh mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/

package algorithmsPrograms;

import bridgeit.util.Utility;

public class InsertionSortForInt {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the Size of Array for sorting :");
			int size = Utility.getIntNumber();
			int[] array = new int[size];
			System.out.println("enter elements of integer type array");
			for (int i = 0; i < array.length; i++) {
				array[i] = Utility.getIntNumber();
			}
			System.out.println("Integer Array:");
			for (int i = 0; i < size; i++) {
				System.out.println(array[i]);
			}

			Utility.insertionSortForInt(array);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
