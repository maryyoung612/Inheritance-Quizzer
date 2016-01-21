public class GetterSetter
	{
	private String content;
	private String method;
	private boolean answer;
	public GetterSetter(String c, String m, boolean a)
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

	public boolean isAnswer()
		{
		return answer;
		}
	public void setAnswer(boolean answer)
		{
		this.answer = answer;
		}
	@Override
	public String toString()
		{
			return "*"+content + "~~ method=" + method;
		}
	}