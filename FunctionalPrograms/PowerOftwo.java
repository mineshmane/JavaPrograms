/*************************************************************************************************************
 * @purpose	:To print table of power of two
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	:08-04-2019
 */


package FunctionalPrograms;

import bridgeit.util.Utility;

public class PowerOftwo {

	public static void main(String[] args) {

		try {
			

			System.out.println("Eneter  powerValue");
			int powerValue =Integer.parseInt(args[0]);  // the i nth power of two

			Utility.poweroftwo(powerValue);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
