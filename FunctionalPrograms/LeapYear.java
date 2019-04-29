/*************************************************************************************************************
 * @purpose	:Take input year from user and  check year is leap year or not. 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class LeapYear {

	public static void main(String[] args) {

		int year = 0;

		System.out.println("Enter valid Year");
		year = Utility.getIntNumber();
		
		Utility.cheakleapYear(year);
		

	}

}
