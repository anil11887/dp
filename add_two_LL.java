package linked_list;

public class add_two_LL {
	public static Node add(Node l1, Node l2)
	{
		Node dummy=new Node(-1);
		Node temp=dummy;
		int carry=0;
		while(l1!=null || l2!=null || carry==1)
		{
			int sum=0;
			if(l1!=null)
			{
				sum+=l1.data;
				l1=l1.next;
			}
			if(l2!=null)
			{
				sum+=l2.data;
				l2=l2.next;
			}
			sum+=carry;
			carry=sum/10;
			Node node=new Node(sum%10);
			temp.next=node;
			temp=temp.next;
		}
		return dummy.next;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head1=new Node(1);
		head1.next=new Node(3);
		head1.next.next=new Node(5);
		
		
		Node head2=new Node(2);
		head2.next=new Node(4);
		head2.next.next=new Node(6);
		head2.next.next.next=new Node(7);
		
		Node.printlist( head1);
		Node.printlist( head2);
		Node t1=add(head1,head2);
		Node.printlist(t1);

	}

}
