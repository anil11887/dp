package binary_tree;
class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
public class depth {
	public static int maxdepth(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int lefth=maxdepth(root.left);
		int righth=maxdepth(root.right);
		return Math.max(lefth, righth)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        int depth=maxdepth(root);
        System.out.println(" "+depth);
	}

}
