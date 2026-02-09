package stack;
import java.util.*;
public class rottenoranges {
	public static int rotten(int arr[][])
	{
		int n=arr.length;
		int m=arr[0].length;
		Queue<int[]>q=new LinkedList<>();
		int fresh_count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==2)
				{
					q.add(new int[]{i,j});
				}
				if(arr[i][j]!=0)
				{
					fresh_count++;
				}
			}
		}
		if(fresh_count==0) return 0;
		int mincount=0,cnt=0;
		int dx[]= {-1,0,+1,0};
		int dy[]= {0,+1,0,-1};
		while(!q.isEmpty())
		{
			int size=q.size();
			cnt+=size;
			for(int i=0;i<size;i++)
			{
				int []point=q.remove();
				for(int j=0;j<4;j++)
				{
					int x=point[0]+dx[j];
					int y=point[1]+dy[j];
					if(x<0 || y<0 || x>n || y>m ||arr[x][y]==0 || arr[x][y]==2)
					{
						continue;
					}
					arr[x][y]=2;
				}
				
			}
			while(!q.isEmpty())
			{
				mincount++;
			}
		}
		return fresh_count==cnt?mincount:-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna,shiva
		int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = rotten(arr);
        System.out.println("Minimum Number of Minutes Required "+rotting);
	}

}
