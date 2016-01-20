import java.util.ArrayList;
import java.util.Scanner;
public class Questions
	{
	static ArrayList <GetterSetter> q = new ArrayList <GetterSetter>();
	static int counter =0;
	static int counter1 =0;
		public static void genQuestions()
			{
		    
			q.add(new GetterSetter("Animal a =new Animal","a.eats();", true));//1
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//2
			
			/*q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//3
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//4
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//5
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//6
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//7
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//8
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//9
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//10
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//11
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//12
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//13
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//14
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//15
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//16
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//17
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//18
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//19
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//20
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//21
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//22
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//23
			q.add(new GetterSetter("Mammal m =new Animal","m.eats();", false));//24*/
			//int hello=(int)(Math.random()*q.size());
			
			
			}
		public static void answerQuestion()
		{
		Scanner userInput= new Scanner(System.in);
		System.out.println(Questions.q.get(0));
		String response=userInput.nextLine();
		if(response.equals("t") && q.get(0).isAnswer()==true)
			{
			System.out.println("That's correct!");
			counter++;
			}
		else if(response.equals("f") && q.get(0).isAnswer()==false)
			{
			System.out.println("That's correct!");
			counter++;
			}
		else
			{
			System.out.println("That's incorrect!");
			counter1++;
			}
		}
		public static void askName()
		{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Welcome! What pray tell is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, "+name+"! This is the Inheritance Quizzer, there will be 24 questions asked of you. Good Luck!");
		System.out.println("_______________________________________________");
		System.out.println("Indicate t for true & f for false. Determine if the following code is correct");
		System.out.println("_______________________________________________");
		}
	}