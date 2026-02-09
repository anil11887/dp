package linked_list;

public class intersection_optimal {
	public static Node intersection(Node head1,Node head2)
	{
		Node t1=head1;
		Node t2=head2;
		while(t1!=t2)
		{
			t1=t1.next;
			t2=t2.next;
			if(t1==null)
			{
				t1=head2;
			}
			if(t2==null)
			{
				t2=head1;
			}
		}
		return t1;
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
		
		head1.next=third;
		
		Node.printlist(head);
		Node.printlist(head1);
		Node k1=intersection(head,head1);
		if(k1==null)
		{
			System.out.println("no intersection");
		}
		else
		{
			System.out.println("Intersection_Point_is:"+k1.data);
		}

	}

}
