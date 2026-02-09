package stack;
import java.util.*;
public class stack2 {
	public static int evaluate(String exp)
	{
		Stack<Integer>st=new Stack<>();
		int n=exp.length();
		for(int i=0;i<n;i++)
		{
			char c=exp.charAt(i);
			if(Character.isDigit(c))
			{
				st.push(c-'0');
			}
			else
			{
				int val1=st.pop();
				int val2=st.pop();
				switch(c) {
				case '+':
					st.push(val1+val2);
					break;
				case '-':
					st.push(val2-val1);
					break;
				case '/':
					st.push(val2/val1);
					break;
				case '*':
					st.push(val1*val2);
					break;
				}
			}
		}
		return st.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 String exp = "231*+9-";
	       
	        // Function call
	        System.out.println("postfix evaluation: "
	                           + evaluate(exp));

	}

}
