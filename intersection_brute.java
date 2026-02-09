package linked_list;


import java.util.HashMap;


public class intersection_brute {
	public static Node intersection(Node head1,Node head2)
	{
		
		HashMap<Node,Integer>hm=new HashMap<>();
		while(head1!=null)
		{
			hm.put(head1,1);
			head1=head1.next;
		}
		
		while(head2!=null)
		{
			if(hm.containsKey(head2))
			{
				return head2;
			}
			head2=head2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=null;
		Node head1=new Node(6);
		Node second1=new Node(7);
		Node third1=new Node(8);
		head1.next=second1;
		second1.next=third1;
		third1.next=fourth;
		Node.printlist(head);
		Node.printlist(head1);
		Node k1=intersection(head,head1);
		if(k1==null)
		{
			System.out.println("no intersection");
		}
		else
		{
			System.out.println("Intersection_Point_is"+k1.data);
		}
	}

}
