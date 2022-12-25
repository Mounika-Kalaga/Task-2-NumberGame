import java.util.*;
class NumberGame
{

  	public static void main(String args[])
  	{
  		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("*********Task-2 :Number Guessing Game *********");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Number guessing game");
		System.out.println("--------------------------------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		//Guess g=new Guess();
		System.out.println("Start the game : Yes/No");
		String s=sc.nextLine();
		while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
		{
			 beginGame();
			System.out.println("Do you want to continue Yes/No");
			s=sc.nextLine();
		}
 	}
 	public static void beginGame()
	{
		Random rd=new Random();
		Scanner scanner=new Scanner(System.in);
		int value=rd.nextInt(201);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("*******System is generating Random Number*******");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Number you are trying to guess is in between 1-200 only");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("No. of chances you want to make (should be lessthan or equal to 10):");
		int count=scanner.nextInt();
		System.out.println("--------------------------------------------------------------------------------------");
		while(count>10)
		{
			System.out.println("You are trying to make chances that exceeds the limit!!!!!!. Please Enter number less than or equal to 10 : ");
			count=scanner.nextInt();
			System.out.println("--------------------------------------------------------------------------------------");
		}
		System.out.println("You have "+count+" Chances");
		System.out.println("--------------------------------------------------------------------------------------");
		int marks=1000;
		int i=0;
		for(i=0;i<count;i++)
		{
			
			System.out.println("Chance number :"+(i+1)+". Enter the number you guessed ");
			int number=scanner.nextInt();
			
		    if(number>value)
			{
				System.out.println("Number you guessed is  'Greater than' original number");
				System.out.println("--------------------------------------------------------------------------------------");
			}
			else if (number<value)
			{
				System.out.println("Number you guessed is  'Less than' original number");
				System.out.println("--------------------------------------------------------------------------------------");
			}
			else 
			{;
				System.out.println("Congratulations!!! You won the Game");
				System.out.println("SCORE : "+marks);
				System.out.println("--------------------------------------------------------------------------------------");
				break;
			}
			marks= marks-100;
		}

		if(i>=count)
		{
			 System.out.println("OOPS!!!! You Lost the game,please try again");
			 System.out.println("SCORE : 0 and the number is : "+ value);
			 System.out.println("--------------------------------------------------------------------------------------");
		}
	}
}

