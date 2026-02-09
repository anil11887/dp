package binary_tree;
import java.util.*;
public class min_swaps {
	public static int min_s(List<Integer>al)
	{
		List<Integer>al2=new ArrayList<>(al);
		Collections.sort(al2);
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<al2.size();i++)
		{
			hm.put(al2.get(i), i);
		}
		/*for(Map.Entry<Integer, Integer>mp:hm.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}*/
		 int[] perm = new int[al.size()];
	        for (int i = 0; i < al.size(); i++) {
	            perm[i] = hm.get(al.get(i));
	        }
	      /*for(int i=0;i<perm.length;i++)
	      {
	    	  System.out.print(","+perm[i]);
	      }*/
	      boolean visited[]=new boolean[perm.length];
	      int swaps=0;
	      for(int i=0;i<perm.length;i++)
	      {
	    	  if(!visited[i])
	    	  {
	    		  int cyclesize=0;
	    		  int x=i;
	    		  while(!visited[x])
	    		  {
	    			  visited[x]=true;
	    			  x=perm[x];
	    			  cyclesize++;
	    		  }
	    		  if(cyclesize>1)
	    		  {
	    			  swaps+=(cyclesize-1);
	    		  }
	    	  }
	      }
	     return swaps; 
	}
	public static void Inorder(TreeNode root,List<Integer>al)
	{
		if(root==null)
		{
			return ;
		}
		Inorder(root.left,al);
		al.add(root.val);
		Inorder(root.right,al);
	}
	public static List<Integer> helper(TreeNode root)
	{
		List<Integer>al=new ArrayList<>();
		Inorder(root,al);
		return al;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna, shiva
		TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(11);
        
        List<Integer>al=helper(root);
       int s= min_s(al);
       System.out.println(" "+s);
	}

}
