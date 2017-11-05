import java.util.*;

public class island
{
	final int ROW = 5,COL = 5;
	
	boolean issafe(int[][] m,int i,int j,boolean[][] visited)
	{
		return (i>=0 && j>=0 && i<ROW && j<COL && (!visited[i][j]) && m[i][j]==1);
	}

	void DFS(int[][] m,int i,int j,boolean[][] visited)
	{
	int r[]=new int[]{-1,-1,-1,0,0,1,1,1};
	int c[]=new int[]{-1,0,1,-1,1,-1,0,1};
		
	visited[i][j]=true;

		for(int k=0;k<8;k++)
		{
			if(issafe(m,i+r[k],j+c[k],visited))
			DFS(m,i+r[k],j+c[k],visited);
		}
	
	}

	int countIsland(int[][] m)
	{
	boolean[][] visited = new boolean[ROW][COL];
	int count=0;
	
	for(int i=0;i<ROW;i++)
	{
		for(int j=0;j<COL;j++)
		{
			if(m[i][j]==1 && !visited[i][j])
			{
			DFS(m,i,j,visited);
			count++;
			}
		}
	}
		return count;
	}

	public static void main(String args[]) throws java.lang.Exception
	{
		int[][] arr = new int[][] {{1,1,0,0,0},{0,1,0,0,1},{1,0,0,1,1},{0,0,0,0,0},{1,0,1,0,1}};
		island I = new island();
		System.out.println(I.countIsland(arr));

	}
}
