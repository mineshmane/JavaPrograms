/******************************************************************************
	 * Purpose: Methods for Binary search,bubble sort and Insertion sort Integer and string

	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/


package algorithmsPrograms;

import bridgeit.util.Utility;

public class Methods {

	public static void main(String[] args) {
		try {

			System.out.println("Menu:");
			System.out.println("1.binarySearch method for integer\n" + "\n2.binarySearch method for String\n"
					+ " \n3.insertionSort method for integer\n" + "\n4.insertionSort method for String\n"
					+ "\n5.bubbleSort method for integer\n" + "\n6.bubbleSort method for String\n");

			System.out.println("Enter your choices:");
			int choice = Utility.getIntNumber();
			switch (choice) {
			// =================================================================================
			case 1:
				System.out.println("Enter size of array");
				int size = Utility.getIntNumber();

				int array[] = new int[size];
				System.out.println("Enter elements of array");

				for (int i = 0; i < array.length; i++) {
					array[i] = Utility.getIntNumber();
				}
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}

				System.out.println("Enter integer to search ");
				int x = Utility.getIntNumber();
				int result = Utility.binarySearchForInt(array, x);

				if (result == -1)
					System.out.println("Element not present");
				else
					System.out.println("Element found at " + "index " + result);

				break;
			// --------------------------------------------------------------------
			case 2:
				System.out.println("Enter size of string array ");
				int s = Utility.getIntNumber();

				String arr[] = new String[s];
				System.out.println("Enter " + s + " String Elements");
				System.out.println("size of array" + arr.length);

				for (int j = 0; j < arr.length; j++) {
					arr[j] = Utility.getWordString();
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}

				System.out.println("Enter sring to search ");
				String str = Utility.getWordString();
				int resul = Utility.binarySearchForString(arr, str);

				if (resul == -1)
					System.out.println("Element not present");
				else
					System.out.println("Element found at " + "index " + resul);

				break;
			// ========================================================================

			case 3:

				System.out.println("Enter the Size of Array for sorting :");
				int n = Utility.getIntNumber();
				int[] arr1 = new int[n];
				System.out.println("enter elements of  " + n + " integer type array");
				for (int i = 0; i < arr1.length; i++) {
					arr1[i] = Utility.getIntNumber();
				}
				System.out.println("Integer Array:");
				for (int i = 0; i < n; i++) {
					System.out.println(arr1[i]);
				}

				Utility.insertionSortForInt(arr1);
				break;
			// =============================================================================
			case 4:

				Utility.insertionString();

				break;

			// ===================================================================
			case 5:

				int i;

				System.out.println("Enter size of array");
				int num = Utility.getIntNumber();
				int a[] = new int[num];
				System.out.println();
				System.out.println("Enter value for array " + num + " numbers:");

				Utility.bubbleSortForInt(a);

				System.out.println();
				System.out.println("The sorted order is:");

				for (i = 0; i < a.length; i++) {
					System.out.println(a[i]); // printing the sorted array
				}
				break;
			case 6:

				System.out.println("Enter size of array:");
				int number = Utility.getIntNumber();
				String string[] = new String[number];

				System.out.println("Enter value for array " + number + " numbers:");

				for (i = 0; i < string.length; i++) {
					string[i] = Utility.getWordString(); // taking input from user
				}

				Utility.bubbleSortForString(string);

				System.out.println();
				System.out.println("The sorted order is:");

				for (i = 0; i < string.length; i++) {
					System.out.println(string[i]); // printing the sorted array
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
