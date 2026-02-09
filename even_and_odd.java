package linked_list;

public class even_and_odd {
	public static Node segerate(Node head)
	{
		Node curr=head;
		Node evenstart=null;
		Node evenend=null;
		Node oddstart=null;
		Node oddend=null;
		while(curr!=null)
		{
			int ele=curr.data;
			if(ele%2==0)
			{
				if(evenstart==null)
				{
					evenstart=curr;
					evenend=evenstart;
				}
				else
				{
					evenend.next=curr;
					evenend=evenend.next;
				}
			}
			else
			{
				if(oddstart==null)
				{
					oddstart=curr;
					oddend=oddstart;
				}
				else
				{
					oddend.next=curr;
					oddend=oddend.next;
				}
			}
			curr=curr.next;
		}
		evenend.next=oddstart;
		oddend.next=null;
		head=evenstart;
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);
		head.next.next.next.next.next.next=new Node(7);
		head.next.next.next.next.next.next.next=null;
		
		Node.printlist(head);
		Node k1=segerate(head);
		Node.printlist(k1);

	}

}
