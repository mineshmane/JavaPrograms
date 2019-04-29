/******************************************************************************
	
	 * Purpose:  To read a date from user and give the on that day as out put
     *
	 * @author minesh mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/
package algorithmsPrograms;

public class DayofWeek {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			int m = Integer.parseInt(args[0]);
			int d = Integer.parseInt(args[1]);

			int y = Integer.parseInt(args[2]);
			System.out.println("Date: " + m + "/" + d + "/" + y);
			int dayNumber = Util.dayOfWeek(d, m, y);
			dayOfDate(dayNumber);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dayOfDate(int day) {
		System.out.print("Day: ");
		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		}
	}

}
