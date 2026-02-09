package stack;
import java.util.*;
public class stack8 {
	public static int prec(char c)
	{
		if(c=='^')
		{
			return 3;
		}
		else if(c=='*' || c=='/')
		{
			return 2;
		}
		else if(c=='+' || c=='-')
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
	static char associativity(char c)
	{
		if(c=='^')
		{
			return 'R';
		}
		return 'L';
	}
	public static void infixtopostfix(String s)
	{
		Stack<Character>stack=new Stack<>();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a'&& c<='z')|| (c>='A' && c<='Z') || (c>='0' && c<='9'))
			{
				result.append(c);
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty()&& stack.peek()!='(')
				{
					result.append(stack.pop());
				}
				stack.pop();
			}
			
			else
			{
				while(!stack.isEmpty() && (prec(s.charAt(i))<prec(stack.peek())
						|| prec(s.charAt(i))==prec(stack.peek())&&
						associativity(s.charAt(i))=='L'))
				{
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			result.append(stack.pop());
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        infixtopostfix(exp);
	}

}
