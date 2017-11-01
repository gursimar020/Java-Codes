import java.util.*;

public class dfsGraph
{
	private int v;
	private LinkedList<Integer> adj[];
	
	dfsGraph(int ver)
	{
		v=ver;
		adj= new LinkedList(ver);
		for(int i=0;i<ver;i++)
		adj[i]=new LinkedList();
	}

	void addEdge(int source,int des)
	{
		adj[source].add[des];
	}

	public static void main(String args[])
	{
		dfsGraph g= new dfsGraph(5);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,4);
		g.addEdge(1,6);
		g.addEdge(2,8);
		System.out.println("print in dfs");
		
		g.DFS(1);
	}
}
