package binary_tree;
import java.util.*;
public class subtree {
	static String marker="$";
	public static String subhelp(TreeNode root,HashSet<String>hs)
	{
		
		String s="";
		if(root==null)
		{
			return s+marker;
		}
		String lstr=subhelp(root.left,hs);
		if(lstr.equals(s))
		{
			return s;
		}
		String rstr=subhelp(root.right,hs);
		if(rstr.equals(s))
		{
			return s;
		}
		s=s+root.val+"%"+lstr+"%"+rstr;
		hs.add(s);
		/*for(String s1:hs)
		{
			//System.out.println(","+s1);
		}*/
		if(s.length()>7 && hs.contains(s))
		{
			return "";
		}
		hs.add(s);
		return s;
	}
	public static String helper(TreeNode root)
	{
		HashSet<String>hs=new HashSet<>();
		 return subhelp(root,hs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva 
		TreeNode root = new TreeNode('A');
        root.left = new TreeNode('B');
        root.right = new TreeNode('C');
        root.left.left = new TreeNode('D');
        root.left.right = new TreeNode('E');
        root.right.right = new TreeNode('B');
        root.right.right.right = new TreeNode('E');
        root.right.right.left = new TreeNode('D');
        HashSet<String>s1=new HashSet<>();
        String str=helper(root);
        if(str.equals(""))
        {
        	System.out.println("yes");
        }
        
{
	
}
	}

}
