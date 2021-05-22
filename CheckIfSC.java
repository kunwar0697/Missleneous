import java.util.*;

class CheckIfSC
{
    void DFS(int src,Graph g,boolean visited[])
    {
        visited[src]=true;
        
        for(int dest:g.adjList.get(src))
        {
            if(!visited[dest])
                DFS(dest,g,visited);
        }
    }
    
    
    boolean isSC(Graph g, int N)
    {
        boolean visited[] = new boolean[N];
        
        Arrays.fill(visited,false);
        
        DFS(0,g,visited);
        
        for(boolean b: visited)
        { 
            System.out.print(b+" ");
            if(!b)
                return false;
        }
        
        System.out.println();
        Arrays.fill(visited,false);
        
        Graph reverseg=reverseGraph(g,N);
        
        DFS(0,reverseg,visited);
        
        for(boolean b:visited)
        {
            System.out.print(b+" ");
            if(!b)
                return false;
        }
        
        return true;
    }
    
    Graph reverseGraph(Graph g,int N)
    {
        List<Edges> l=new ArrayList<Edges>();
        
        for(int i=0;i<N;i++)
        {
            for(int j:g.adjList.get(i))
            {   
                l.add(new Edges(j,i));
            }
        }
        
        Graph rev=new Graph(l,N);
        printGraph(rev,5);
        return rev;
        
    }
    void printGraph(Graph g,int N)
    {
        System.out.println("-- Graph --");
        for(int i=0;i<N;i++)
            {   
                System.out.print(i);
                for(int v:g.adjList.get(i))
                {   
                    System.out.print("--> "+v+" ");
                }
                System.out.println();
            }
    }
    public static void Main()
    {   
        List<Edges> l=new ArrayList<Edges>();
        
        l.add(new Edges(0,1));
        l.add(new Edges(1,2));
        l.add(new Edges(2,3));
        l.add(new Edges(2,4));
        l.add(new Edges(3,0));
        l.add(new Edges(4,2));
        
        Graph g=new Graph(l,5);
        
        CheckIfSC c1=new CheckIfSC();
        
        c1.printGraph(g,5);
        if(c1.isSC(g,5))
            System.out.println("SC");
        else
            System.out.println("NOT SC");
            
        List<Edges> l2=new ArrayList<Edges>();
        
        l2.add(new Edges(0,1));
        l2.add(new Edges(1,2));
        l2.add(new Edges(2,3));
        l2.add(new Edges(2,4));
        l2.add(new Edges(3,0));
        //l.add(new Edges(4,2));
        
        Graph g2=new Graph(l2,5);
        c1.printGraph(g2,5);
        //CheckIfSC c2=new CheckIfSC();
        if(c1.isSC(g2,5))
            System.out.println("SC");
        else
            System.out.println("NOT SC");    
    }
    
    
}