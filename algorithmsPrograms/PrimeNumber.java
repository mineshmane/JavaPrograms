package algorithmsPrograms;

import bridgeit.util.Utility;

public class PrimeNumber {
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter number ");
			int n=Utility.getIntNumber();
			Utility.checkPrimeNumber(n);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
