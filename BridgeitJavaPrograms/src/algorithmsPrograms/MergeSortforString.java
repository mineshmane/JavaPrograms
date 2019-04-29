/******************************************************************************
	 * Purpose:  merge sort for string

	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/

package algorithmsPrograms;

import bridgeit.util.Utility;

public class MergeSortforString {

	public static void main(String[] arg)

	{
		try {
			int n;
			System.out.println("Enter number of strings : ");
			n = Utility.getIntNumber();
			String[] arr = new String[n];

			System.out.println("Enter strings : ");
			for (int i = 0; i < n; i++) {
				arr[i] = Utility.getWordString();
			}

			System.out.println("\nGiven Array : ");
			Utility.printArray(arr);

			divide(arr, 0, arr.length - 1); // dividing string array par array,start =0 and end =n-1;

			System.out.println("\nSorted array : ");
			printIntArray(arr);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/// <summary>
	/// Sort function to divide array in sub arrays
	/// </summary>
	/// <param name="arr">array of strings</param>
	/// <param name="l">left index</param>
	/// <param name="r">right index</param>
	public static void divide(String[] arr, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			//// Find the middle point
			int middle = (lowIndex + highIndex) / 2;
			//// Sort first and second halves
			divide(arr, lowIndex, middle);
			divide(arr, middle + 1, highIndex);
			//// Merge the sorted halves
			Merge(arr, lowIndex, middle, highIndex);
		}
	}

	/// <summary>
	/// Merge sort for Strings
	/// </summary>
	/// <param name="arr">array of strings</param>
	/// <param name="l">left index</param>
	/// <param name="m">middle index</param>
	/// <param name="r">right index</param>

	public static void Merge(String[] sortArray, int lowIndex, int middle, int highIndex) {
		//// Calculate length of two sub arrays
		int leftSize = middle - lowIndex + 1;
		int rightSize = highIndex - middle;
		// new two sub arrays
		String[] LeftArray = new String[leftSize];
		String[] RightArray = new String[rightSize];

		//// move strings from left of middle in Left sub array
		for (int i = 0; i < leftSize; i++) {
			LeftArray[i] = sortArray[lowIndex + i];
		}

		//// move strings from right of mid in Right sub array
		for (int j = 0; j < rightSize; j++) {
			RightArray[j] = sortArray[middle + 1 + j];
		}
		//// Merge the temporary arrays
		int i = 0, j = 0;
		//// Initial index of merged sub array array
		int k = lowIndex;
		while (i < leftSize && j < rightSize) {
			if (LeftArray[i].compareTo(RightArray[j]) < 0) {// sorting condition checking here
				sortArray[k] = LeftArray[i];
				i++;
			} else {
				sortArray[k] = RightArray[j];
				j++;
			}

			k++;
		}
		//// Copy remaining elements of L[] if any
		while (i < leftSize) {
			sortArray[k] = LeftArray[i];
			i++;
			k++;
		}
		//// Copy remaining elements of R[] if any */
		while (j < rightSize) {
			sortArray[k] = RightArray[j];
			j++;
			k++;
		}
	}

	/// <summary>
	/// Print array of integers
	/// </summary>
	/// <param name="arr">array of integers</param>
	public static void printIntArray(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println();
	}

}
