package linked_list;

public class merge_sort_for_ll {
	public static Node middle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node sortedmerge(Node a,Node b)
	{
		Node result=null;
		if(a==null)
		{
			return b;
		}
		if(b==null)
		{
			return a;
		}
		if(a.data<=b.data)
		{
			result=a;
			result.next=sortedmerge(a.next,b);
		}
		else
		{
			result=b;
			result.next=sortedmerge(a,b.next);
		}
		return result;
	}
	public static Node merge(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node mid=middle(head);
		Node middlenext=mid.next;
		mid.next=null;
		Node left=merge(head);
		Node right=merge(middlenext);
		Node sorted=sortedmerge(left,right);
		return sorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		Node head=new Node(7);
		head.next=new Node(6);
		head.next.next=new Node(5);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(3);
		head.next.next.next.next.next=new Node(2);
		head.next.next.next.next.next.next=new Node(1);
		head.next.next.next.next.next.next.next=null;
		
		Node.printlist(head);
		Node k1=merge(head);
		Node.printlist(k1);


	}

}
