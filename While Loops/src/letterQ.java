import java.util.Scanner;
public class letterQ
{
public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String counter = "q";
		while(true)
			{
				System.out.println("Whats your input?");
				String guess =userInput.nextLine();

				for (int i=0; i<= guess.length();)
					{
					if (guess =="q")
						{
						counter = "q";	
						break;
						}
					else
						{
						System.out.println("nice!");
			
						}
					
				
					}
				 
			}
	}
}
