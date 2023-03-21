import java.util.Scanner;
class Guesser
{
	int min=0,max=100;
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser please guess the number between 1 to 100");
		guessNum = scan.nextInt();
		if(guessNum>min&&guessNum<=max) 
		{
			System.out.println("enter number is in the range "+ guessNum);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.out.println("game is exiting try again");
			System.exit(0);
		}
		return guessNum;
	}
}
class Player
{
	int min=0,max=100;
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	int guessNum1() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 1 please guess the number between 1 to 100");
	    guessNum1 = scan.nextInt();
	    if(guessNum1>min&&guessNum1<=max) 
		{
			System.out.println("enter number is in the range "+ guessNum1);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.out.println("game is exiting try again");
			System.exit(0);
		}
		return guessNum1;
	}
	int guessNum2() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 2 please guess the number between 1 to 100");
	    guessNum2 = scan.nextInt();
	    if(guessNum2>min&&guessNum2<=max) 
		{
			System.out.println("enter number is in the range "+ guessNum2);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.out.println("game is exiting try again");
			System.exit(0);
	
		}
	    
		return guessNum2;
	}
	int guessNum3() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 3 please guess the number between 1 to 100");
	    guessNum3 = scan.nextInt();
	    if(guessNum3>min&&guessNum3<=max) 
		{
			System.out.println("enter number is in the range "+ guessNum3);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.out.println("game is exiting try again");
			System.exit(0);
		}
	    return guessNum3;
	}
}
class Umpire 
{
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	void collectNumberFromGuesser() 
	{
		Guesser g=new Guesser();
		numberFromGuesser=g.guessNum();
		
	}
	void collectNumberFromPlayers() 
	{
		 Player p1 =new Player();
		 Player p2 =new Player();
		 Player p3 =new Player();
		 numberFromPlayer1=p1.guessNum1();
		 numberFromPlayer2=p2.guessNum2();
		 numberFromPlayer3=p3.guessNum3();
	}
	void compare() 
	{
		if (numberFromGuesser==numberFromPlayer1) 
		{
			if (numberFromGuesser==numberFromPlayer2&&numberFromGuesser==numberFromPlayer3) 
			{
				System.out.println("All players won the game");
				System.out.println();
				System.out.println("Game Over");
			}
			else if(numberFromGuesser==numberFromPlayer2) 
			{
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numberFromGuesser==numberFromPlayer3) 
			{
			System.out.println("Player 1 and Player 3 won the game");
			}
			else 
			{
			System.out.println("Player 1 won the game");
			System.out.println();
			System.out.println("Game Over");
			}
		}
		else if (numberFromGuesser==numberFromPlayer2) 
		{
			if(numberFromGuesser==numberFromPlayer3) 
			{
				System.out.println("Player 2 and Player 3 won the game");
			}
			else 
			{
				System.out.println("Player 2 won the game");
				System.out.println();
				System.out.println("Game Over");
			}
		}
		else if (numberFromGuesser==numberFromPlayer3) 
		{
			System.out.println("Player 3 won the game");
			System.out.println();
			System.out.println("Game Over");
		}	
		else 
		{
			System.out.println("All players lost the game and Please try again");
		}
	}
}
public class GuesserGame 
{

	public static void main(String[] args)
	{
		String username1 = "Vijaykumar@gmail.com";
		String password1 ="vijay123";
		
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String username = s.next();
        
        System.out.println("Enter password");
        String password = s.next();
        
        if(username.equalsIgnoreCase(username1) && password.equals(password1))
        {
            System.out.println("Authentication Successful");
            System.out.println("Begin the Game");
        }
        else
        {
            System.out.println("Incorrect username or password so please chack and try again");
            System.exit(0);
        }
		
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();

	}

}