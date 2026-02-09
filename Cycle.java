package linked_list;

import java.util.HashMap;

public class Cycle {
	public static boolean detectcycle(Node head)
	{
		Node temp=head;
		HashMap<Node,Integer>hm=new HashMap<>();
		while(temp!=null)
		{
			if(hm.containsKey(temp))
			{
				return true;
			}
			hm.put(temp, 1);
			temp=temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		if(detectcycle(head)==true)
		{
			System.out.println("ll contains a cycle");
		}
		else
		{
			System.out.println("ll does not contains a cycle");
		}
	}

}
