
package algorithmsPrograms;

import java.util.Arrays;

public class Util {

	/**
	 * Function to check sring s anagram or not  of the week of given date
	 *
	 * @param 2 strings
	 */

	public static void checkAnagram(char[] s1, char[] s2) {
		int n1 = s1.length;
		int n2 = s2.length;
		boolean flag = false;
		if (n1 == n2) {
			Arrays.sort(s1);
			Arrays.sort(s2);
			for (int i = 0; i < n1; i++) {
				if (s1[i] == s2[i]) {
					flag = true;
				}
			}
		} else {
			flag = false;
			// System.out.println("Strings are not anagram.");
		}
		if (flag == true) {
			System.out.println("Strings are anagram.");
		} else {
			System.out.println("Strings are not anagram.");
		}
	}

	/**
	 * Function to check the day of the week of given date
	 *
	 * @param d int value for day of date
	 * @param m int value for month of year
	 * @param y int value for year
	 * @return day of week from 1 to 7
	 */
	public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	/**
	 * Function to convert fahrenheit to celcius and vice-versa
	 *
	 * @param tem the value of temperature
	 * @param t   the character ie c or f for given temp to convert
	 * @return converted temperature
	 */
	public static int temperaturConversion(int temperature, char t) {
		int convert;
		if (t == 'c' || t == 'C') {
			convert = (temperature * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			convert = (temperature - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		return convert;
	}

	/**
	 * to calculate monthly payment for r interest and p principal for y years
	 *
	 * @param p the principal amount given
	 * @param y the year for which p is given
	 * @param r the rate at which p is given
	 * @return monthly payment
	 */
	public static double monthlyPayment(double principal, double year, double Rate) {
		double n = 12 * year;
		double r0 = Rate / (12 * 100);
		double payment = principal * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}

	/**
	 * Function to find the square root of given no
	 *
	 * @param c the value to find square root of
	 * @return return the square root
	 */
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
	}

	/**
	 * Function to convert decimal to binary
	 *
	 * @param d integer value to convert
	 * @return return integer array with binary digits
	 */
	public static int[] decimalToBinary(int decimal) {

		String bin = "";
		while (decimal != 0) {
			bin = (decimal % 2) + bin;
			decimal /= 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}

	/**
	 * Function to convert string to int array helper function for swapnibble in
	 * Binary.java class
	 *
	 * @param bin String of binary no
	 * @return return integer array
	 */
	public static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	/**
	 * Function to convert binary to decimal
	 *
	 * @param binary the binary array to cenvert
	 * @return return converted decimal no
	 */
	public static int binaryToDecimal(int[] binary) {
		int decimalNumber = 0, power = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				decimalNumber = decimalNumber + (int) Math.pow(2, power);
			}
			power++;
		}
		return decimalNumber;
	}

	// ****************************************************************************************************
	public static int ToDecimal(int[] binary) {
		int i = 0;
		int decimal = 0;
		int power = 0;
		for (i = 0; i < binary.length; i++) {

			int remainder = binary[i] % 10;
			decimal = decimal + (int) (remainder * Math.pow(2, power));
			power++;
			binary[i] = binary[i] / 10;
		}

		return decimal;

	}
	
	
	    //*************************************************************************************
	 // Function to check if  
	    // x is power of 2 
	    static boolean isPowerOfTwo(int n) 
	    { 
	        if (n == 0) 
	            return false; 
	          
	        while (n != 1) 
	        { 
	            if (n % 2 != 0) 
	                return false; 
	            n = n / 2; 
	        } 
	        return true; 
	    }

}
