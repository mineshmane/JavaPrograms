/*************************************************************************************************************

 * @purpose	:Binary search for String 

 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package algorithmsPrograms;

import bridgeit.util.Utility;

public class BinarysearchString {
	static int binarySearchString(String[] arr, String x) {
		int start = 0, end = arr.length;
		while (start <= end) {
			int middle = (start + end) / 2;
			int res = x.compareTo(arr[middle]);
			// Check if x is present at middle
			if (res == 0)
				return middle;
			// If x greater, ignore left half
			else if (res > 0)
				start = middle + 1;
			// If x is smaller, ignore right half
			else
				end = middle - 1;
		}
		return -1;
	}
	// Driver method to test above
	public static void main(String[] args) {
		try {

			System.out.println("Enter size of array string");
			int size = Utility.getIntNumber();

			String array[] = new String[size];
			System.out.println("Enter string of array");

			for (int i = 0; i < array.length; i++) {
				array[i] = Utility.getWordString();
			}
			System.out.println("sorted array");
			String[] sorted = Utility.bubbleSortForString(array);
			for (int i = 0; i < array.length; i++) {
				System.out.println(sorted[i]);
			}
			System.out.println("Enter sring to search ");
			String x = Utility.getWordString();

			int result = binarySearchString(sorted, x);
			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at " + "index " + result);

		} catch (Exception e) {

		}
	}

}
