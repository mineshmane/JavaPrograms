/*************************************************************************************************************
 * @purpose	:Write Class Static Functions to generate random number and to process distinct coupons.
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class Coupon {
	public static void main(String[] args) {

		System.out.println("Enter number");

		int number = Utility.getIntNumber();

		
		int count = Utility.collect(number);

		System.out.println("ticket count  " + count);

	}

}
