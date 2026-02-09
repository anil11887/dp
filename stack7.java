package stack;
import java.util.*;
class mystack{
	Stack<Integer>s;
	Deque<Integer>dq;
	mystack()
	{
		s=new Stack<Integer>();
		dq=new ArrayDeque<Integer>();
	}
	void add(int data)
	{
		dq.addLast(data);
		if(dq.size()>s.size()+1)
		{
			int temp=dq.pollFirst();
			s.push(temp);
		}
	}
	void pop()
	{
		dq.pollLast();
		if(s.size()>dq.size())
		{
			int temp=s.pop();
			dq.addFirst(temp);
		}
	}
	int getmiddle()
	{
		return dq.getFirst();
	}
}

public class stack7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 mystack s = new mystack();
	        s.add(2);
	        s.add(5);
	 
	        System.out.println("Middle element:"
	                           + s.getmiddle());
	        s.add(3);
	        s.add(7);
	        s.add(4);
	        System.out.println("Middle element:"
	                           + s.getmiddle());
	        
	        s.pop();
	        s.pop();
	        System.out.println("Middle element:"
                    + s.getmiddle());

	}

}
