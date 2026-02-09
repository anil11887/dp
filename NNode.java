package linked_list;

public class NNode {
	int data;
	NNode next;
	NNode random;
	
	NNode()
	{
		this.data=0;
		this.next=null;
		this.random=null;
		
	}
	NNode(int x)
	{
		this.data=x;
		this.next=null;
		this.random=null;
	}
	public NNode(int data, NNode next, NNode random) {
		super();
		this.data = data;
		this.next = next;
		this.random = random;
	}
	public static void print(NNode head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }
}
