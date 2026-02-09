package linked_list;

public class reverseddl_opt {
	public static dnode reverse(dnode head) {
		dnode prev=null;
		dnode curr=head;
		while(curr!=null)
		{
			prev=curr.back;
			curr.back=curr.next;
			curr.next=prev;
			curr=curr.back;
		}
		return prev.back;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna
		int arr[]= {20,12,5,4,2};
		dnode head=dnode.convert(arr);
		System.out.print("double linked list is");
		dnode.printlist(head);
		System.out.print("double linked list  after reversal:");
		head=reverse(head);
		dnode.printlist(head);

	}

}
