package linked_list;

public class delete_from_back {
	public static Node delete(Node head,int n)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int result=count-n;
		if(count==n)
		{
			Node head1=head.next;
			head=null;
			return head1;
		}
		temp=head;
		while(temp!=null)
		{
			result--;
			if(result==0)
			{
				break;
			}
			temp=temp.next;
		}
		
		temp.next=temp.next.next;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		head1.next.next.next=new Node(4);
		head1.next.next.next.next=new Node(5);
		Node.printlist( head1);
		int n=2;
		Node t1=delete(head1,n);
		Node.printlist(t1);

	}

}
