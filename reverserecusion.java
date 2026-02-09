package linked_list;

public class reverserecusion {
	public static Node reverse1(Node head)
	{
		if(head==null ||head.next==null)
		return head;
		Node newhead=reverse1(head.next);
		Node front=head.next;
		front.next=head;
		head.next=null;
		return newhead;
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
	
	
//sri krishna;
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		printlist(head);
		head=reverse1(head);
		printlist(head);
	}

}
