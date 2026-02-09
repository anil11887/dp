package linked_list;
import java.util.*;
public class clone {
	public static NNode cloned(NNode head)
	{
		NNode temp=head;
		HashMap<NNode,NNode>hm=new HashMap<>();
		while(temp!=null)
		{
			NNode newNode=new NNode(temp.data);
			hm.put(temp, newNode);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			NNode copynode=hm.get(temp);
			copynode.next=hm.get(temp.next);
			copynode.random=hm.get(temp.random);
			temp=temp.next;
		}
		return hm.get(head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		 NNode head = new NNode(7);
	        head.next = new NNode(14);
	        head.next.next = new NNode(21);
	        head.next.next.next = new NNode(28);

	        // Assigning random pointers
	        head.random = head.next.next;
	        head.next.random = head;
	        head.next.next.random = head.next.next.next;
	        head.next.next.next.random = head.next;

	        System.out.println("Original Linked List with Random Pointers:");
	        NNode.print(head);

	        // Clone the linked list
	        NNode clonedList = cloned(head);

	        System.out.println("\nCloned Linked List with Random Pointers:");
	        NNode.print(clonedList);


	}
	
}
