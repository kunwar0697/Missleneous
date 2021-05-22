import java.util.*;


public class DFS
{
    static class Graph
    {
        int V;
        
        List<Integer>[] adjList;
        
        Graph(int V)
        {
            this.V=V;
            adjList=new ArrayList[V];
            for(int i=0;i<V;i++)
            {
                adjList[i]=new ArrayList<Integer>();
            }
        }
        
        void addEdge(int s,int d)
        {
            adjList[s].add(d);
        }
        
        
        
       void DFS(int source)
       {
           ArrayList<Boolean> visited=new ArrayList<Boolean>();
           
           for(int i=0;i<V;i++)
            visited.add(false);
           
           Stack<Integer> stack=new Stack<Integer>();
           
           stack.push(source);
           
           while(!stack.empty())
           {
               int top=stack.peek();
               stack.pop();
               
               if(!visited.get(top))
               {
                   System.out.print((top)+"  ");
                   visited.set(top,true);
               }
               
               if(adjList[top].size()>0)
               {
                 Iterator<Integer> itr=adjList[top].iterator();
               
                   while(itr.hasNext())
                   {
                       int next=itr.next();
                   
                       if(!visited.get(next))
                        stack.push(next);
                    }
                 
               }
           }
           
       }
    
    }
    
    
        public static void main(String args[])
        {
            Graph g=new Graph(7);
            g.addEdge(0,1);
            g.addEdge(1,2);
            g.addEdge(1,3);
            g.addEdge(2,4);
            g.addEdge(2,5);
            g.addEdge(3,4);
            g.addEdge(3,6);
            g.addEdge(4,5);
            g.addEdge(4,6);
            
            g.DFS(0);
        }


}