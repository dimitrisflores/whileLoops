import java.util.Scanner;
public class letterQ
{
public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		
		boolean keepGoing = true;
		while(keepGoing)
			{
				System.out.println("Please type a letter.");  
				String name = userInput.nextLine();
				if (name.contains("q"))
					{
					System.out.println(false);
					break;
					}
				else
					{
					System.out.println(keepGoing);
					}
			}
	
	}
}

