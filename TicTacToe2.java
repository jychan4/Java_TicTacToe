//Yew Journ Chan & Alex Wong
// Project 2 

public class TicTacToe2
{
	private char[][] TTT = new char [4][4];

	//Generate blank spaces to be later replaced by X or O

	public void initializeTTT()
	{
		for (int i=1;i<4;i++)
		{
			for (int j=1;j<4;j++)
			{
				TTT[i][j]=(' ');
			}
		}
	}	

	//Print out the the blank spaces and lines
	public void displayTTT()
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + TTT[1][1] + " | " + TTT[1][2] + " | " + TTT[1][3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + TTT[2][1] + " | " + TTT[2][2] + " | " + TTT[2][3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + TTT[3][1] + " | " + TTT[3][2] + " | " + TTT[3][3] + " |");
		System.out.println("|---|---|---|");
	}


	//Switch to different players each turn
	public char playerTurn(char differentPlayer)
	{
		char playerT='X';
		if (differentPlayer==('O'))
		{
			playerT=('X');
		}
		else if(differentPlayer==('X'))
		{
			playerT=('O');
		}
		return playerT;
	}

	public void changingTTT(char user, int row, int col)
	{
		TTT[row][col]=user;
	}


	//Checks if the array is full or not
	public boolean isFull(int r, int c)
	{
		if ((r>4||c>4||r<1||c<1))
		{
			return true;
		}
		else if (TTT[r][c]=='X'||TTT[r][c]=='O')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Check if there are 3 in a row for both players
	//Only 8 ways to win TicTacToe

	public boolean winner()
	{
		if (TTT[1][1]==TTT[2][1]&&TTT[2][1]==TTT[3][1]&&(TTT[1][1]==('X')||TTT[1][1]==('O')))
		{
			return true;
		}
		else if (TTT[1][2]==TTT[2][2]&&TTT[2][2]==TTT[3][2]&&(TTT[1][2]==('X')||TTT[1][2]==('O')))
		{
			return true;
		}
		else if (TTT[1][3]==TTT[2][3]&&TTT[2][3]==TTT[3][3]&&(TTT[1][3]==('X')||TTT[1][3]==('O')))
		{
			return true;
		}
		else if (TTT[1][1]==TTT[1][2]&&TTT[1][2]==TTT[1][3]&&(TTT[1][1]==('X')||TTT[1][1]==('O')))
		{
			return true;
		}
		else if (TTT[2][1]==TTT[2][2]&&TTT[2][2]==TTT[2][3]&&(TTT[2][1]==('X')||TTT[2][1]==('O')))
		{
			return true;
		}
		else if (TTT[3][1]==TTT[3][2]&&TTT[3][2]==TTT[3][3]&&(TTT[3][1]==('X')||TTT[3][1]==('O')))
		{
			return true;
		}
		else if (TTT[1][1]==TTT[2][2]&&TTT[2][2]==TTT[3][3]&&(TTT[1][1]==('X')||TTT[1][1]==('O')))
		{
			return true;
		}
		else if (TTT[3][1]==TTT[2][2]&&TTT[2][2]==TTT[1][3]&&(TTT[3][1]==('X')||TTT[3][1]==('O')))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	//Checks if the game is a draw
	//Iterates through each row and column to check any blanks
	//If found any blanks, return false
	public boolean drawPlayer()
	{
		for (int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				if (TTT[i][j]==(' '))
				{
					return false;
				}
			}
		}
		return true;
	}
}