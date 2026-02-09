package stack;
import java.util.*;
public class stack12stack_permutation {
	public static boolean stackper(int arr1[],int arr2[])
	{
		int n1=arr1.length;
		int n2=arr2.length;
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<n1;i++)
		{
			q.add(arr1[i]);
		}
		Queue<Integer>q2=new LinkedList<>();
		for(int i=0;i<n2;i++)
		{
			q2.add(arr2[i]);
		}
		Stack<Integer>st=new Stack<>();
		while(!q.isEmpty())
		{
			int ele=q.poll();
			if(ele==q2.peek())
			{
				q2.poll();
				while(!st.isEmpty()) {
				if(st.peek()==q2.peek())
				{
					st.pop();
					q2.poll();
				}
				else
				{
					break;
				}
			}
			}
			else
			{
				st.push(ele);
			}
		}
		return (q.isEmpty() && st.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		int input[] = { 1, 2, 3 };
		 
        // Output Queue
        int output[] = { 3, 1, 2 };
        
        if (stackper(input, output))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
	}

}
