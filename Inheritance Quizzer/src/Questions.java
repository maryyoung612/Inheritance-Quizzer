import java.util.Scanner;
public class Questions
	{
		public static void askQuestions()
		{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Welcome! What pray tell is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, "+name+"! This is the Inheritance Quizzer, there will be 24 questions asked of you. Good Luck!");
		System.out.println("_______________________________________________");
		}
	}