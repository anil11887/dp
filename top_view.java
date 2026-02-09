package binary_tree;
import java.util.*;
class pair
{
	TreeNode node;
	int line;
	public pair(TreeNode node, int line) {
		super();
		this.node = node;
		this.line = line;
	}
}
public class top_view {
	
	public static void top(TreeNode root)
	{
		Queue<pair>q=new LinkedList<>();
		Map<Integer,TreeNode>hm=new TreeMap<>();
		if(root==null)
		{
			return;
		}
		q.add(new pair(root,0));
		while(!q.isEmpty())
		{
			pair tmpnode=q.remove();
			if(!hm.containsValue(tmpnode.line))
			{
				hm.put(tmpnode.line,tmpnode.node);
			}
			if(tmpnode.node.left!=null)
			{
				q.add(new pair(tmpnode.node.left,tmpnode.line-1));
			}
			if(tmpnode.node.right!=null)
			{
				q.add(new pair(tmpnode.node.right,tmpnode.line+1));
			}
		}
		for(Map.Entry<Integer,TreeNode>entry:hm.entrySet())
		{
			System.out.print(entry.getValue().val+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva 
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        top(root);
	}

}
