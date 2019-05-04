package BalancedParanthesis;

import BridgeIt.util.utility;

public class BalancedParentheses {
	public static void main(String[] args) {

		try {
			char search;
			Stack<Character> st = new Stack<Character>();// creating object for stack class
			System.out.println("Enter your Arithmetic Expression ");
			
			final String Expression = utility.getStringName();
			/* for loop is used to push and pop the parenthesis */
			for (int i = 0; i < Expression.length(); i++) {
				search = Expression.charAt(i);
				if (search == '(') {
					st.push(search);// pushing the element to stack object
				} else if (search == ')') {
					st.pop(); // removing the element from stack object
				}
			}
			if (st.isEmpty() == true) // condition to check stack object is empty or not
			{
				System.out.println("Arithmetic Expression balanced");
			} else {
				System.out.println("Arithmetic Expression not balanced");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter valid data");
		}
	}
}
