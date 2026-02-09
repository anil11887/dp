package binary_tree;
import java.util.*;
class solution
{
	int dia=0;
	 int height(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int lt=height(root.left);
		int rt=height(root.right);
		dia=Math.max(dia,lt+rt);
		return Math.max(lt, rt)+1;
	}
	 int diam(TreeNode root)
	 {
		 height(root);
		 return dia;
	 }
}
public class diameter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.left.right.right = new TreeNode(6);
	        root.left.right.right.right = new TreeNode(7);

	        // Creating an instance of the Solution class
	        solution sol = new solution();
	        int diameter=sol.diam(root);
	        System.out.println("diameter:"+diameter);
	}

}
