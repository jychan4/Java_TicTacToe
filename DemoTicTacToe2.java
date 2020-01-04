//Yew Journ Chan & Alex Wong

import java.util.Scanner;

public class DemoTicTacToe2
{

	public static void main(String []args)
	{
		//Initialize variables
		Scanner input = new Scanner(System.in);
		TicTacToe2 challenge = new TicTacToe2();	
		char user='O';
		int r=0;
		int c=0;
		char gameOver;
		do
		{
			//Initialize the game board which is empty
			challenge.initializeTTT();

			System.out.println("Challenge me in TicTacToe?");
			//Display board
			challenge.displayTTT();


			while(true)
			{
				user=challenge.playerTurn(user);
				System.out.println(user + ", Enter Choice: (1-3) ");
				System.out.println("Row: (1-3) ");
				r=input.nextInt();
				while(r>=4||r<=0)
				{
					System.out.println("Out of range. Try again.");
					r=input.nextInt();
				}
				System.out.println("Column: ");
				c=input.nextInt();
				while(c>=4||c<0)
				{
					System.out.println("Out of range. Try again.");
					c=input.nextInt();
				}
				
				//Checks if the slot is used or not
				while (challenge.isFull(r,c))
				{
					System.out.println("Slot is full");
					challenge.displayTTT();
					System.out.println("Row: ");
					r=input.nextInt();
					System.out.println("Column: ");
					c=input.nextInt();
				
				}

				//Update the TicTacToe
				challenge.changingTTT(user,r,c);
				challenge.displayTTT();

				//Check who is the winner by checking for 3-in-a-rows
				if(challenge.winner())
				{
					System.out.println("Winner: " + user);
					break;
				}

				//If there is no 3 in a row
				if(challenge.drawPlayer())
				{
					System.out.println("No winner");
					break;
				}
			}
			System.out.println("Play again? y/n");
			gameOver=input.next().charAt(0);

		}while(gameOver == 'y');
	}
}