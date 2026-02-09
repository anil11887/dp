package stack;
import java.util.*;
public class stack9 {
	static Stack<Integer>s1=new Stack<>();
	static Stack<Integer>min=new Stack<>();
	public static void push(int x)
	{
		if(s1.isEmpty()==true)
		{
			s1.push(x);
			min.push(x);
		}
		else
		{
			s1.push(x);
			int y=min.pop();
			min.push(y);
			if(x<=y)
			{
				min.push(x);
			}
		}
	}
	public static int pop()
	{
		int x=s1.pop();
		int y=min.pop();
		if(y!=x)
		{
			min.push(y);
		}
		return x;
	}
	public static int getmin()
	{
		int y=min.pop();
		min.push(y);
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		push(5);
		push(7);
		push(8);
		System.out.println("minimum is:"+getmin());
		push(4);
		push(9);
		push(1);
		System.out.println("minimum is:"+getmin());
		pop();
		pop();
		System.out.println("minimum is:"+getmin());
	}

}
