package stack;
import java.util.*;
public class non_repaeating {
	final static int a=26;
	public static void repeating(String s)
	{
		Queue<Character>q=new LinkedList<>();
		int count[]=new int[a];
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			q.add(ch);
			count[ch-'a']++;
			while(!q.isEmpty())
			{
				if(count[q.peek()-'a']>1)
				{
					q.remove();
				}
				else
				{
					System.out.print(" "+q.peek());
					break;
				}
			}
			if(q.isEmpty())
			{
				System.out.print(" "+-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 String str = "aabc"; 
	        repeating(str);
	}

}
