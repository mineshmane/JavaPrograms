/*************************************************************************************************************
 * 
 * @purpose	:Print Number of Wins and Percentage of Win and Loss in Gambler
 * 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class Gambler {

	public static void main(String[] args) {

		try {
			System.out.println("Enter stake ");
			int stake = Utility.getIntNumber();
			System.out.println("Enter goals");
			int goal = Utility.getIntNumber();
			System.out.println(" Enter trials");
			int trials = Utility.getIntNumber();

			Utility.gambler(stake, goal, trials);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
