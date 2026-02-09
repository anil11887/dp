package binary_tree;
import java.util.*;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		super();
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
}
public class in_pre {
	public TreeNode BuildTree(Vector<Integer>inorder,Vector<Integer>preorder)
	{
		HashMap<Integer,Integer>inmap=new HashMap<>();
		for(int i=0;i<inorder.size();i++)
		{
			inmap.put(inorder.get(i), i);
		}
		TreeNode root=BuildTree(preorder,0,preorder.size()-1,inorder,0,inorder.size()-1,inmap);
		return root;
	}
	private TreeNode BuildTree(Vector<Integer>preorder,int prestart,int preend,
			Vector<Integer>inorder,int instart,int inend,HashMap<Integer,Integer>inmap)
	{
		if(prestart>preend || instart>inend)
		{
			return null;
		}
		TreeNode root=new TreeNode(preorder.get(prestart));
		int inroot=inmap.get(root.val);
		int numsleft=inroot-instart;
		root.left=BuildTree(preorder,prestart+1,prestart+numsleft,
				inorder,instart,
				inroot-1,inmap);
		root.right=BuildTree(preorder,prestart+numsleft+1,preend,
				inorder,inroot+1,inend,inmap);
		return root;
	}
	private void printinorder(TreeNode root)
	{
		if(root!=null) {
		printinorder(root.left);
		System.out.print(root.val+" ");
		printinorder(root.right);
		}
	}
	private void printvector(Vector<Integer>vec)
	{
		for(int i=0;i<vec.size();i++)
		{
			System.out.print(vec.get(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		Vector<Integer> inorder = new Vector<>(java.util.Arrays.asList(9, 3, 15, 20, 7));
        Vector<Integer> preorder = new Vector<>(java.util.Arrays.asList(3, 9, 20, 15, 7));

        System.out.print("Inorder Vector: ");
       new in_pre().printvector(inorder);

        System.out.print("Preorder Vector: ");
        new in_pre().printvector(preorder);

        in_pre sol=new in_pre();
        TreeNode root = sol.BuildTree(inorder, preorder);

        System.out.println("Inorder of Unique Binary Tree Created:");
        sol.printinorder(root);
        System.out.println();
	}

}
