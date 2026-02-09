package binary_tree;

public class lca {
public static TreeNode lowest(TreeNode root, TreeNode p,TreeNode q)
{
	if(root==null||root==p||root==q)
	{
		return root;
	}
	TreeNode left=lowest(root.left,p,q);
	TreeNode right=lowest(root.right,p,q);
	if(left==null)
	{
		return right;
	}
	else if(right==null)
	{
		return left;
	}
	else
	{
		return root;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva 
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(8);
        TreeNode a1=lowest(root,root.left.left,root.left.right);
        System.out.println(a1.val);
	}

}
