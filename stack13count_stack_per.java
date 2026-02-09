package stack;
import java.util.*;
public class stack13count_stack_per {
	public static int count(int n)
	{
		int result=0;
	Stack<Integer>st=new Stack<>();
		for(int i=1;i<=9;i++)
		{
			st.push(i);
			result++;
		}
		while(!st.isEmpty())
		{
			int tp=st.pop();
			for(int j=tp%10;j<=9;j++)
			{
				int x=tp*10+j;
				if(x<=n)
				{
					st.push(x);
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		int n = 15; 
        System.out.println(count(n)); 
	}

}
