package linked_list;

public class deltewithouthead {
	public static Node insert(Node head,int val)
	{
		Node head1=new Node(val);
		if(head==null)
		{
			head=head1;
			return head ;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=head1;
		return head;
	}
	public static Node getNode(Node head,int num)
	{
		while(head.data!=num)
		{
			head=head.next;
		}
		return head;
	}
	public static void delete(Node t)
	{
		if(t==null)
			return ;
		t.data=t.next.data;
		t.next=t.next.next;
		
	}
	public static void main(String[] args) {
		
		Node head = null;
	    //inserting node
	    head=insert(head,1);
	    head=insert(head,4);
	    head=insert(head,2);
	    head=insert(head,3);
	    //printing given list
	    System.out.println("Given Linked List: ");
	    Node.printlist(head);
	    Node t = getNode(head,2);
	    //delete node
	    //sri krishna
	    delete(t);
	    //list after deletion operation
	    System.out.println("Linked List after deletion: ");
	    Node.printlist(head);
	}

}
