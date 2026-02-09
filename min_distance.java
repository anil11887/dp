package binary_tree;

public class min_distance {
	public static int find_level(TreeNode root,TreeNode a,int level)
	{
		if(root==null)
		{
			return -1;
		}
		if(root==a)
		{
			return level;
		}
		int left=find_level(root.left,a,level+1);
		if(left==-1)
		{
			return find_level(root.right,a,level+1);
		}
		return left;
	}
	public static int solve(TreeNode root,TreeNode p,TreeNode q)
	{
		TreeNode LA=lca.lowest(root,p,q);
		int dist1=find_level(LA,p,0);
		int dist2=find_level(LA,q,0);
		return dist1+dist2;
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
        int a1=solve(root,root.left.left, root.right.right.left);
        System.out.println(a1+" ");
	}

}
