/*************************************************************************************************************
 * 
 * @purpose	:Quadratic equation find real and imaginary roots of equation 
 * 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 11-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class Quadratic {

	public static void main(String[] args) {

		try {
			System.out.println("enter value of a");
			double a = Utility.getDouble();
			System.out.println("value of b ");
			double b = Utility.getDouble();
			System.out.println("value of c ");
			double c = Utility.getDouble();
			double root1, root2;

			// Determinant formulae b^2-4ac
			double delta = b * b - 4 * a * c;

			// if delta is greater than zero condition for real and different roots
			// Determinant
			if (delta > 0) {
				root1 = (-b + Math.sqrt(delta)) / (2 * a);
				root2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
				// System.out.println("root1 : "+root1+" root 2: "+ root2);
			}
			// if delta is equals to zero then Condition for real and equal roots
			else if (delta == 0) {
				root1 = root2 = -b / (2 * a);

				System.out.format("root1 = root2 = %.2f;", root1);
			}
			// If delta is less than zero then roots are not real
			else {
				double realPart = -b / (2 * a);
				double imaginaryPart = Math.sqrt(-delta) / (2 * a);

				System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
						imaginaryPart);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
