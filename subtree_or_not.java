package binary_tree;

public class subtree_or_not {
	public static boolean subtree(TreeNode root1,TreeNode root2)
	{
		String fulltree=preorder(root1);
		String subtree=preorder(root2);
		return (fulltree.contains(subtree));
	}
	public static String preorder(TreeNode root)
	{
		if(root==null)
		{
			return "null";
		}
		StringBuilder sb=new StringBuilder("^");
		sb.append(root.val);
		sb.append(preorder(root.left));
		sb.append(preorder(root.right));
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(5);
        if(subtree(root,root1))
        {
        	System.out.println("yes second tree is a subtree");
        }
        else
        {
        	System.out.println("not a subtree");
        }
	}

}
