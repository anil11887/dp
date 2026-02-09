package linked_list;

import java.util.HashSet;

public class remove_dup_opt {
	public static void remove(Node head)
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			int val=curr.data;
			if(hs.contains(val))
			{
				prev.next=curr.next;
			}
			else
			{
				hs.add(val);
				prev=curr;
			}
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(2);
		Node.printlist(head);
		remove(head);
		Node.printlist(head);

	}

}
