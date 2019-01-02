import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Casey Capetola
 */
public class MontyHall 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner user = new Scanner(System.in);
		
		int winCount = 0;
		int lossCount = 0;
		System.out.print("How many rounds of the game should be simulated: ");
		int rounds = Integer.parseInt(user.nextLine());
		while(rounds<10 || rounds>10000)
		{
			System.out.println("\nMust enter a number between 10 and 10000");
			System.out.print("How many rounds of the game should be simulated: ");
			rounds = Integer.parseInt(user.nextLine());
		}
		
		System.out.print("Should the player switch or stay? ");
		String choice = user.nextLine();
		while(!choice.equals("switch") || !choice.equals("stay"));
		{
			System.out.println("Must enter either \"switch\" or \"stay\"");
			System.out.print("Should the player switch or stay? ");
			choice = user.nextLine();
		}
		
		int hidDoor;
		int doorOne;
		
		if(choice.equals("switch"))
		{
			for(int i= 0; i < rounds; i++)
			{
				hidDoor = rand.nextInt(3) + 1;
				doorOne = rand.nextInt(3) + 1;
				
				if(hidDoor==doorOne)
				{
					lossCount++;
				}	
				else
				{
					winCount++;
				}		
			}
			double winPercent = (winCount/rounds)*100;
			System.out.printf("\nThe player won %d/%d games (%.2f%)!", winCount, rounds, winPercent);
		}
		else
		{
			for(int i=0; i < rounds; i++)
			{
				hidDoor = rand.nextInt(3) + 1;
				doorOne = rand.nextInt(3) + 1;
				
				if(hidDoor==doorOne)
				{
					winCount++;
				}
				else
				{
					lossCount++;
				}
			}
			double winPercent = (winCount/rounds)*100;
			System.out.printf("\nThe player won %d/%d games (%.2f%)!", winCount, rounds, winPercent);
		}

	}

}
