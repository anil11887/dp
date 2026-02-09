package stack;
import java.util.*;
public class stack10 {
	public static int count(String s)
	{
		Stack<Integer>st=new Stack<>();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='(')
			{
			st.push(i);	
			}
			else
			{
				if(!st.isEmpty() && s.charAt(st.peek())=='(')
				{
					st.pop();
				}
				else
				{
					st.push(i);
				}
				
			}
		}
		int result=0;
		int last=n;
		while(!st.isEmpty())
		{
			int now=st.pop();
			result=Math.max(result, last-now-1);
			last=now;
		}
		return Math.max(result, last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		String s=" )()())";
		System.out.println("count:"+count(s));
	}

}
