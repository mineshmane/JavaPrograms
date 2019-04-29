/*************************************************************************************************************
 * 
 * @purpose	:To print wind chill  using temp and wind speed 
 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 11-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class WindChill {

	public static void main(String[] args) {

		/*
		 * double t = Utility.getDouble(); double v = Utility.getDouble(); double w
		 * =35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		 * System.out.println("Temperature = " + t); System.out.println("Wind speed  = "
		 * + v); System.out.println("Wind chill  = " + w);
		 */

		try {
			System.out.println("Enter Temp ");
			double temp = Utility.getDouble();
			System.out.println("Enter Windspped");
			double windspeed = Utility.getDouble();

			if (temp <= 50 && windspeed <= 120 || windspeed > 3) {

				double Wind = Utility.windchill(temp, windspeed);
				System.out.println("temperature in  Fahrenheit: " + temp);
				System.out.println("wind speed in miles per hour: " + windspeed);
				System.out.println("windchill :" + Wind);

			} else {
				System.out.println("u cant  calucalte..since the formula is not valid if t is larger than 50 in \n"
						+ "	 * absolute value or if v is larger than 120 or less than 3  ");
			}
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}

}
