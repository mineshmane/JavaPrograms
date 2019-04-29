/*************************************************************************************************************
 * @purpose	:To print 2 Dimensional Array integer ,boolean, double. use PrintWriter to print the output to the screen.
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	:11-04-2019
 */

package FunctionalPrograms;

import java.io.PrintWriter;

import bridgeit.util.Utility;

public class TwoDArray {

	public static void main(String[] args) {

		try {
			PrintWriter pw = new PrintWriter(System.out, true);
			System.out.println("Menu:");
			System.out.println("1.Integer array\n2.Double array \n3.Boolean array");

			System.out.println("Enter your choices:");
			int choice = Utility.getIntNumber();
			switch (choice) {
			case 1:
				System.out.println("Enter rows of Integer array");
				int rows = Utility.getIntNumber();
				System.out.println("Enter coloums of Integer array");
				int coloums = Utility.getIntNumber();

				int arr[][] = new int[rows][coloums];
				System.out.println("Enter Elements  Integer array");

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						arr[i][j] = Utility.getIntNumber();
					}
				}
				System.out.println("Array: ");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						pw.print(arr[i][j] + " ");
					}
					pw.println();
				}

				break;

			case 2:
				System.out.println("Enter rows of array");
				int rowd = Utility.getIntNumber();
				System.out.println("Enter coloums of array");
				int columnd = Utility.getIntNumber();

				double arrd[][] = new double[rowd][columnd];
				System.out.println("Enter Elements of Double type of  array");
				for (int i = 0; i < arrd.length; i++) {
					for (int j = 0; j < arrd.length; j++) {
						arrd[i][j] = Utility.getDouble();
					}
				}
				for (int i = 0; i < arrd.length; i++) {
					for (int j = 0; j < arrd.length; j++) {
						pw.print(arrd[i][j] + " ");
					}
					pw.println();
				}

				break;

			case 3:
				System.out.println("Enter rows of array");
				int rowb = Utility.getIntNumber();
				System.out.println("Enter coloums of array");
				int columnb = Utility.getIntNumber();

				boolean arrb[][] = new boolean[rowb][columnb];
				System.out.println("Enter your array");
				for (int i = 0; i < arrb.length; i++) {
					for (int j = 0; j < arrb.length; j++) {
						arrb[i][j] = Utility.getBooleanNumber();
					}
				}
				for (int i = 0; i < arrb.length; i++) {
					for (int j = 0; j < arrb.length; j++) {
						pw.print(arrb[i][j] + " ");
					}
					pw.println();
				}

				break;
			}

		} catch (Exception e) {
			System.err.println(e); // TODO: handle exception
		}
	}
}
