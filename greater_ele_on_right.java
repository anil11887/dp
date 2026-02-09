package linked_list;

public class greater_ele_on_right {
	
	public static Node reverse(Node head)
	{
		Node curr=head;
		Node prev=null;
		Node front;
		while(curr!=null)
		{
			front=curr.next;
			curr.next=prev;
			prev=curr;
			curr=front;
			
		}
		return prev;
	}
	public static Node delete(Node head)
	{
		
		Node max=head;
		Node curr=head;
		Node temp;
		Node dummy=head;
		while(curr!=null && curr.next!=null)
		{
			if(curr.next.data<max.data)
			{
				temp=curr.next;
				curr.next=temp.next;
				temp=null;
			}
			else
			{
				curr=curr.next;
				max=curr;
			}
		}
		return dummy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(12);
		head.next=new Node(15);
		head.next.next=new Node(10);
		head.next.next.next=new Node(11);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);
		head.next.next.next.next.next.next=new Node(2);
		head.next.next.next.next.next.next.next=new Node(3);
		
		Node.printlist(head);
		Node k1=reverse(head);
		Node.printlist(k1);
		Node k2=delete(k1);
		Node k3=reverse(k2);
		Node.printlist(k3);
	}

}
