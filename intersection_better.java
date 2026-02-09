package linked_list;

public class intersection_better {
	public static Node intersection(Node head1,Node head2)
	{
		Node temp=head1;
		int count1=0;
		Node fast=head1;
		Node slow=head2;
		while(temp!=null)
		{
			count1++;
			temp=temp.next;
		}
		Node temp2=head2;
		int count2=0;
		while(temp2!=null)
		{
			count2++;
			temp2=temp2.next;
		}
		int diff=Math.abs(count1-count2);
		if(count1>count2)
		{
			for(int i=0;i<diff;i++)
			{
				fast=fast.next;
			}
		}
		else {
			for(int i=0;i<diff;i++)
			{
				slow=slow.next;
			}
		}
		while(slow!=null && fast!=null)
		{
			if(slow==fast)
			{
				return slow;
			}
			fast=fast.next;
			slow=slow.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
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
		Node head1=new Node(6);
		
		head1.next=third;
		
		Node.printlist(head);
		Node.printlist(head1);
		Node k1=intersection(head,head1);
		if(k1==null)
		{
			System.out.println("no intersection");
		}
		else
		{
			System.out.println("Intersection_Point_is:"+k1.data);
		}

	}

}
