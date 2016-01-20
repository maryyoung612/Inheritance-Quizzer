import java.util.ArrayList;
public class Runner
	{
		public static void main(String[] args)
			{
			Questions.askName();
			Questions.genQuestions();
			while (Questions.q.size() > 0)
				{
				System.out.println("               ||||||||||||||||       ");
				Questions.answerQuestion();
				Questions.q.remove(0);
				System.out.println("You have gotten "+Questions.counter+" question(s) right and "+Questions.counter1+" question(s) wrong!");
				}
			
			}
	}