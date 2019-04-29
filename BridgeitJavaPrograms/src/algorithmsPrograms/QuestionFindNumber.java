
/******************************************************************************
	 * Purpose: takes a command-line argument a number and find the guesses that number by asking  answer with n questions.

	 * @author Minesh Mane
	 * @version 1.0
	 * @since 11-04-2019
	 *
	 ******************************************************************************/



package algorithmsPrograms;

import java.util.Scanner;

import bridgeit.util.Utility;

public class QuestionFindNumber {

	static Scanner S = new Scanner(System.in);

	static long find(long powerOftwo) {

		long low = 0, high = powerOftwo - 1, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("Enter  1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int answer = Utility.getIntNumber();
			mid = (low + high) / 2;
			if (answer == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		try {
			System.out.println("guess a no between 0 to 127 ");
			long number = Utility.getIntNumber();
			long Number = (int) Math.pow(2, number);
			System.out.println("guessed no is " + find(Number));
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}
