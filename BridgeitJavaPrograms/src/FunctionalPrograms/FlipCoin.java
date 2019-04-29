/*************************************************************************************************************
 * @purpose	:Flip Coin and print percentage of Heads and Tails by using Random Function
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		int flipCoinTimes = 0;

		double result;
		double heads = 0;

		System.out.println("Enter Number you have to flip the coin");
		flipCoinTimes = Utility.getIntNumber();
		if (flipCoinTimes > 0) {
			for (int i = 1; i <= flipCoinTimes; i++) {
				result = Math.random();
				if (result <= 0.5) {
					heads++;
				}
			}

			System.out.println("heads := " + heads);
			double percentHeads = heads / flipCoinTimes * 100;
			double percentTails = (flipCoinTimes - heads) / flipCoinTimes * 100;
			System.out.println("the perentage of heads is: " + percentHeads);
			System.out.println("the perentage of tails is: " + percentTails);

		} else {
			System.out.println("Please Enter Positive Integer");
		}
	}

}
