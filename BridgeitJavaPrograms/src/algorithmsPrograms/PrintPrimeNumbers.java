/*************************************************************************************************************
 * 
 * @purpose	:To find prime numbers between 1 to 1000;

 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 11-04-2019
 */

package algorithmsPrograms;

import bridgeit.util.Utility;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		try {
			System.out.println("Enter number range from");
			int lowest = Utility.getIntNumber();
			System.out.println("Enter number highest raange ");
			int highest = Utility.getIntNumber();

			int count = Utility.printPrimeNumber(lowest, highest);

			System.out.println(count + " Prime numbers are from "+lowest+" to "+highest);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
