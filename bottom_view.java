package binary_tree;
import java.util.*;
 class Node1
{
	int val;
	int hd;
	Node1 left, right;
	public Node1(int val)
	{
		this.val=val;
		hd=Integer.MAX_VALUE;
		left=null;
		right=null;
	}
}
public class bottom_view {
	public static void bottom(Node1 root)
	{
		Map<Integer,Integer>hm=new TreeMap<>();
		Queue<Node1>q=new LinkedList<>();
		if(root==null)
		{
			return ;
		}
		int hd=0;
		root.hd=hd;
		q.add(root);
		while(!q.isEmpty())
		{
			Node1 temp=q.remove();
			hd=temp.hd;
			hm.put(hd,temp.val);
			if(temp.left!=null)
			{
				temp.left.hd=hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.hd=hd+1;
				q.add(temp.right);
			}
		}
		for(Map.Entry<Integer, Integer>entry:hm.entrySet())
		{
			System.out.print(entry.getValue()+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		 Node1 root = new Node1(20);
	        root.left = new Node1(8);
	        root.right = new Node1(22);
	        root.left.left = new Node1(5);
	        root.left.right = new Node1(3);
	        root.right.left = new Node1(4);
	        root.right.right = new Node1(25);
	        root.left.right.left = new Node1(10);
	        root.left.right.right = new Node1(14);
	        bottom(root);
	}

}
