/*************************************************************************************************************

 * @purpose	:Binary search for Integer Array 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package algorithmsPrograms;

import bridgeit.util.Utility;

public class BinarySearchForInt {

	public static int binarySearchForInt(int[] arr, int searchkey) {
		int higherIndex = arr.length - 1, lowerIndex = 0, middle;
		while (lowerIndex <= higherIndex) {
			middle = (lowerIndex + higherIndex) / 2;
			if (searchkey == arr[middle]) {
				return middle;
			} else if (arr[middle] < searchkey) {
				lowerIndex = middle + 1;
			} else {
				higherIndex = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter size of array string");
			int size = Utility.getIntNumber();

			int array[] = new int[size];
			System.out.println("Enter integr elements  of array");
			int[] sorted = Utility.bubbleSortForInt(array);
			System.out.println("sorted array ");

			for (int i = 0; i < array.length; i++) {
				System.out.println(sorted[i]);
			}

			System.out.println("Enter sring to search ");
			int x = Utility.getIntNumber();
			int result = binarySearchForInt(sorted, x);

			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at " + "index " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
