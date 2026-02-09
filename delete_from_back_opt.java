package linked_list;

public class delete_from_back_opt {
	public static Node delete(Node head,int n)
	{
		Node fast=head;
		Node slow=head;
		for(int i=0;i<n;i++)
		{
			fast=fast.next;
		}
		if(fast==null)
		{
			return head.next;
		}
		if(fast.next!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		
		slow.next=slow.next.next;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna
		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		head1.next.next.next=new Node(4);
		head1.next.next.next.next=new Node(5);
		Node.printlist( head1);
		int n=5;
		Node t1=delete(head1,n);
		Node.printlist(t1);

	}

}
