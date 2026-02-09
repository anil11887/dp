package linked_list;
import java.util.*;

class NodeComparator implements Comparator<Node>{
	public int compare(Node k1,Node k2)
	{
		if(k1.data>k2.data)
			return 1;
		else if(k1.data<k2.data)
			return -1;
		return 0;
	}
}
public class merge_k_sorted_lists {
	public static Node merge(Node arr[],int k)
	{
		PriorityQueue<Node>pq=new PriorityQueue<Node>(new NodeComparator());
		//Node at[]=new Node[k];
		Node head=new Node(0);
		Node last=head;
		for(int i=0;i<k;i++)
		{
			if(arr[i]!=null)
			{
				pq.add(arr[i]);
			}
		}
		if(pq.isEmpty())
		{
			return null;
		}
		while(!pq.isEmpty())
		{
			Node curr=pq.poll();
			last.next=curr;
			last=last.next;
			if(curr.next!=null)
			{
				pq.add(curr.next);
			}
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna
		int N = 3;
	       
        // array to store head of linkedlist
        Node[] a = new Node[N];
       
        // Linkedlist1
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
          head1.next.next.next = new Node(7);
       
        // Limkedlist2
        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
          head2.next.next = new Node(6);
          head2.next.next.next = new Node(8);
       
        // Linkedlist3
        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
          head3.next.next = new Node(10);
          head3.next.next.next = new Node(11);
          Node k1=merge(a,N);
          Node.printlist(k1);

	}

}
