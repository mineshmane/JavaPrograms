/*************************************************************************************************************
 * @purpose	:To print nth harmonic number
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */


package FunctionalPrograms;

import bridgeit.util.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		try {

			System.out.println("Enter valid number ");
			int number = Utility.getIntNumber();
			System.out.print("table of " + number + " Harmonic numbers: ");
			Utility.harmonic(number);

		} catch (Exception e) {
			System.out.println(e + "Enter valid input");
			// TODO: handle exception
		}

	}

}
