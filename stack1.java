package stack;
public class stack1 {
	int arr[];
	int size;
	int top1;
	int top2;
	public stack1(int n) {
		arr=new int[n];
		 top1=-1;
		 size=n;
		 top2=size;
		 
	}
	 void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x;
		}
		else
		{
			System.out.println("stack overflow");
		}
	}
	 void push2(int x)
		{
			if(top1<top2-1)
			{
				top2--;
				arr[top2]=x;
			}
			else
			{
				System.out.println("stack overflow");
			}
		}
	 int pop1()
	 {
		 if(top1>0) {
		 int x=arr[top1];
		 top1--;
		 return x;
		 }
		 else
		 {
			 System.out.println("stack is empty");
			 System.exit(-1);
		 }
		 return -1;
		 
	 }
	 int pop2()
	 {
		 if(top2<size) {
		 int x=arr[top2];
		 top2++;
		 return x;
		 }
		 else
		 {
			 System.out.println("stack is empty");
			 System.exit(-1);
		 }
		 return -1;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva;
		stack1 ts = new stack1(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from"
                           + " stack1 is " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from"
                           + " stack2 is " + ts.pop2()); 

	}

}

