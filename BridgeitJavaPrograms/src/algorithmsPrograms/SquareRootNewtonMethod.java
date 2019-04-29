/***************************************************************************************************************

 * @purpose	:Computes the square root of a nonnegative number c using
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019 
 */

package algorithmsPrograms;

import bridgeit.util.Utility;

public class SquareRootNewtonMethod {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the number to find root ");

			double c = Utility.getDouble();
			double epsilon = 1e-15; // relative error tolerance
			double t = c; // estimate of the square root of c

			// repeatedly apply Newton update step until desired precision is achieved
			if (c >= 0) {
				//math.abs is used for absolute value for double value
				while (Math.abs(t - c / t) > epsilon * t) {
					t = (c / t + t) / 2.0;
				}
				// print out the estimate of the square root of c
				System.out.println(t);
			} else {
				System.out.println("Enter non negatve number ");
			}

		} catch (Exception e) {

		}

	}

}
