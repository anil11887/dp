package stack;
import java.util.*;
public class stack11_balanced_parenthesis {
	public static boolean duplicate(String str)
	{
		Stack<Character>st=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(ch==')')
			{
				if(st.peek()=='(')
				{
					return true;
				}
				else
				{
					while(st.peek()!='(')
					{
						st.pop();
					}
					st.pop();
				}
			}
			else
			{
				st.push(ch);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		String str="((a+b))";
		if(duplicate(str))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
