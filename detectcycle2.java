package linked_list;

public class detectcycle2 {
	public static boolean detectcycle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		//sri krishna;
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=null;
		if(detectcycle(head)==true)
		{
			System.out.println("ll contains a cycle");
		}
		else
		{
			System.out.println("ll does not contains a cycle");
		}
		
	}

}
