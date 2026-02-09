package stack;
import java.util.*;
public class stack15 {
	public static void celebrity(int arr[][],int n)
	{
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<n;i++)
		{
			st.push(i);
		}
		while(st.size()>=2)
		{
			int i=st.pop();
			int j=st.pop();
			if(arr[i][j]==1)
			{
				st.push(j);
			}
			else
			{
				st.push(i);
			}
		}
		int pot=st.pop();
		for(int i=0;i<n;i++)
		{
			if(i!=pot)
			{
				if(arr[i][pot]==0 || arr[pot][i]==1)
				{
					System.out.println("none");
					return;
				}
			}
		}
		System.out.println("celebrity is:=>"+pot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		int arr[][] = { { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };
		int n=3;
		celebrity(arr,n);

	}

}
