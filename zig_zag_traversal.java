package binary_tree;
import java.util.*;
public class zig_zag_traversal {
	public static List<Integer> zig(TreeNode root)
	{
		List<Integer>ans=new ArrayList<>();
		Queue<TreeNode>q=new LinkedList<>();
		TreeNode temp=root;
		boolean flag=true;
		q.add(temp);
		while(q.size()>0)
		{
			List<Integer>al2=new ArrayList<>();
			int n=q.size();
			for(int i=0;i<n;i++)
			{
				TreeNode curr=q.remove();
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				al2.add(curr.val);
			}
			if(flag)
			{
				//do nothing
			}
			else
			{
				Collections.reverse(al2);
			}
			for(int i=0;i<al2.size();i++)
			{
				ans.add(al2.get(i));
			}
			flag=!(flag);
		}
		return ans;
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
	        List<Integer>al=zig(root);
	        for(int i=0;i<al.size();i++)
	        {
	        	System.out.print(al.get(i)+",");
	        }
	}

}
