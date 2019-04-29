/*************************************************************************************************************

 * @purpose	:To find Euclidean distance of x and y from origin


 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class Distance {
	public static void main(String[] args) {
		try {
			System.out.println("Enter x and y");
			int x = Utility.getIntNumber();
			int y = Utility.getIntNumber();
			double distance = Utility.findDistance(x, y);

			System.out.println(distance);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
