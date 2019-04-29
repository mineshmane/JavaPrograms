/******************************************************************************
 * Purpose:  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can 
 * be returned by Vending Machine. Write a Program to calculate the minimum
 * number of Notes as well as the Notes to be returned by the Vending Machine 
 * as a Change
 *
 * @author Minesh Mane
 * @version 1.0   
 * @since 13-04-2019
 *
 ******************************************************************************/

package algorithmsPrograms;

import java.util.Scanner;

import bridgeit.util.Utility;

public class VendingMachine {

	/*
	 * static variable I is declared to change notes and Static variable TOTAL is
	 * declared to count total notes
	 */
	static int noteCounter;

	/*
	 * Static array to store values of notes
	 */
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static void changeConverter(int value) {
		int total = 0;
		for (int i = 0; i < notes.length; i++) {
			if (value / notes[i] != 0) {
				int NumberofNotes = (value / notes[i]);
				total = total + NumberofNotes;
				System.out.println(notes[i] + " Rs notes :" + NumberofNotes);// ith number of notes
				value = value % notes[i];
			}
		}
		System.out.println("total notes" + total); // count total notes
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter amoumt");
			int value = Utility.getIntNumber();
			changeConverter(value);

			s.close();
		} catch (Exception e) {
			System.out.println("enter value in integer");
		}
	}

}
