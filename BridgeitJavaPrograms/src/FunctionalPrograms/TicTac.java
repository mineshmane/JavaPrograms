
/*************************************************************************************************************

 * @purpose	:Play tic toc tie game 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 11-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class TicTac {

	static String arr[][] = new String[3][3];
	static int row;
	static int column;

	public static void main(String[] args) {
		System.out.println("Lets start the game");
		System.out.println("First turn is computer");
		System.out.println("X---> is for computer");
		System.out.println("O---> is for player");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("board is ready to play");
		board();
		display(arr);
		System.out.println(playGame());
	}

	public static void board()// to display the size 
	{
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = "-- ";

			}
		}
	}

	public static void display(String arry[][]) {
		for (int i = 0; i < 3; i++) {// to create 3x3 board to play game
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static String playGame()// takes return type as String
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(" computer turn");
			int count = 0;
			while (count == 0) {
				row = Utility.random.nextInt(3); // creating border to to get values below 3 i.e ->n-1 values
				column = Utility.random.nextInt(3);
				if (arr[row][column] == "-- ") {
					count++;
					arr[row][column] = "X";
				}
				if (arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X" || // took reference of (0,0),(0,1),(0,2)
						arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X" || // took reef of (1,0),(1,1,),(1,2)
						arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X" || // Considered row and column
						arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X" || //
						arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X" || //
						arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X"
						|| arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X"//diagonal
						|| arr[2][0] == "X" && arr[1][1] == "X" && arr[0][2] == "X")//

				{
					display(arr);
					return " COMPUTER WIN";
				}
				display(arr);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			} // coumputer turn ..,.,.,.,
			/*
			 * 
			 * 
			 * User turn ,,,.,.,..,.,.,
			 * 
			 */
			System.out.println("user Turn ");
			System.out.println();
			count = 0;
			while (count == 0) {
				try {
					System.out.println("enter row");
					row = Utility.getIntNumber();
					System.out.println("enter col");
					column = Utility.getIntNumber();
				} catch (Exception e) {
					System.out.println(e);// TODO: handle exception
				}
				if (arr[row][column] == "-- ") {
					count++;
					arr[row][column] = "O";
				} else {
					System.out.println("place is occupied");
					System.out.println("playing cheating game");
					System.out.println("exiting the game");
					System.exit(0);
				}
			}
			if (arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O"
					|| arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O"
					|| arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O"
					|| arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O"
					|| arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O"
					|| arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O"
					|| arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O"
					|| arr[2][0] == "O" && arr[1][1] == "O" && arr[0][2] == "O") {
				display(arr);
				return "  USER WIN ";
			}
			display(arr);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
		return "DRAW";
	}

}
