package binary_tree;

public class sum_tree {
public static int sumtree(TreeNode root)
{
	if(root==null)
	{
		return 0;
	}
	int old_val=root.val;
	root.val=sumtree(root.left)+sumtree(root.right);
	return root.val+old_val;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int sum=sumtree(root);
        System.out.print("sumTree is:)"+sum);
	}

}
