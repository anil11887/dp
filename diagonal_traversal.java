package binary_tree;
import java.util.*;
public class diagonal_traversal {
	public static List<Integer> diagonal(TreeNode root)
	{
		ArrayList<Integer>al=new ArrayList<>();
		Queue<TreeNode>q=new LinkedList<>();
		if(root==null)
		{
			return al;
		}
		TreeNode temp=root;
		while(temp!=null)
		{
			al.add(temp.val);
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp=temp.right;
			}
			else
			{
				if(!q.isEmpty())
				{
					temp=q.peek();
					q.remove();
				}
				else
				{
					temp=null;
				}
			}
		}
		return al;
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
	        List<Integer>al=diagonal(root);
	        for(int i=0;i<al.size();i++)
	        {
	        	System.out.print(al.get(i)+",");
	        }
	}

}
