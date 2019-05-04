package BankCounter;

import BridgeIt.util.utility;
import DSUtility.Queue;

public class CashCounter {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {

		int amount = 10000;
		int chocie;
		System.out.println("Enter How many People are in Queue");
		int people = utility.getnumber();

		Queue queue = new Queue(people);// crate object of queue assigned size to queue
		System.out.println("enter " + people + " name in list");
		for (int i = 1; i <= people; i++) {

			System.out.println("Enter person " + i + " name");
			String CustNAME = utility.getStringName();
			queue.enQueue(CustNAME);// calling enQueue method to add name of person to q object

		}
		System.out.println("Queue is ");
		queue.show();
		for (int counter = 0; counter < people; counter++) {
			System.out.println("Welcome To Bank");
			System.out.println("Person " + counter + " in queue");
			System.out.println("Enter 1.to Width draw amount");
			System.out.println("Enter 2.to Deposit Money");
			chocie = utility.getnumber();
			switch (chocie) {
			case 1:
				System.out.println("Enter amount TO WithDraw");
				final int withdraw_Amount = utility.getnumber();

				if (withdraw_Amount > 0 && withdraw_Amount <= amount) {

					amount = amount - withdraw_Amount;
					System.out.println("ThankYou .. .>");

					if (amount == 0) {
						System.err.println("Out OF cash...!");
						return;
					}
					System.out.println("  Updated amount is = " + amount);

				} else {
					System.err.println("Enter Valid amount");
				}

				break;

			case 2:
				System.out.println("Enter Amount you want to Deposit");
				final int DRAW_AMOUNT = utility.getnumber();// calling scanint method to take deposit amount from
															// user
				if (DRAW_AMOUNT > 0) {
					amount = amount + DRAW_AMOUNT;// updating bank amount
					System.out.println(" updated amount = " + amount);

					break;
				} else {
					System.err.println("please Enter valid amount");
					return;
				}
			default:
				System.err.println("Enter valid Input");
				break;
			}

			queue.deQueue(); // calling deQueue method to remove the person from queue after their operation
			System.out.println("removed from ");
			System.out.print("current queue is ");
			queue.show();
		}
	}
}
