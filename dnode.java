
package linked_list;

public class dnode {
	int data;
	dnode next;
	dnode back;
	public dnode(int data, dnode next, dnode back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public dnode(int data)
	{
		this.data=data;
		this.next=null;
		this.back=null;
	}
	public static void printlist(dnode head)
	{
		dnode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static dnode convert(int arr[])
	{
		dnode head=new dnode(arr[0]);
		dnode prev=head;
		for(int i=1;i<arr.length;i++)
		{
			dnode temp=new dnode(arr[i],null,prev);
			prev.next=temp;
			prev=temp;
		}
		return head;
		
	}
}
