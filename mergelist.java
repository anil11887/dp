package linked_list;

import java.util.ArrayList;
import java.util.*;

public class mergelist {
	public static Node mergeList(Node head1,Node head2)
	{
		ArrayList<Integer>al=new ArrayList<>();
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null)
		{
			al.add(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null)
		{
			al.add(temp2.data);
			temp2=temp2.next;
		}
		Collections.sort(al);
		Node head=converter(al);
		return head;
	}
	public static Node converter(ArrayList<Integer>al)
	{
		Node dummy=new Node(-1);
		Node temp=dummy;
		for(int i=0;i<al.size();i++)
		{
			temp.next=new Node(al.get(i));
			temp=temp.next;
		}
		return dummy.next;
	}
	public static void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//sri krishna;
		Node head1=new Node(1);
		head1.next=new Node(3);
		head1.next.next=new Node(5);
		head1.next.next.next=null;
		
		Node head2=new Node(2);
		head2.next=new Node(4);
		head2.next.next=new Node(6);
		head2.next.next.next=new Node(7);
		head2.next.next.next.next=null;
		printlist( head1);
		printlist( head2);
		Node head=mergeList(head1,head2);
		printlist( head);
	}

}
