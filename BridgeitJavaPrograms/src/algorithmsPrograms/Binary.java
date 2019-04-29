/******************************************************************************************** 

	 * Purpose:  to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
     *  i. Swap nibbles and find the new number.
     *  ii. Find the resultant number is the number is a power of 2
     *
	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/



package algorithmsPrograms;

import bridgeit.util.Utility;

public class Binary {

	/**
	 * Function to print array
	 *
	 * @param array the array to print integer on console
	 */
	static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	

	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	public static void main(String[] args) {

		try {

			System.out.println("Enter a Deacimal number");
			int decimalNumber = Utility.getIntNumber();
			int[] binary = Util.decimalToBinary(decimalNumber);
			System.out.println("Binary is ");
			showArr(binary);
			swapNibbles(binary);
			System.out.println("After swapping ");
			showArr(binary);
			int swapedDecimal = Util.binaryToDecimal(binary);
			System.out.println("Decimal of swapped binary is " + swapedDecimal);

			if (Util.isPowerOfTwo(swapedDecimal))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}

}
