package binary_tree;
import java.util.*;
public class right_view {
public static List<Integer> sol(TreeNode root)
{
	ArrayList<Integer>al=new ArrayList<>();
	right(root,al,0);
	return al;
}
public static void right(TreeNode root,ArrayList<Integer>al,int depth)
{
	if(root==null)
	{
		return ;
	}
	if(depth==al.size())
	{
		al.add(root.val);
	}
	right(root.left,al,depth+1);
	right(root.right,al,depth+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer>al=sol(root);
        for(int it:al)
        {
        	System.out.print(" "+it);
        }
	}

}
