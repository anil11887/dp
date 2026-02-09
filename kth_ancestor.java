package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class kth_ancestor {
	public static int kthanc(TreeNode root,int size,int k,int node)
	{
		int ancestors[]=new int[size+1];
		generate(root,ancestors);
		int count=0;
		while(node!=-1)
		{
			node=ancestors[node];
			count++;
			if(count==k)
			{
				break;
			}
		}
		return node;
	}
public static void generate(TreeNode root,int []ancestors)
{
	ancestors[root.val]=-1;
	Queue<TreeNode>q=new LinkedList<>();
	q.add(root);
	while(!q.isEmpty())
	{
		TreeNode temp=q.peek();
		q.remove();
		if(temp.left!=null)
		{
			ancestors[temp.left.val]=temp.val;
			q.add(temp.left);
		}
		if(temp.right!=null)
		{
			ancestors[temp.right.val]=temp.val;
			q.add(temp.right);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva 
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		int size=5;
		int k=2;
		int node=root.left.right.val;
		System.out.println(" "+kthanc(root,size,k,node));
	}

}
