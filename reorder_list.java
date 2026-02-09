package linked_list;

public class reorder_list {
	public static Node Middle(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static Node reverse(Node head)
	{
		Node front=null;
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			front=curr.next;
			curr.next=prev;
			prev=curr;
			curr=front;
		}
		return prev;
	}
	public static void reorder(Node head)
	{
		Node mid=Middle(head);
		Node k=reverse(mid.next);
		mid.next=null;
		Node first=head;
		Node second=k;
		Node t1=null;
		Node t2=null;
		while(first!=null && second!=null)
		{
			t1=first.next;
			t2=second.next;
			first.next=second;
			second.next=t1;
			first=t1;
			second=t2;
		}
	}
	public static void main(String[] args)
	{
		//sri krishna;
		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		head1.next.next.next=new Node(4);
		head1.next.next.next.next=new Node(5);
		Node.printlist( head1);
		reorder(head1);
		Node.printlist(head1);
	}

}
