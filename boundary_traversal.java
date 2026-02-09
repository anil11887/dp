package binary_tree;

import java.util.List;
import java.util.*;
public class boundary_traversal {
public static boolean isleaf(TreeNode root)
{
	if(root.left==null && root.right==null)
	{
		return true;
	}
	return false;
}
public static void leftbound(TreeNode root,List<Integer>res)
{
	TreeNode curr=root.left;
	while(curr!=null)
	{
		if(!isleaf(curr))
		{
			res.add(curr.val);
		}
		if(curr.left!=null)
		{
			curr=curr.left;
		}
		else
		{
			curr=curr.right;
		}
	}
}
public static void rightbound(TreeNode root,List<Integer>res)
{
	TreeNode curr=root.right;
	List<Integer>temp=new ArrayList<>();
	while(curr!=null)
	{
		if(!isleaf(curr))
		{
			temp.add(curr.val);
		}
		if(curr.right!=null)
		{
			curr=curr.right;
		}
		else
		{
			curr=curr.left;
		}
	}
	for(int i=temp.size()-1;i>=0;i--)
	{
		res.add(temp.get(i));
	}
}
public static void addleaf(TreeNode root,List<Integer>res)
{
	if(isleaf(root))
	{
		res.add(root.val);
		return;
	}
	if(root.left!=null)
	{
		addleaf(root.left,res);
	}
	if(root.right!=null)
	{
		addleaf(root.right,res);
	}
}
public static List<Integer> printbound(TreeNode root)
{
	List<Integer>res=new ArrayList<>();
	if(!isleaf(root))
	{
		res.add(root.val);
	}
	leftbound(root,res);
	addleaf(root,res);
	rightbound(root,res);
	return res;
}
public static void print(List<Integer>res)
{
	for(int val:res)
	{
		System.out.print(val+",");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(7);
	        List<Integer>al=printbound(root);
	        print(al);
	}

}
