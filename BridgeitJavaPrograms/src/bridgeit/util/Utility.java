package bridgeit.util;

import java.io.*;
import java.util.*;

public class Utility {

	public static Scanner scanner = new Scanner(System.in);
	public static Random random = new Random();

	/**
	 * @purpose : To read only word type of input from user and returns string value
	 * @return : string
	 **/

	public static String getString() {
		String name = scanner.nextLine(); // calling next method to scan word and store it in a variable
		return name;

	}

	/**
	 * @purpose : To read only word type of input from user and returns string value
	 * @return : string
	 **/

	public static String getWordString() {
		String name = scanner.next(); // calling next method to scan word and store it in a variable
		return name;

	}

	/**
	 * @purpose : To read only rabdon type of input from user and returns a boolean
	 *          value
	 * @return : boolean
	 **/

	public static int getrandom() {
		int ranvalue = random.nextInt(10000);

		return ranvalue;

	}

	/**
	 * @purpose : To read only boolean type of input from user and returns boolean
	 *          value
	 * @return : string
	 **/
	public static boolean getBooleanNumber() {
		boolean number = scanner.nextBoolean();
		return number;
	}

	/**
	 * @purpose : To read only double type of input from user and returns double
	 *          value
	 * @return : string
	 **/

	public static double getDouble() {
		double number = scanner.nextDouble();
		return number;
	}

	/**
	 * @purpose : To read only Integer type of input from user and returns integer
	 *          value
	 * @return : string
	 **/

	public static int getIntNumber() {
		int number = scanner.nextInt(); // calling nextInt method to scan Integer and store it in a variable
		return number;

	}

	/**
	 * @purpose : To replace String
	 * @return : string
	 **/

	public static String replaceString(String replace) {
		// TODO Auto-generated method stub
		String stringFirst = "hello <<username>> , how are you ?";

		String userName = stringFirst.replace("username", replace);// replace method is called for replace the string

		return userName;
	}

	// ***************************************************************************
	/*
	 * 
	 * 
	 */
	/**
	 * @purpose : This method to check whether give year is leapyear or not
	 * @param :String value
	 * @return : void
	 **/
	public static int cheakleapYear(int year) {
		try {
			if (year > 999) {
				if (year % 400 == 0) {
					System.out.println(year + " is leap year");

				} else if (year % 4 == 0) {
					System.out.println(year + " is leap year");

				} else if (year % 100 == 0) {

					System.out.println(year + " is leap year");
				}

				else {
					System.out.println("it not leap year  " + year);
				}
			} else {
				System.out.println("invalid number");
			}

		} catch (Exception e) {

			System.out.println("pleas do not enter alphabests");

		}
		return year;
	}

	// ****************************************************************************

	/**
	 * @purpose : This method take value as an argument and print all the power
	 *          values of 2
	 * @exception : it takes arguments between 1-30;
	 * @return : void
	 **/

	public static void poweroftwo(int power) {

		// Only works if 0 <= N < 31 since 2^31 overflows an integer
		int value = 0;
		int i;
		if (power < 31 && power > 0) {
			// repeat i equals to number
			for (i = 1; i <= power; i++) {

				value = (int) Math.pow(2, i);
				System.out.println(i + "ith    power value  " + value);

			}

		} else {
			System.out.println("please Enter less tha 31 and greater than 0");
		}
	}

	// ****************************************************************************
	/**
	 * @purpose : This method to get harmonic number series
	 * @param :n integer value
	 * 
	 **/

	public static void harmonic(int number) {
		{

			float harmonic = 1;
			for (int i = 2; i <= number; i++) {

				System.out.print(harmonic + " ");
				harmonic = harmonic + (float) 1 / i;
			}
			System.out.print(harmonic + " ");
		}

	}

	// ************************************************************************************
	/**
	 * @purpose : This method to get values of prime factor
	 * @param :n integer value
	 * @return : void
	 **/

//for  find prime factors of number 
	public static void primeFactors(int Number) {
		int i;

		for (i = 2; i <= Number; i++) {
			while (Number % i == 0) {

				System.out.print(i + "  ");
				Number = Number / i;

			}
		}
	}

	// *********************************************************************************

	/*
	 * @purpose : This method to get CoupenNumber to store values in ArrayList
	 * 
	 **/

	public static int getCoupon(int number) {
		return (int) (Math.random() * number);
	}

	public static int collect(int number) {
		boolean[] isCollected = new boolean[number]; // isCollected[i] = true if card type i already collected
		int count = 0; // number of cards collected
		int distinct = 0; // number of distinct card types collected

		// repeat until you've collected all the number card types
		while (distinct < number) {
			int value = getCoupon(number); // pick a random card using math.random method
			count++; // one more card
			if (!isCollected[value]) { // discovered a new distinct card
				distinct++;
				isCollected[value] = true;
			}
			System.out.println(" distinct: " + distinct);
		}
		return count;
	}

	// *******************************************************************************************************

