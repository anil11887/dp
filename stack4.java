package stack;

import java.util.Stack;
import java.util.*;
public class stack4 {
	 static Queue<Integer>q;
	 static void reverse()
	{
		Stack<Integer>st=new Stack<>();
		while(!q.isEmpty())
		{
			st.add(q.peek());
			q.remove();
		}
		while(!st.isEmpty())
		{
			q.add(st.peek());
			st.pop();
		}
		
	}
	 static void print()
	 {
		 while(!q.isEmpty())
		 {
			 System.out.print(","+q.peek());
			 q.remove();
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krisha shiva
		q=new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		reverse();
		print();

	}

}
