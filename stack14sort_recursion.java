package stack;
import java.util.*;
public class stack14sort_recursion {
	public static void sort(Stack<Integer>s)
	{
		while(s.isEmpty())
		{
			return;
		}
		int x=s.pop();
		sort(s);
		Stack<Integer>s2=new Stack<>();
		while(!s.isEmpty()&&s.peek()>x)
		{
			s2.push(s.pop());
		}
		s.push(x);
		while(!s2.isEmpty())
		{
			s.push(s2.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(5);
        s.push(18);
        s.push(14);
        s.push(3);
        sort(s);
        while(!s.isEmpty())
        {
        	System.out.print(" "+s.pop());
        }
       
	}

}
