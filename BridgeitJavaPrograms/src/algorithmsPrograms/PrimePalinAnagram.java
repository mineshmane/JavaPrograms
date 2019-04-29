
/******************************************************************************
	 * Purpose: To print  primes number which are  palindrome and anagrams 

	 * @author Minesh Mane
	 * @version 1.0
	 * @since 13-04-2019
	 *
	 ******************************************************************************/


package algorithmsPrograms;

import java.util.ArrayList;

import bridgeit.util.Utility;

public class PrimePalinAnagram {

	public ArrayList<Integer> primeNo(int n) // prime no
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			int i, number;
			Boolean flag = false;

			for (number = 1; number <= n; number++) {
				flag = false;
				for (i = 2; i <= number / 2; i++) {
					if (number % i == 0) {
						flag = true;

						break;
					}
				}
				if (flag == false && number > 1) {
					list.add(number);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	public static int isPalin(int num) // reverse
	{
		int test = 0;
		try {

			while (num != 0) {
				int lastdigit = num % 10;
				test = test * 10 + lastdigit;
				num = num / 10;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return test;
	}
	public static Boolean isPalindrome(int num) {
		return num == isPalin(num);
	}

	public static void main(String[] arg) {
		PrimePalinAnagram p = new PrimePalinAnagram();
		ArrayList<Integer> list = new ArrayList<Integer>(); // List of prime numbers
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // List of prime-palindrome numbers
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // List of prime-palindrome-anagram numbers

		int n = 0;
		System.out.println("Enter n : ");
		n = Utility.getIntNumber();

		list = p.primeNo(n);

		System.out.println("Prime numbers are : ");
		for (int j : list) {
			System.out.println(j + " ");
		}
		System.out.println("\nList of prime-palindrome numbers : ");

		for (int i : list) {
			if (isPalindrome(i)) {
				System.out.println(i + " ");
				list1.add(i);
			}
		}
		for (int i : list) // anagram numbers
		{
			for (int j : list1) {
				if (i == j) {
					list2.add(i);
				}
			}
		}
		System.out.println("\nPrime-Palindrome-anagram numbers are : ");
		for (int i : list2) {
			System.out.println(i + " ");
		}
	}

}
