package stack;
import java.util.*;
class pair{
	int first;
	int second;
	int third;
	public pair(int first, int second, int third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
}
public class distance_having_1 {
	public static int [][] dist(int arr[][])
	{
		int n=arr.length;
		int m=arr[0].length;
		int vis[][]=new int[n][m];
		int dis[][]=new int[n][m];
		Queue<pair>q=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==1)
				{
					q.add(new pair(i,j,0));
					vis[i][j]=1;
				}
				else
				{
					vis[i][j]=0;
				}
				
			}
		}
		int delrow[]= {-1,0,+1,0};
		int delcol[]= {0,+1,0,-1};
		while(!q.isEmpty())
		{
			int row=q.peek().first;
			int col=q.peek().second;
			int steps=q.peek().third;
			q.remove();
			dis[row][col]=steps;
			for(int i=0;i<4;i++)
			{
				int nrow=row+delrow[i];
				int ncol=col+delcol[i];
				if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0)
				{
					q.add(new pair(nrow,ncol,+1));
					vis[nrow][ncol]=1;
				}
			}
		}
		return dis;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub sri krishna, shiva
		 int[][] grid = {
		            {0,1,1,0},
		            {1,1,0,0},
		            {0,0,1,1}
		        };

		        
		        int[][] ans =dist(grid);
		        for(int i = 0; i < ans.length; i++){
		            for(int j = 0; j < ans[i].length; j++){
		                System.out.print(ans[i][j] + " "); 
		            }
		            System.out.println();
		        }
	}

}
