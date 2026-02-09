package linked_list;

public class Node {
	
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
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
	}