	/**
	 * @purpose gambler
	 * @param stake  =cash
	 * @param goal   =target
	 * @param trials number of try
	 */
	public static void gambler(int stake, int goal, int trials) {

		int bets = 0; // total number of bets made
		int wins = 0; // total number of games won
		// repeat trials times
		for (int t = 0; t < trials; t++) {

			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)// goals
				wins++; // did gambler go achieve desired goal?
		}
		// print results
		double winPercent = 100.0 * wins / trials;
		System.out.println(wins + " wins of " + trials + "  trials");
		System.out.println("avg # bets         = " + 1.0 * bets / trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("percentage of loss = " + (100 - winPercent));

	}

	// ********************************************************************************************************
	/**
	 * @purpose Sum of three Integers
	 * @param size of array and elements of array
	 */
	public static void sumOfThreeNumbers(int size) {
		int count = 0;
		int array[] = new int[size];
		System.out.println("Enter numbers");
		for (int i = 0; i < array.length; i++) {

			array[i] = Utility.getIntNumber();
		}
		System.out.println("number of distinct triplet pairs");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {

					if (array[i] + array[j] + array[k] == 0) {
						count++;
						System.out.println(array[i] + " " + array[j] + " " + array[k] + " = 0");
					}
				}
			}
		}
		System.out.println("number of pairs: " + count);

	}

	// *********************************************************************************************************
	// *********************************************************************************************************
	/**
	 * @purpose :to calculate wind chill by using
	 * @param temperature
	 * @param WindSpeed   in velocity
	 */
	public static double windchill(double temp, double windspeed) {

		double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windspeed, 0.16);

		// TODO Auto-generated method stub
		return w;
	}

	// *********************************************************************************************************
	/**
	 * @purpose :print two dimensional
	 * @param stake  =cash
	 * @param goal   =target
	 * @param trials number of try
	 */
	public static void printTwoDimensionalArray(int row, int column) {
		int j = 0, i = 0;
		int array[][] = new int[row][column];

		for (i = 0; i < row; i++)
		// to count row
		{
			for (j = 0; j < column; j++)
			// to count coloumn
			{
				array[i][j] = Utility.getIntNumber();
			}
		}

		PrintWriter p = new PrintWriter(System.out);
		System.out.println("Display Array");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				p.print(array[i][j] + " ");
			}

			p.println();
		}
	}
	// ************************************************************************************************

	public static double findDistance(double x, double y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(2, y));

		return distance;
	}

	// *************************************************************************************************************
	/**
	 * @purpose : This method to get swap values permutation of give values
	 * @param :char [] arry,int values
	 * @return : void
	 **/
	public static void swap(char[] ch, int i, int j) {
		// temp variable is to store values of char[i]
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

	}// swap is used to intern change elements given by user

	public static void perumetation(char[] ch, int currentindex)
	// recursive function was held here
	{
		if (currentindex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}
		for (int i = currentindex; i < ch.length; i++) {
			swap(ch, currentindex, i);

			perumetation(ch, currentindex + 1);
			swap(ch, currentindex, i);
		}

	}

	// ***************************************************************************************************
	/**
	 * @purpose : This method to get prime number between 1 to 1000;
	 * @param :Number
	 * @return :integer
	 **/
	public static int printPrimeNumber(int lowest, int highest) {
		int count = 0;
		int number = 0;
		int devisor = 0;
		for (number = lowest; number <= highest; number++) {
			int flag = 0;
			// i==divisor start and divisor will -- up to 1
			for (devisor = number; devisor >= 1; devisor--) {
				if (number % devisor == 0) {

					flag = flag + 1;
				}
			} // if flag is 2 it is prime number
			if (flag == 2) {

				count++;

				System.out.println(number);

			}
		}
		return (count);
	}

	// ***************************************************************************************************
	/**
	 * @purpose : This method to check prime number
	 * @param :Number
	 * @return :integer
	 **/
	public static int checkPrimeNumber(int number) {

		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			// condition for non prime number
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {

			System.out.println(number + " is a prime number.");
		}

		else {
			System.out.println(number + " is not a prime number.");

		}
		return 0;

	}

	// ******************************************************************************************
	/**
	 * @purpose : This method to binary search for string
	 * @param :string
	 * @return :string
	 **/

	public static int binarySearchForString(String arr[], String x) {

		int start = 0, end = arr.length - 1;
		arr = Utility.bubbleSortForString(arr);
		System.out.println("sorted array");
		for (String string : arr) {
			System.out.println(string);
		}
		long starttime = System.nanoTime();
		long stoptime = 0;
		while (start <= end) {
			int middle = (start + end) / 2;

			int res = x.compareToIgnoreCase(arr[middle]);

			// Check if x is present at middle
			if (res == 0)
				return middle;

			// If x greater, ignore left half
			else if (res > 0)
				start = middle + 1;

			// If x is smaller, ignore right half
			else
				end = middle - 1;
		}
		stoptime = System.nanoTime();
		System.out.println("total time elapsed" + (stoptime - starttime));

		return -1;
	}

