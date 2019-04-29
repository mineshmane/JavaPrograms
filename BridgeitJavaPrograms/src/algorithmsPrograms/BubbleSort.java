/*************************************************************************************************************

 * @purpose	:Bubble sort for integer values 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 12s-04-2019
 */

package algorithmsPrograms;

import bridgeit.util.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		try {

			int i;

			System.out.println("Enter how many numbers to be Bubble sorted:");
			int n = Utility.getIntNumber();
			int a[] = new int[n];
			System.out.println();
			System.out.println("Enter value for array " + n + " numbers:");

			Utility.bubbleSortForInt(a);

			System.out.println();
			System.out.println("The sorted order is:");

			for (i = 0; i < a.length; i++) {
				System.out.println(a[i]); // printing the sorted array
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
