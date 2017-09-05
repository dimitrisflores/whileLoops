import java.util.Scanner;

public class guessingGame
{
	public static void main(String args[])
		{
		Scanner user = new Scanner(System.in);

		int a = 1 + (int) (Math.random() * 99);
		int guess = 0;
		System.out.println("Guess a number between 0-100");
		while(guess != a)
			{
			guess = user.nextInt();
			if (guess > a)
				{  
				System.out.println("The number is lower!");
				}
			else if (guess < a) 
				{
				System.out.println("higher!");
				}
			else 
				{
				System.out.println("Congratulations. you got it right");
				}
			}
		}
}