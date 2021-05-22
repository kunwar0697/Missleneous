import java.util.*;
class KahnTopSort
{
    int V;
    
    ArrayList<Integer> adj[];
    
    KahnTopSort(int v)
    {
        V=v;
        
        adj=new ArrayList[V];
        
        for(int i=0;i<V;i++)
        {
            adj[i]=new ArrayList<Integer>();
        }
    }
    
    public void addEdge(int s,int d)
    {
        adj[s].add(d);
    }
    
    
    public void topSort()
    {
        int indegree[]=new int[V];
        Arrays.fill(indegree,0);
        
        for(int i=0;i<V;i++)
        {
            ArrayList<Integer> temp=adj[i];
            
            for(int x:temp)
            {
                indegree[x]+=1;
            }
        }
        
        Queue<Integer> q=new LinkedList<Integer>();
        
        for(int i=0;i<V;i++)
            if(indegree[i]==0)
                q.add(i);
        
        int count=0;        
        ArrayList<Integer> ans = new ArrayList<Integer>();        
        while(!q.isEmpty())
        {
            
            int val=q.poll();
            ans.add(val);
            
            for(int i:adj[val])
            {
                indegree[i]-=1;
                
                if(indegree[i]==0)
                    q.add(i);
            }
            
            count++;
        }
        
        if(count!=V)
        {
            System.out.println("Cycle Detected");
            return;
        }    
    
        
        for(int i:ans)
            System.out.print(" "+i+" ");
    }
}