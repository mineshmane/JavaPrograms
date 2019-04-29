/*************************************************************************************************************
 * @purpose	:To print triplet pairs
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	:11-04-2019
 */



package FunctionalPrograms;

import bridgeit.util.Utility;

public class SumOfThreeNumbers {

	public static void main(String[] args) {
		try {
			
			
			System.out.println("Enter size of aray");
			
			int size = Utility.getIntNumber();
			
			Utility.sumOfThreeNumbers(size);
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
