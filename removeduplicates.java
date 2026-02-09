package linked_list;

public class removeduplicates {
	public static void remove(Node head)
	{
		Node ptr1=head;
		Node ptr2=null;
		
		while(ptr1!=null && ptr1.next!=null)
		{
			ptr2=ptr1;
			while(ptr2.next!=null)
			{
				if(ptr1.data==ptr2.next.data)
				{
					ptr2=ptr2.next.next;
				}
				else
				{
					ptr2=ptr2.next;
				}
			}
			ptr1=ptr1.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna
		Node head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(2);
		Node.printlist(head);
		remove(head);
		Node.printlist(head);

	}

}
