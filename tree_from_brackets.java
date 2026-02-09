package binary_tree;
//import java.util.*;
public class tree_from_brackets {
	static int start=0;
	public static TreeNode tree(String s)
	{
		if(s== null || s.length()==0)
		{
			return null;
		}
		if(start>s.length())
		{
			return null;
		}
		boolean neg=false;
		if(s.charAt(start)=='-')
		{
			neg=true;
			start++;
		}
		int num=0;
		while(start<s.length() && Character.isDigit(s.charAt(start)))
		{
			int digit=Character.getNumericValue(s.charAt(start));
			num=num*10+digit;
			start++;
		}
		if(neg)
			num=-(num);
		TreeNode node=new TreeNode(num);
		if(start>=s.length())
		{
			return node;
		}
		if(start<s.length() && s.charAt(start)=='(')
		{
			start++;
			node.left=tree(s);
		}
		if(start<s.length() && s.charAt(start)==')')
		{
			start++;
			return node;
		}
		if(start<s.length() && s.charAt(start)=='(')
		{
			start++;
			node.right=tree(s);
		}
		if(start<s.length() && s.charAt(start)==')')
		{
			start++;
			return node;
		}
		return node;
	}
	static void print(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.print(" "+root.val);
		print(root.left);
		print(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		  // Input
	    String s = "4(2(3)(1))(6(5))";
	   
	    // Call the function construct tree
	    // to create the tree pass the string;
	    TreeNode root = tree(s);
	   
	    // Function to print preorder of the tree
	    print(root);
	}

}
