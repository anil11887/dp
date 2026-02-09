package binary_tree;

public class invert_tree {
	public static TreeNode invert(TreeNode root)
	{
		if(root==null)
		{
			return root;
		}
		TreeNode left=invert(root.left);
		TreeNode right=invert(root.right);
		root.left=right;
		root.right=left;
		return root;
		
	}
	public static void print(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		print(root.left);
		System.out.print(root.val);
		print(root.right);
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
        print(root);
        invert(root);
        System.out.println();
        print(root);
	}

}
