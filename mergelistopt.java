package linked_list;

public class mergelistopt {
	
public static Node mergeList(Node list1, Node list2) 
{
	Node dummy=new Node(-1);
	Node temp=dummy;
	while(list1!=null && list2!=null)
	{
		if(list1.data<=list2.data)
		{
			temp.next=list1;
			list1=list1.next;
		}
		else
		{
			temp.next=list2;
			list2=list2.next;
		}
		temp=temp.next;
		
	}
	if(list1!=null)
	{
		temp.next=list1;
	}
	if(list2!=null)
	{
		temp.next=list2;
	}
	return dummy.next;
}
public static void printlist(Node head)
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		//sri krishna;
		Node head1=new Node(1);
		head1.next=new Node(3);
		head1.next.next=new Node(5);
		
		
		Node head2=new Node(2);
		head2.next=new Node(4);
		head2.next.next=new Node(6);
		head2.next.next.next=new Node(7);
		
		printlist( head1);
		printlist( head2);
		Node head=mergeList(head1,head2);
		printlist( head);

	}

}
