import java.util.*;
import java.lang.*;
import java.io.*;

public class dijsktra
{
	
	static final int V=3;
	int minDist(int dist[],Boolean sptset[])
	{
		int min = Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<V;v++)
		{
			if(sptset[v]==false && dist[v]<=min)
			{
			min=dist[v];
			min_index=v;
			}
		}
	return min_index;
	}

	void printt(int dist[],int n)
	{
		System.out.print("Vertex Distance from Source");
		for(int i=0;i<V;i++)
		System.out.println(i+" "+dist[i]);
	}
	
	void dijsktra(int graph[][],int src)
	{
		int dist[]=new int[V];
		Boolean sptset[]=new Boolean[V];

		for(int i=0;i<V;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			sptset[i]=false;
		}
		dist[src]=0;
		for(int c=0;c<V-1;c++)
		{
			int u=minDist(dist,sptset);
			sptset[u]=true;
			
			for(int v=0;v<V;v++)
			{
				if(!sptset[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v])
		dist[v]=dist[u]+graph[u][v];
			}
		}
	printt(dist,V);
	}
	public static void main(String args[])
	{
		int graph[][]=new int[][]{{0,4,8},{4,0,2},{8,2,0}};
		dijsktra d= new dijsktra();
		d.dijsktra(graph,0);
		
	}
}
