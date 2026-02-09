package stack;
class pair1
{
	int first;
	int second;
	public pair1(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
}
public class circular_tour {
	public static int circular(pair1 arr[],int n) {
		int start=0;
		int extra=0;
		int req_fuel=0;
		for(int i=0;i<n;i++)
		{
			extra+=arr[i].first-arr[i].second;
			if(extra<0)
			{
				start=i+1;
				req_fuel+=extra;
				extra=0;
			}
		}
		if(extra+req_fuel>=0)
		{
			return start;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna shiva
		pair1[] arr = {new pair1(6, 4), 
                new pair1(3, 6), 
                new pair1(7, 3)}; 

		int start = circular(arr, arr.length);
		System.out.println(" "+start);
	}

}
