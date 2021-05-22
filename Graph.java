import java.util.*;

public class Graph
{
    ArrayList<ArrayList<Integer>> adjList=null;
    int V;
    Graph(List<Edges> edge,int N)
    {
        V=N;
        adjList=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<N;i++)
            adjList.add(new ArrayList<Integer>());
            
        for(Edges e: edge)
        {
            int x=e.s;
            int y=e.d;
            
            adjList.get(x).add(y);
        }
    }
}