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
			q.add(new GetterSetter("Bird b =new Bird","b.bearsYoung();", true));//3
			q.add(new GetterSetter("Mammal m =new Mammal","m.bearsYoung();", true));//4
			q.add(new GetterSetter("Does the code work?"," ", true));//5
			q.add(new GetterSetter("Animal a =new Animal","a.bearsYoung();", false));//6
			q.add(new GetterSetter("FlightBehavior f =new Animal","f.flies();", false));//7
			q.add(new GetterSetter("Animal a =new Animal","a.makesNoise(5);", false));//8
			q.add(new GetterSetter("Bird b =new Mammal","b.eats();", false));//9
			q.add(new GetterSetter("Mammal m =new Mammal","m.eats();", true));//10
			q.add(new GetterSetter("Public interface FlightBehavior { public void flies() ","{*some code here*} }", false));//11
			q.add(new GetterSetter("Mammal m =new Animal","m.hasHair();", false));//12
			q.add(new GetterSetter("Animal a =new Bird","a.eats();", true));//13
			q.add(new GetterSetter("Mammal m =new Animal","m.bearsYoung();", false));//14
			q.add(new GetterSetter("Bird b =new Bird","b.bearsYoung(2);", false));//15
			q.add(new GetterSetter("Bird b =new Bird","myFlightBehavior= (FlightBehavior) new CanFly();", true));//16
			q.add(new GetterSetter("Bird b =new Bird","b.eats();", true));//17
			q.add(new GetterSetter("Mammal m =new Bird","m.bearsYoung();", false));//18
			q.add(new GetterSetter("Mammal m =new Mammal","m.bearsYoung(0);", false));//19
			q.add(new GetterSetter("Does the interface work?","", true));//20
			q.add(new GetterSetter("Animal a =new Animal","a.food(5);", false));//21
			q.add(new GetterSetter("Mammal m =new Bird","m.hasHair();", false));//22
			q.add(new GetterSetter("Bird b =new Bird","b.hasHair();", false));//23
			q.add(new GetterSetter("Animal a =new Animal","a.eats();", true));//24
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