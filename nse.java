package stack;
import java.util.*;

public class nse {
	public static void nextsma(int arr[])
	{
		Stack<Integer>st=new Stack<>();
		int n=arr.length;
		int nse[]=new int [n];
		for(int i=n-1;i>=0;i--)
		{
			while(!st.isEmpty() && st.peek()>=arr[i])
			{
				st.pop();
			}
			nse[i]=st.isEmpty()?-1:st.peek();
			st.push(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(nse[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		int arr[]= {4,8,6,2,3,25};
		nextsma(arr);
	}

}
