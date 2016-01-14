public class GetterSetter
	{
	private String content;
	private int answer;
	public GetterSetter(String c, int a)
	{
	content=c;
	answer=a;
	}
	public String getContent()
		{
			return content;
		}
	public void setContent(String content)
		{
			this.content = content;
		}
	public int getAnswer()
		{
			return answer;
		}
	public void setAnswer(int answer)
		{
			this.answer = answer;
		}
	}