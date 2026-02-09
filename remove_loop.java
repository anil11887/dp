package linked_list;

public class remove_loop {
	public static Node loop(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return slow;
			}
		}
		return null;
	}
	public static Node remove(Node head)
	{
		Node temp=head;
		Node meet=loop(temp);
		while(temp!=null)
		{
			if(temp==meet)
			{
				meet.next=null;
				break;
			}
			else
			{
				temp=temp.next;
				meet=meet.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		Node k1=remove(head);
		Node.printlist(k1);
	}

}
