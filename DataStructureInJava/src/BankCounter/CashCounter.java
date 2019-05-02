package BankCounter;

import BridgeIt.util.Utility;
import DSUtility.Queue;

public class CashCounter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// String CusName;
		int amount = 10000;
		int chocie;
		System.out.println("Enter How many People are in Queue");
		int people =Utility.getIntNumber();
		Queue queue = new Queue(people);
		System.out.println("enter " + people + " name in list");
		for (int i = 0; i < people; i++) {

			System.out.println("Enter person " + i + " name");
			String CustNAME = Utility.getString();
			queue.enQueue(CustNAME);// calling enQueue method to add name of person to q object

		}
		System.out.println("Queue is ");
		queue.show();
		for (int i = 0; i < people; i++) {
			System.out.println("WELLcOME TO My BaNk");
			System.out.println("Person " + i + " in queue");
			System.out.println("Enter 1.to Width draw amount");
			System.out.println("Enter 2.to Deposit Money");
			chocie = Utility.getIntNumber();
			switch (chocie) {
			case 1:
				System.out.println("Enter amount TO WithDraw");
				final int Withdraw_amount = Utility.getIntNumber();
				if (Withdraw_amount > 0 && Withdraw_amount <= amount) {
					amount = amount - Withdraw_amount;
					System.out.println("ThankYou .. .>");
					if (amount == 0) {
						System.err.println("Out OF cash...!");
						return;
					}
					System.out.println(" updated amount = " + amount);

				} else {
					System.err.println("Enter Valid amount");
				}

				break;
			case 2:
				System.out.println("enter amount you want to deposit");
				final int DRAW_AMOUNT = Utility.getIntNumber();// calling scanint method to take deposit amount from
																// user
				if (DRAW_AMOUNT > 0) {
					amount = amount + DRAW_AMOUNT;// updating bank amount
					System.out.println(" updated amount = " + amount);

					break;
				} else {
					System.err.println("please enter valid amount");
					return;
				}
			default:
				System.err.println("Enter valid InPut");
				break;
			}

			queue.deQueue(); // calling deQueue method to remove the person from queue after their operation
			System.out.print("current queue is ");
			queue.show();
		}
	}
}
