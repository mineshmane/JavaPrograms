
/*************************************************************************************************************

 * @purpose	:To check string is anagram string or not

 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */

package algorithmsPrograms;

import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		try {
			Scanner scaneer = new Scanner(System.in);
			System.out.println("Enter first Sting");
			char string1[] = scaneer.next().toCharArray();
			System.out.println("Enter scond sring");
			char string2[] = scaneer.next().toCharArray();
			scaneer.close();
			Util.checkAnagram(string1, string2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
