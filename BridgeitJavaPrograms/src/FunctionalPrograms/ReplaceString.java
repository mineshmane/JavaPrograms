/*************************************************************************************************************
 * @purpose	:Take user input and  replace string using replace method
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	:08-04-2019
 */



package FunctionalPrograms;

import bridgeit.util.Utility;

public class ReplaceString {

	public static void main(String[] args) {
		String stringFirst = " hello <<username>> , how are you ?";
		System.out.println("String Before replacement:= " + stringFirst);
		System.out.println(" Enetr User Name to replace");

		String replace = Utility.getString();

		if (replace.length() > 3) {

			String userName = Utility.replaceString(replace);
			System.out.println("String After Replacement:= " + userName);
		} else {

			System.out.println("please Enter valid user Name it is should be more than 3 character");
		}

	}

}
