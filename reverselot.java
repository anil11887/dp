package binary_tree;
import java.util.*;
public class reverselot {
	public static List<Integer>reverse(TreeNode root)
	{
		List<Integer>al=new ArrayList<Integer>();
		Queue<TreeNode>q=new LinkedList<>();
		Stack<TreeNode>st=new Stack<>();
		if(root==null)
		{
			return al;
		}
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode node=q.poll();
			st.push(node);
			if(node.right!=null)
			{
				q.add(node.right);
			}
			if(node.left!=null)
			{
				q.add(node.left);
			}
		}
		while(!st.isEmpty())
		{
			al.add(st.pop().val);
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

       // reverselot solution = new reverselot();
        List<Integer> result = reverse(root);

        // Print the result
        for (int val : result) {
            System.out.print(val + " ");
	}

}
}
