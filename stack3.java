package stack;

import java.util.Queue;
import java.util.*;

public class stack3 {
	Queue<Integer>q=new LinkedList<Integer>();
	//sri krishna,shiva
	 void push(int x)
	{
		
		q.add(x);
		for(int i=0;i<q.size()-1;i++)
		{
			q.add(q.remove());
			
		}
	}
	 int top()
	{
		return q.peek();
	}
	 int pop()
	 {
		 return q.remove();
	 }
	 public static void main(String[] args)
	 {
		 stack3 s=new stack3();
		 s.push(1);
		 s.push(2);
		 s.push(3);
		 s.push(4);
		 System.out.println("Top of the stack: " + s.top());
	        
	     System.out.println("The deleted element is: " + s.pop());
	 System.out.println("Top of the stack after removing element: " + s.top());

	 }

}
