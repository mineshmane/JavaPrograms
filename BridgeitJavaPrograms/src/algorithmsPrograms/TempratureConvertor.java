
/******************************************************************************
	 * Purpose:  To Convert the temperature from celcius to fahreinheit and vice-versa
	 * @author Minesh Mane
	 * @version 1.0   
	 * @since 13-04-2019
	 *
	 ******************************************************************************/

package algorithmsPrograms;

import java.util.Scanner;

import bridgeit.util.Utility;

public class TempratureConvertor {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter temperature in c or f");
			char t = s.next().charAt(0);
			int tem = Utility.temperaturConversion(t);
			System.out.print(" Temperature  is " + tem);
			s.close();
		} catch (Exception e) {
			System.out.print("temperature in format 45 c");
		}

	}

}
