package BridgeIt.util;


import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class utility {

	
	/*
	 * public utility(){ br = new BufferedReader(new InputStreamReader(System.in));
	 * }
	 */
	

		/*
		 * pass the during run time
		 *
		 */

		// *****************************************************************\\
		public static Scanner scanner = new Scanner(System.in);
		public static Random random = new Random();

		/**
		 * @purpose : To read only word type of input from user and returns string value
		 * @return : string
		 **/

		public static String getStringName() {
			String name = scanner.next();// calling next method to scan word and store it in a variable
			return name;
		}
		
		
	/*
	 * public String inputString(){ try{ return br.readLine(); } catch(IOException
	 * ioe){ System.out.println(ioe.getMessage()); } return ""; }
	 */

		/**
		 * @purpose : To read only int type of input from user and returns a boolean
		 *          value
		 * @return : boolean
		 **/

		public static int getnumber() {
			int number = scanner.nextInt();// calling nextInt method to scan word and store it in a variable
			return number;
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
		 * @purpose : To read only boolean type of input from user and returns a boolean
		 *          value
		 * @return : boolean
		 **/

		public static double getranDouble() {
			double pointvalue = random.nextDouble();
			return pointvalue;
		}

		/**
		 * @purpose : To read only boolean type of input from user and returns a boolean
		 *          value
		 * @return : boolean
		 **/

		public static double getDouble() {
			double value = scanner.nextDouble();
			return value;
		}

		/**
		 * @purpose : To read only boolean type of input from user and returns a boolean
		 *          value
		 * @return : boolean
		 **/

		public static String getNextLine() {
			String s1 = scanner.nextLine();
			return s1;
		}

		/**
		 * @purpose : To read only boolean type of input from user and returns a boolean
		 *          value
		 * @return : boolean
		 **/

		public static boolean scanBoolean() {
			boolean s = scanner.nextBoolean();// calling next method to scan boolean value and store it in a variable
			return s;
		}

		// ****************************************************************\\
		/*
		 * harmonic value printing logic is 1/1+1/2+1/3.....1/n.
		 * 
		 */
		public static void harmonic(int n) {
			{

				float sum = 0;
				for (int i = 0; i <= n; i++) {
					sum = sum + (float) 1 / i;
				}
				System.out.println("for N harmonic number is" + sum);
			}
		}

		// **************************************************************
		/*
		 * 
		 */
		public static void flip(int numberOfFlips) {

			int head = 0;
			int tail = 0;
			try {

				for (int i = 0; i <= numberOfFlips; i++)

				{
					if (Math.random() >= 0.5)// using random() method to get values randomly
					{
						head++; // to count how many times heads
					} else {
						tail++;// to count how many times tails

					}
				}
				System.out.println("percent of heads" + (head / numberOfFlips) * 100 + "%");
				System.out.println("percent of tails" + (tail / numberOfFlips) * 100 + "%");
				System.out.println(head);
				System.out.println(tail);
			} catch (Exception e) {
				//
				System.out.println(e);
				System.out.println("enter valid integer value");
			}

		}
		// ****************************************************************************

		/**
		 * @purpose : This method take value as an argument and print all the power
		 *          values of 2
		 * @exception : it takes arguments between 1-30;
		 * @return : void
		 **/
		public static void power(int power) {
			System.out.println("enter int value to caluclate");

			int value = 0;
			if (power == 0) {
				System.out.println(1);
			}
			for (int i = 1; i <= power; i++) {
				value = (int) Math.pow(2, power);// inbuilt class Math and inbuilt method pow();
				/*
				 * it is a double type convertion we explicitly converting it into interger
				 * value
				 * 
				 */

			}
			System.out.println("power of 2 for  " + power + "  is  " + value);
		}

		// ************************************************************************************
		/**
		 * @purpose : This method to get values of primefacter
		 * @param :n integer value
		 * @return : void
		 **/
		public static void primeFactors(int n) {
			// Print the number of 2s that divide n
			while (n % 2 == 0) {
				System.out.print(2 + " ");
				n /= 2;
			}

			// n must be odd at this point. So we can
			// skip one element (Note i = i +2)
			for (int i = 3; i <= Math.sqrt(n); i += 2) {
				// While i divides n, print i and divide n
				while (n % i == 0) {
					System.out.print(i + " ");
					n /= i;
				}
			}

			// This condition is to handle the case when
			// n is a prime number greater than 2
			if (n > 2)
				System.out.print(n);
		}

		// *********************************************************************************************

		/**
		 * @purpose gambler
		 * @param stake
		 * @param goal
		 * @param trials
		 * @return
		 */
		public static int[] playGame(int stake, int goal, int trials) {
			int wins = 0;
			int bets = 0;
			for (int i = 1; i <= trials; i++) {
				int cash = stake;

				while (cash > 0 && cash < goal) {
					bets++;
					if (Math.random() >= 0.5)
						cash++;
					else
						cash--;
				}
				if (cash == goal)
					wins++;

			}
			return new int[] { bets, wins };
		}

		// ********************************************************************************************
		/*
		 * 
		 *//**
			 * @purpose : This method to get CoupenNumber to store values in ArrayList
			 * @param :n integer value
			 * @return : void
			 **/

		public static void coupenNUm(int n) {
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			/*
			 * ArrayList is used to store the values,,& it is dynamic in size y not array it
			 * fixed in size
			 */
			int count = 0;// to count coupons present in it
			for (int i = 0; i <= n; i++)// n is used to store how coupons user required
			{

				int coup = (int) utility.getrandom();
				count++;
				if (!arraylist.contains(coup)) {
					arraylist.add(coup);
					/*
					 * if coupon dose not contain in list append the value in ArrayList...
					 */

				} else {
					i--;// to run loop again

				}

			}

			for (int k : arraylist)
				System.out.println(k);
			System.out.println("total of all distict number is" + count);

		}

		// ***************************************************************************
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to check wether give year is leapyear or not
		 * @param :String value
		 * @return : void
		 **/
		public static void year(String year) {

			try // coz throw excption after entering alpabits
			{
				int checkleap = Integer.parseInt(year);
				// checking given number is leap or not

				if (year.length() == 4) {
					if (checkleap % 4 == 0) {
						System.out.println(checkleap + "  is a leapyear");
					} else {
						System.out.println(checkleap + "is not leapyear");
					}

				}

				else {
					System.out.println("please enter valid 4-digit year");
				}
			}

			catch (Exception e) {
				System.out.println(e);
				System.out.println("do not enter aplabits");
			}
		}

		// *****************************************************************************************\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to store the values and print valuesr
		 * @param :row ,cloumn ,values to in array
		 * @return : void
		 **/
		public static void array2D(int row, int column) {
			String arr[][] = new String[row][column];
			System.out.println("enter the elements");
			int j = 0;
			System.out.println("Enter values");
			for (int i = 0; i < row; i++)
			// to count row
			{
				for (j = 0; j < column; j++)
				// to count coloumn
				{
					arr[i][j] = utility.getStringName();
				}
			}
			for (int i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					System.out.print(arr[i][j] + " ");
				}

				System.out.println();
			}
		}

		// ************************************************************************************************\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to get values of sum of three integers using linked
		 *          list
		 * @param :n integer value
		 * @return : void
		 **/
		public static void sumOf(int n) {
			int[] arr = new int[n];
			int count = 0;

			int length = n;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = utility.getnumber();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					for (int k = j + 1; k < arr.length; k++) {
						if (arr[i] + arr[j] + arr[k] == 0) {
							count++;
							System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
						}
					}
				}
			}
			System.out.println("" + count);
		}

		// **************************************************************************\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to get distance from origin
		 * @param :a,b double values
		 * @return : void
		 **/
		public static double dist(double a, double b) {
			double distance = Math.sqrt(((Math.pow(a, 2)) + (Math.pow(b, 2))));
			return distance;
		}

		// *****************************************************************************************\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to get swap values permutation of give values
		 * @param :char [] arry,int values
		 * @return : void
		 **/
		public static void swap(char[] ch, int i, int j) {
			// temp varible is to store values of char[i]
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;

		}// swap is used to intern change elements given by user

		public static void perumetation(char[] ch, int currentindex)
		// recercive function wash held here
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

		/// *************************************************************************************\\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to get values of quadratic equation
		 * @param : integer value
		 * @return : void
		 **/
		public static void quadratic(int a, int b, int c) {
			double delta = (b * b - 4 * a * c);
			// caluclating delta value
			double Root1ofx = (-b + Math.sqrt(delta)) / (2 * a);
			double Root2ofx = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println(" first root of equation is " + Root1ofx);
			System.out.println(" second root of equation is " + Root2ofx);

		}

		// ***************************************************************************\\
		/*
		 * 
		 * 
		 */
		/**
		 * @purpose : This method to get wind speed
		 * @param :double values
		 * @return :double
		 **/
		public static double windchil(double temp, double windspeed) {
			double wind = 35.74 + 0.6215 + (0.4275 * temp - 35.75) * Math.pow(windspeed, 0.16);
			return wind;
		}

		public static void displayString(String a[])

		{

			for (int i1 = 0; i1 < a.length; i1++)

			{
				System.out.print(a[i1] + " ");
			}

			System.out.println();
		}
		// **********************************************************************************************\\
		/*
		 * com.BridgeIt.FunctionalPrograms Ends
		 * 
		 */

		// &&&&&&&&&&************&&&&&&&&&&&&************&&&&&&&&&&***********&\\

		/*
		 * Starts BridgeIT.AlgorithmPrograms
		 * 
		 */

		/**
		 * @purpose : This method is used to find weather the given strings are anagram
		 *          are not
		 * @return : boolean
		 **/
		public static char[] covertionOfStringToCharacterArray(String s1) {
			char[] c1 = s1.toCharArray();

			return c1;
		}

		//
		public static boolean anagram(String s1, String s2)

		{ // To make sure that there is no word case problems while performing action
			s1 = s1.toUpperCase();
			s2 = s2.toUpperCase();

			// Converting strings in to character array
			char ch[] = s1.toCharArray();
			char ch1[] = s2.toCharArray();

			// sorting the character array
			Arrays.sort(ch);
			Arrays.sort(ch1);

			// Converting strings in to character array
			String s3 = String.valueOf(ch);
			String s4 = String.valueOf(ch1);

			// condition checking for anagram
			if (s3.length() == s4.length()) {
				if (s3.equals(s4)) {
					System.err.println("yes its");
					return true;
				}
			}
			return false;

		}
		// *****************************************************************************\\

		/**
		 * @purpose : This method is used to find weather the given integers are
		 *          primeNumber and storing in array list are not
		 * @return : ArrayLIst Collection
		 **/
		public static ArrayList<String> PrimeNUmber(int range) {

			// creating a string type array list to store prime numbers

			int status = 0;
			int num = 3;
			int[] arr = new int[167];
			int[][] arr1 = new int[10][167];
			int i, j;
			ArrayList<String> al = new ArrayList<String>();
			System.out.println("First 1000 prime numbers are:");
			for (i = 0; i <= 166;) {
				for (j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						status = 0;
						break;
					}
				}
				if (status != 0) {
					al.add(i + "");
					i++;
				}
				status = 1;
				num++;
			}
			// adding prime numbers to arraylist
			return al;

		}
		// *****************************************************\\

		/**
		 * @purpose : This method is used to find weather the given integer are
		 *          PrimeNumber are not
		 * @return :array
		 **/
		public static int[] prime() {
			int status = 1;
			int num = 3;
			int[] arr = new int[167];
	
			int i, j;

			System.out.println("First 1000 prime numbers are:");
			for (i = 0; i <= 166;) {
				for (j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						//
						status = 0;
						break;
					}
				}
				if (status != 0) {

					arr[i] = num;
					i++;

				}

				status = 1;
				num++;

			}
			return arr;
		}

		// *******************************************************************************\\
		/*
		 * Sorting Techs
		 */

		/**
		 * @purpose : This method is used toshow the implementation of binary search
		 * @return :void
		 **/

		public static void binarySearch() {
			System.out.println("enter number of elements to enter");
			int n = utility.getnumber();
			System.out.println("enter array elements ");
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				// adding values
				array[i] = utility.getnumber();
			}
			//
			int firstIndex = 0;
			int lastIndex = n - 1;
			int middle = 0;
			System.out.println("enter search element");
			int search = utility.getnumber();
			while (firstIndex <= lastIndex) {
				// it starts from searching from middle
				middle = (firstIndex + lastIndex) / 2;

				if (array[middle] == search) {
					System.out.println(search + "is found at " + (middle + 1) + "position");
					break;
				} else if (search > array[middle]) {
					// if the value is not present at Middle
					/*
					 * first value shiftd toword middle and starts counting
					 * 
					 */
					firstIndex = middle + 1;
				} else {
					lastIndex = middle - 1;
				}
			}
			System.out.println(search + " search element is founds at " + (middle + 1));

		}
		// *********************************************************************\\

		public static void Binarysearchofstring() {
			System.out.println("enter string");
			String first = utility.getNextLine();
			// taking in put from user
			String[] sort1 = first.split("");
			// by using split method we split the values
			Arrays.sort(sort1);
			for (String k : sort1)

				System.out.println(k);
			System.out.println("enter  string to sort");
			String search = utility.getStringName();
			int firstindex = 0;
			int lastindex = sort1.length - 1;
			long starttime = System.nanoTime();
			// time to check
			long stoptime = 0;
			while (firstindex <= lastindex) {
				int mid = (firstindex + lastindex) / 2;
				if (search.compareTo(sort1[mid]) == 0) {
					stoptime = System.nanoTime();
					System.out.println("search element found at" + (mid + 1));
					break;
				}
				if (search.compareTo(sort1[mid]) > 0) {
					firstindex = mid + 1;

				} else {
					lastindex = mid - 1;
				}
			}
			System.out.println(" time taken for searcing of string " + (stoptime - starttime));

		}
		// **********************************************************************\\

		public static void insertionSort() {
			System.out.println("enter number of elements");
			int n = utility.getnumber();
			int[] array = new int[n];
			System.out.println("array elements");
			for (int i = 0; i < array.length; i++) {
				array[i] = utility.getnumber();

			}
			long startTime = System.nanoTime();
			long StopTime = 0;
			for (int j = 1; j <= array.length - 1; j++) {
				int value = array[j];
				// value which is present in that index is stored
				int index = j;
				// index value is stored

				while (index > 0 && array[index - 1] > value) {
					/*
					 * checking the value and index of array
					 * 
					 */

					array[index] = array[index - 1];
					index--;
				}
				array[index] = value;
				// assign the value to array index
			}
			StopTime = System.nanoTime();
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);

			}
			System.out.println("time taken for insertion sort of integer " + (StopTime - startTime));
		}

		// ***************************************************************************************************\\
		public static void insertionString() {
			System.out.println("enter string ");
			String enteredString = utility.getNextLine();
			String[] arrayString = enteredString.split("");
			Arrays.sort(arrayString);
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

			System.out.println("time taken for insertion sort of String " + (StopTime - startTime));
		}

		// *****************************************************************************************\\

		public static void bubbleSortOfInteger() {
			System.out.println("enter number of intergers");
			int n = utility.getnumber();
			int[] array = new int[n];
			System.out.println("enter integers");
			for (int i = 0; i <= array.length - 1; i++) {
				array[i] = utility.getnumber();

			}
			long startTime = System.nanoTime();
			long StopTime = 0;
			for (int j = 0; j <= array.length - 1; j++) {
				// loop to to run inner one
				for (int k = 0; k <= array.length - 2; k++) {
					if (array[k] > array[k + 1]) {
						// swaping
						int temp = array[k];
						array[k] = array[k + 1];
						array[k + 1] = temp;
					}
				}
			}
			StopTime = System.nanoTime();
			for (int index = 0; index <= array.length - 1; index++) {
				System.out.println(array[index]);
			}
			System.out.println("time taken for bubble sort of integer " + (StopTime - startTime));

		}

		// ***********************************************************************************\\
		public static void bubbleSortOfString() {
			System.out.println("enter string");
			String EnteredString = utility.getNextLine();
			String[] array = EnteredString.split(" ");
			long startTime = System.nanoTime();
			long StopTime = 0;
			for (int j = 0; j <= array.length - 1; j++) {
				for (int k = 0; k <= array.length - 2; k++) {
					if (array[k].compareTo(array[k + 1]) > 0) {
						String temp = array[k];
						array[k] = array[k + 1];
						array[k + 1] = temp;
					}
				}
			}
			StopTime = System.nanoTime();
			for (int index = 0; index <= array.length - 1; index++) {
				System.out.println(array[index]);
			}
			System.out.println("time taken for bubble sort of String " + (StopTime - startTime));
		}

		// ***************************************************************************************************************\\
		public static void binaryStirng() {
			System.out.println("enter string");
			String first = utility.getNextLine();
			String[] sort1 = first.split("");
			Arrays.sort(sort1);
			for (String k : sort1)
				System.out.println(k);
			System.out.println("enter  string to sort");
			String search = utility.getStringName();
			int firstindex = 0;
			int lastindex = sort1.length - 1;
			long starttime = System.nanoTime();
			long stoptime = 0;
			while (firstindex <= lastindex) {
				int mid = (firstindex + lastindex) / 2;
				if (search.compareTo(sort1[mid]) == 0) {
					stoptime = System.nanoTime();
					System.out.println("search element found at" + (mid + 1));
					break;
				}
				if (search.compareTo(sort1[mid]) > 0) {
					firstindex = mid + 1;
				} else {
					lastindex = mid - 1;
				}
			}
			stoptime = System.nanoTime();
			System.out.println("Time Taken to sort" + (stoptime - starttime));
			// ****************************************************************************************************\\
			// System.out.println(" time taken for searcing of string
			// "+(stoptime-starttime));

		}

		public static boolean binarySearch(String arr[], String userSearch) {
			int count = 0;
			int firstIndex = 0;
			int endIndex = arr.length;
			while (firstIndex < endIndex) {
				int mid = firstIndex + (endIndex - firstIndex) / 2;
				if (arr[mid].equalsIgnoreCase(userSearch))// condition to check if strings are equal are not
				{
					count++;
				}

				if (arr[mid].compareToIgnoreCase(userSearch) > 1)// comparing the strings to trim array
				{
					firstIndex = mid + 1;
				} else {
					endIndex = mid - 1;
				}

			}

			if (count > 0) {
				return true;
			} else {
				return false;
			}
		}
		/// **************************************************************************************************\\

		// public static boolean binarySearch(String arr[], String userSearch) is to
		// search the element extercted from file

		public static boolean binarysearchFile(String s1) throws Exception {
			String line;
			String path = "/home/admin123/Documents/channa.txt";
			ArrayList<String> arraylist = new ArrayList<String>(); // to store values
			FileInputStream fileinput = new FileInputStream(path); // to get the value from text file
			InputStreamReader inputStream = new InputStreamReader(fileinput); // to read byte to char stream
			BufferedReader bufferReader = new BufferedReader(inputStream); // to read char using buffer class

			while ((line = bufferReader.readLine()) != null)
			// data stored in line
			{
				String word[] = line.split(" ");
				for (int i = 0; i < word.length; i++) {
					arraylist.add(word[i]);// adding to arraylist
				}

			}

			int size = arraylist.size();
			String list[] = new String[size];
			list = arraylist.toArray(list);// converting list to Array
			Arrays.sort(list);
			bufferReader.close();
			if (utility.binarySearch(list, s1) == true) {
				return true;
			} else
				return false;

		}
		////////////////////////////////////////////////////////////////////////////
		/*
		 * 
		 */

		/**
		 * @purpose : This method is used to find weather the given strings are
		 *          primeanagram are not
		 * @return :ArrayList
		 **/
		public static ArrayList<String> primeAnagram() {
			ArrayList<String> arraylist = new ArrayList<>();
			ArrayList<String> arrayList2 = new ArrayList<>();
			arraylist.addAll(PrimeNUmber(1000));
			int size = arraylist.size();
			String[] arr = new String[size];
			arr = arraylist.toArray(arr);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (anagram(arr[i], arr[j]) == true) {
						arrayList2.add(arr[i]);
					}
				}
			}
			return arrayList2;
		}
		// ***********************************************\\

		/**
		 * @purpose : This method is used to find weather the given strings are anagram
		 *          are not
		 * @return : boolean
		 **/
		public static boolean isAnagram(String str1, String str2) {
			String s1 = str1.replaceAll("\\s", "");
			String s2 = str2.replaceAll("\\s", "");
			boolean status = false;

			if (s1.length() != s2.length()) {
				status = false;
			}

			char[] arrs1 = s1.toLowerCase().toCharArray();
			char[] arrs2 = s2.toLowerCase().toCharArray();

			Arrays.sort(arrs1);
			Arrays.sort(arrs2);

			status = Arrays.equals(arrs1, arrs2);

			return status;

		}
		// ***********

		/**
		 * @purpose : This method is used to find weather the given strings are anagram
		 *          are not
		 * @return : boolean
		 **/
		public static ArrayList<Integer> palindrome() {

			ArrayList<String> list = new ArrayList<String>();
			ArrayList<Integer> listp = new ArrayList<Integer>();

			// calling method to store all prime numbers
			list.addAll(utility.PrimeNUmber(1000));

			int size = list.size();
			String[] arr = new String[size];

			// converting arraylist to string array
			arr = list.toArray(arr);

			int iarr[] = new int[arr.length];

			// converting string array to interger array
			for (int i = 0; i < arr.length; i++) {
				iarr[i] = Integer.parseInt(arr[i]);
			}

			// loop to find prime palindrome numbers
			for (int i = 0; i < iarr.length; i++) {
				int r = 0;
				int sum = 0;
				int temp1 = iarr[i];

				while (iarr[i] > 0) {
					r = iarr[i] % 10;
					sum = (sum * 10) + r;
					iarr[i] = iarr[i] / 10;
				}

				if (temp1 == sum) {
					listp.add(temp1);
					System.out.println(sum + "yes palandrom");

				} // else
					// System.out.println(sum+"no not a palandrom");

			}
			return listp; // return list of prime palindrome
		}

		/// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		/**
		 * @purpose : This method is used to find the day by using standred formule
		 *          using switch case day
		 * @return : int
		 **/

		public static int getDay(int month, int day, int year) {

			/* standard formulas to find the day falls on the date */
			int y = year - (14 - month) / 12;
			int x = y + y / 4 - y / 100 + y / 400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d = (day + x + 31 * m / 12) % 7;
			switch (d) {
			case 0:
				System.out.println("Mon");
				break;
			case 1:
				System.out.println("Tus");
				break;
			case 2:
				System.out.println("Wed");
				break;
			case 3:
				System.out.println("Thur");
				break;
			case 4:
				System.out.println("Fri");
				break;
			case 5:
				System.out.println("Sat");
				break;
			case 6:
				System.out.println("Sun");

			default:
				System.out.println("No Week found");
				break;
			}
			return d;// returning d value
		}
		/// ******************************************************||
		/*
		 * 
		 */

		/**
		 * @purpose : This method is used to find to know the temp
		 * 
		 * @return : void
		 **/
		public static void temp(int i) {
			switch (i) {
			case 1:
				System.out.println("enter to show fahrinhear");
				double fahrin_d = utility.getDouble();
				double celsiusToFahrenheit = (fahrin_d * 9 / 5) + 32;
				System.out.println(celsiusToFahrenheit);
				break;
			case 2:
				System.out.println("Enter to show dgree");
				double degree_d = utility.getDouble();
				double fahrenheitToCelsius = (degree_d - 32) * (5 / 9);
				System.out.println(fahrenheitToCelsius);
				break;
			default:
				System.out.println("Enter valid Number(rance of (1-2))");

			}
		}

		// *****************************************************************************************************************\\
		public static double monthlyPayment(double P, double Y, double R) {
			double payment = 0;
			double n = (12 * Y);
			double r = R / (12 * 100);
			payment = (P * r) / (1 - Math.pow(1 + r, -n)); // standard formula to find monthly payment
			return payment;
		}

		// ********************************************************************************************************************\\
		public static void vendingMachine(int n) {
			int notes = 0;
			int money[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

			for (int i = 0; i < money.length; i++) {
				if (n / money[i] > 0) {

					System.out.println(money[i] + " notes are " + n / money[i]);
					notes = notes + n / money[i];
					n = n % money[i];
				}

			}
			System.out.println("total number of notes returned by vendor machine is = " + notes);
		}

		// *************************************************************************************************************************\\
		public static double squarertnon(double c) {
			double t = c;
			double epsilon = 1e-15;
			while (Math.abs((t - c / t)) > epsilon * t) {
				t = ((c / t + t) / 2);
			}
			System.out.println("" + t);
			return t;
		}
		// **************************************************************************************************************************\\

		public static void guess(int[] arry, int last, int rare) {
			int mid;
			char ans;
			if (last == rare) {
				System.out.println("Your number is :" + arry[last]);
				return;
			} else {
				mid = (last + rare) / 2;
				System.out.println("is your number Equal  or Smaller  Compred to :" + arry[mid]);
				System.out.println("Enter smaller 'y/n'");
				System.out.println("Enter Equal s:");
				ans = utility.getStringName().toLowerCase().charAt(0);
				if (ans == 'y')
					guess(arry, last, mid - 1);
				else if (ans == 'n')
					guess(arry, mid + 1, rare);
				else if (ans == 's')
					System.out.println("your number is:" + arry[mid]);
				else
					System.out.println("Not in a range");
			}
		}

	//****************************************************************************************************\\
		/*
		 * 
		 * DATA_STRUCTERS
		 * 
		 * 
		 */
		@SuppressWarnings("resource")
		public static int[] ReadFileInt(String path) throws Throwable {
			String line;
			 // reading data from file
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr); // reading data from fr object
			while ((line = br.readLine()) != null) {
				String word[] = line.split(" ");

				int size = word.length;
				int arr[] = new int[size];
				/* for loop to convert string to integer data */
				for (int i = 0; i < arr.length; i++)

				{
					arr[i] = Integer.parseInt(word[i]);

				}

				br.close();
				return arr;
			}
			return null;

		}

	//***************************************************************************************************\\
		public static String[] fileReadString(String path) throws Exception

		{
			String line;
			FileReader fr = new FileReader(path); // reading data from file
			BufferedReader br = new BufferedReader(fr); // reading data from for object

			/* reading data from br object and adding it to linkedlist */
			while ((line = br.readLine()) != null) {
				String word[] = line.split(" ");// adding word in file to word array

				return word;
			}
			br.close();
			return null;
		}
	//*********************************************************************************************\\

		/**
		 * @purpose : This method is used to convert arraylist to integer array
		 * @return : integer array
		 **/
		public static int[] convertToIntegerArray() {
			// creating arraylist object to store prime numbers
			ArrayList<String> al = new ArrayList<String>();
			al = primeAnagram();// calling prime method to get all prime numbers between 1-1000
			int size = al.size();
			String arr[] = new String[size];
			int prime[] = new int[size];
			/* loop to store elements in a string array */
			for (int i = 0; i < arr.length; i++) {
				arr[i] = al.get(i);
			}
			/* loop to convert string array to integer array */
			for (int i = 0; i < arr.length; i++) {
				prime[i] = Integer.parseInt(arr[i]);// calling method to convert string to integer
			}
			return prime; // returning prime array

	}
		//------------------------------------------------------------------------------------

		public static void chackLeapYear(int year) {
			// TODO Auto-generated method stub
			
			
		if(year%100==0&&year%4==0&&year%100==0) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is mnot leap ");
		}
		
			
		}
}