//******************************************************************************************

	/**
	 * @purpose :this method i for Binary search for Integer values
	 * @param :Number
	 * @return :integer
	 **/

	public static int binarySearchForInt(int[] arr, int searchkey) {
		int higherIndex = arr.length - 1, lowerIndex = 0, middle;

		while (lowerIndex <= higherIndex) {
			middle = (lowerIndex + higherIndex) / 2;
			if (searchkey == arr[middle]) {
				return middle;
			} else if (arr[middle] < searchkey) {
				lowerIndex = middle + 1;
			} else {
				higherIndex = middle - 1;
			}

		}
		return -1;

	}
	// ******************************************************************************************

	/**
	 * @purpose :This method Bubble sort for String words
	 * @param :string array
	 * @return :stings array
	 **/

	public static String[] bubbleSortForString(String a[]) {
		int i, j;
		String temp = null;

		/*
		 * for (i = 0; i < a.length; i++) { a[i] = Utility.getString(); // taking input
		 * from user }
		 */

		long startTime = System.nanoTime();
		long StopTime = 0;

		for (i = 0; i < a.length; i++) // sorting the array
		{
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		StopTime = System.nanoTime();
		System.out.println("time taken for bubble sort of String " + (StopTime - startTime));

		return a;

	}

	// ******************************************************************************************
	/* Bubble sort for integer */

	/**
	 * @purpose :This method is for Bubble sort for integer values
	 * @param :Number
	 * @return :integer
	 **/

	public static int[] bubbleSortForInt(int[] a) {
		int i, j;
		int temp = 0;
		long starttime = System.nanoTime();
		long stoptime = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = Utility.getIntNumber(); // taking input from user
		}

		for (i = 0; i < a.length; i++) // sorting the array
		{
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		stoptime = System.nanoTime();
		System.out.println("time elapsed " + (stoptime - starttime));
		return a;

	}

	// ************************************************************************************************
	// *static method for insertion sort for integer values*

	/**
	 * @purpose :This method is for Insertion sort for Integer values
	 * @param :Number
	 * @return :integer
	 **/

	public static void insertionSortForInt(int[] array) {
		int i, hole, value;
		long startTime = System.nanoTime();
		long StopTime = 0;
		for (i = 1; i < array.length; i++) {

			value = array[i];
			hole = i;
			while (hole > 0 && array[hole - 1] > value) {
				array[hole] = array[hole - 1];
				hole = hole - 1;
			}
			array[hole] = value;
			StopTime = System.nanoTime();
		}

		System.out.println("sorted array: ");

		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("time taken for insertion sort of String " + (StopTime - startTime));

	}

	// ****************************************************************************
	// * to print integer array
	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("sorted array " + arr[i]);
		}
	}

//****888888888888********88888888888*****************************************************88
	// * insertion sort for string */
	/* string sort */

	public static void insertionString() {
		System.out.println("enter string ");
		String enteredString = Utility.getString();
		String[] arrayString = enteredString.split("");

		long startTime = System.nanoTime();
		long StopTime = 0;
		for (int i = 1; i <= arrayString.length - 1; i++) {
			String first = arrayString[i];
			int index = i;
			while ((index > 0) && (arrayString[index - 1].compareTo(arrayString[index]) > 0)) {
				arrayString[index] = arrayString[index - 1];
				index -= 1;
			}
			arrayString[index] = first;
		}
		StopTime = System.nanoTime();
		for (int j = 0; j <= arrayString.length - 1; j++) {
			System.out.print("  " + arrayString[j]);
		}
		System.out.println();
		System.out.println("time taken for insertion sort of String " + (StopTime - startTime));
	}

	// ****************************************************************************************************
	/**
	 * to calculate monthly payment for r interest and p principal for y years
	 *
	 * @param p the principal amount given
	 * @param y the year for which p is given
	 * @param r the rate at which p is given
	 * @return monthly payment
	 */
	public static double monthlyPayment(double principal, double year, double rateper) {
		double n = 12 * year;
		double rate = rateper / (12 * 100);
		double payment = principal * rate / (1 - Math.pow((1 + rate), -n));
		return payment;
	}

//******************************************************************************************
	/**
	 * Function to convert fahrenheit to celcius and vice-versa
	 *
	 * @param tem the value of temperature
	 * @param t   the character that is c or f for given temp to convert
	 * @return converted temperature
	 */
	public static int temperaturConversion(char t) {
		int conver;
		if (t == 'c' || t == 'C') {
			System.out.println(" Enter Temprature in celcius");
			int tem = Utility.getIntNumber();
			conver = (tem * 9 / 5) + 32;
			System.out.print(tem + "  Celcius temperature  in Farnhheit ");
		} else if (t == 'f' || t == 'F') {
			System.out.println(" Enter temprature in farenheit:");
			int tem = Utility.getIntNumber();
			conver = (tem - 32) * 5 / 9;
			System.out.print(tem + "  Farnhheit temperature  in celcius ");

		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		return conver;
	}

}
