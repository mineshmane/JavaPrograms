
/******************************************************************************
	 * Purpose: Calculate Monthly payment take p y and r command line arguments

	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/

package algorithmsPrograms;

import bridgeit.util.Utility;

public class MonthlyPayments {

	public static void main(String[] args) {
		try {

			double p = Double.parseDouble(args[0]);

			double y = Double.parseDouble(args[1]);

			double r = Double.parseDouble(args[2]);

			System.out.println("Mothly payment is " + Utility.monthlyPayment(p, y, r));
		} catch (Exception e) {

		}

	}

}
