package palindromeChecker;

import BridgeIt.util.utility;

public class PalindromeChecker {
	
	
	
		public static void main(String[] args) 
		{
			String str = "";
			System.out.println("Enter a word");
			String Word = utility.getStringName();//calling getstring method to scan a word from user 
			if(Word.matches("[a-zA-Z]+"))
			{
				Dequeue d = new Dequeue(Word.length()); // creating object for deque class with length of word as arugumentjag	
				for (int i=0;i<Word.length();i++)
				{
					d.addRear(Word.charAt(i));// adding character to rear position of deque	
				}	
				for (int i=0;i<Word.length();i++)
				{
					str=str+d.getFront(); // getting character from front position of deque and concating with a empty string
				}
					
				if(Word.equals(str)) // condition to check string is palindrome or not
				{
					System.out.println("Word is palindrome");
				}
				else
				{
					System.out.println("Word is not palindrome");	
				}
			}
			else
			{
				System.out.println("Enter valid data ...........");
			}
		}
	
	

}
