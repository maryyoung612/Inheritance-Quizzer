import java.util.ArrayList;
import java.util.Scanner;
public class Questions
	{
		public static void genQuestions()
			{
			Scanner userInput= new Scanner(System.in);
			ArrayList <GetterSetter> q = new ArrayList <GetterSetter>();
			q.add(new GetterSetter("Animal a =new Animal","a.eats();", 1));
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", 2));
			for(GetterSetter fred:q)
				{
				System.out.println(fred);
				int answer=userInput.nextInt();
				if(answer==q.getAnswer())
				{
					
				}
				}
			}
		public static void askQuestions()
		{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Welcome! What pray tell is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, "+name+"! This is the Inheritance Quizzer, there will be 24 questions asked of you. Good Luck!");
		System.out.println("_______________________________________________");
		int counter =0;
		System.out.println("Indicate 1.)true & 2.)false for each question. Determine if the following code is correct");
		System.out.println("_______________________________________________");
		genQuestions();
		}
	}