package binary_tree;
import java.util.*;
public class invert_itrative {
	public static TreeNode invert_it(TreeNode root)
	{
		if(root == null)
		{
			return root;
		}
		Queue<TreeNode>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode curr=q.peek();
			q.remove();
			TreeNode temp=curr.left;
			curr.left=curr.right;
			curr.right=temp;
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //root.left.right.right = new TreeNode(6);
        //root.left.right.right.right = new TreeNode(7);
        invert_tree.print(root);
        invert_it(root);
        System.out.println();
        invert_tree.print(root);
	}

}
