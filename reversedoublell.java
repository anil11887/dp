package linked_list;
import java.util.*;
public class reversedoublell {
	public static dnode reverse(dnode head)
	{
		Stack<Integer>st=new Stack<>();
		dnode temp=head;
		while(temp!=null)
		{
			st.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
			temp.data=st.pop();
			temp=temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna;
		int arr[]= {20,12,5,4,2};
		dnode head=dnode.convert(arr);
		System.out.print("double linked list is");
		dnode.printlist(head);
		System.out.print("double linked list  after reversal:");
		head=reverse(head);
		dnode.printlist(head);

	}

}
