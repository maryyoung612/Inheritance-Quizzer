public class GetterSetter
	{
	private String content;
	private String method;
	private int answer;
	public GetterSetter(String c, String m, int a)
	{
	content=c;
	method=m;
	answer=a;
	}
	public String getMethod()
		{
			return method;
		}
	public void setMethod(String method)
		{
			this.method = method;
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
	@Override
	public String toString()
		{
			return "*"+content + ", method=" + method + ", answer=" + answer;
		}
	}