package binary_tree;
import java.util.*;
public class leaf_at_same_level {
public static boolean leaf(TreeNode root)
{
	Queue<TreeNode>q=new LinkedList<>();
	int result=Integer.MAX_VALUE;
	int level=0;
	q.add(root);
	while(!q.isEmpty())
	{
		int size=q.size();
		level++;
		while(size>0)
		{
			TreeNode curr=q.remove();
			if(curr.left!=null)
			{
				q.add(curr.left);
				if(curr.left.left==null && curr.left.right==null)
				{
					if(result==Integer.MAX_VALUE)
					{
						result=level;
					}
					else if(result!=level)
					{
						return false;
					}
				}
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
				if(curr.right.left==null && curr.right.right==null)
				{
					if(result==Integer.MAX_VALUE)
					{
						result=level;
					}
					else if(result!=level)
					{
						return false;
					}
				}
			}
			size--;
		}
	}
	return true;
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
        boolean abc=leaf(root);
        if(abc)
        {
        	System.out.println("leaves at same level");
        }
        else
        {
        	System.out.println("leaves at not same level");
        }
	}

}
