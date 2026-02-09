package binary_tree;
import java.util.*;
public class balanced_tree {
public static boolean balanced(TreeNode root)
{
	return height(root)!=-1;
}
public static int height(TreeNode root)
{
	if(root==null)
	{
		return 0;
	}
	int lh=height(root.left);
	if(lh==-1)
	{
		return -1;
	}
	int rh=height(root.right);
	if(rh==-1) return -1;
	if(Math.abs(lh-rh)>1)
	{
		return -1;
	}
	return Math.max(lh, rh)+1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva 
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        boolean a=balanced(root);
        if(a)
        {
        	System.out.println("balanced_tree");
        }
        else
        {
        	System.out.println("not_balanced_tree");
        }
	}

}
