/*************************************************************************************************************
 * @purpose	:To print prime factors of number
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */




package FunctionalPrograms;

import bridgeit.util.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		try {

			System.out.println("\n Please Enter any number to Find it's Prime Factors :  ");
			int number = Utility.getIntNumber();

			System.out.println("\n Prime Factors of a Given Number are : \n");
			Utility.primeFactors(number);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
