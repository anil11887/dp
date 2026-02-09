package linked_list;

public class sort_of_0s1sand2s {
	
	public static void sort(Node head)
	{
		Node ptr=head;
		int count[]= {0,0,0};
		while(ptr!=null)
		{
			count[ptr.data]++;
			ptr=ptr.next;
		}
		int i=0;
		ptr=head;
		while(ptr!=null)
		{
			if(count[i]==0)
			{
				i++;
			}
			ptr.data=i;
			--count[i];
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(2);
		head.next.next.next=new Node(0);
		Node.printlist(head);
		sort(head);
		Node.printlist(head);
	}

}
