import java.io.*;
import java.util.*;

class Test
{

    
    int v;
    LinkedList<Integer> adj[];
    int len[];
    
    Test(int x)
    {
        v=x;
        len=new int[v+1];
        adj=new LinkedList[v+1];
        
        for(int i=0;i<=v;i++)
        adj[i]=new LinkedList();
    }
    
    
    void addEdge(int v,int w)
    {
        adj[v].add(w);
        
    }
    
    int DFS(int s)
    {
            int c=-1;
            Vector<Boolean> visited=new Vector<Boolean>(v+1);
            
            for(int i=0;i<=v;i++)
            visited.add(false);
            
            Stack<Integer> stack=new Stack<>();
            
            stack.push(s);
            
            while(stack.empty()==false)
            {
                if(c<stack.size())
                c=stack.size();
                //System.out.println("ss= "+stack.size());
                
                
                s=stack.peek();
                stack.pop();
            
            
            if(visited.get(s)==false)
            {
                
                //System.out.print(s+"  ");
                
                visited.set(s,true);
            }
            
            Iterator<Integer> itr=adj[s].iterator();
            
            while(itr.hasNext())
            {
                int ver=itr.next();
                if(!visited.get(ver))
                stack.push(ver);
            }
        
        }
        if(c==1)
        c=999;
        
        return c;
            
            
    }
    
    
    public static void main(String args[])throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        Test t=new Test(l);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<l-1;i++)
        {
            
            String str=br.readLine();
            String[] spt=str.split(" ");
            int a=Integer.parseInt(spt[0]);
            int b=Integer.parseInt(spt[1]);
            t.addEdge(a,b); 
            t.addEdge(b,a);
        }
        
        int min=999999;
        for(int i=1;i<=l;i++)
        {
            t.len[i]=t.DFS(i);
            if(min>t.len[i])
            min=t.len[i];
            System.out.println(t.len[i]);
        }
        
        System.out.println("minimum=  "+min);
    }
    
    

}