import java.util.*;

public class bfs
{
	private int V;
	private LinkedList<Integer>[] adj;
	
	bfs(int ver)
	{
	V=ver;
	adj= new LinkedList[ver];
		for(int i=0;i<ver;i++)
		adj[i]= new LinkedList();
	}	
	
	void BFS(int s)
	{
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
//		if(visited[s]==true)
//		System.out.print("cycle");
		
		visited[s]=true;
		queue.add(s);

		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(!visited[n])
				{
				visited[n]=true;
				queue.add(n);
				}
			} 
			
		}
	
	}

	void adding(int source,int des)
	{
		adj[source].add(des);
	}
	public static void main(String args[])
	{
		bfs g = new bfs(6);
		g.adding(5,3);
		g.adding(5,4);
		g.adding(4,2);
		g.adding(3,2);
		g.adding(2,3);
		g.adding(3,3);
		g.BFS(5);	
	}
}
