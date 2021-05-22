import java.util.*;

class PrePostTimeDFS
{
        
        static int time=1;
        
        
        static void DFS(int start,int pre[],int post[],ArrayList<ArrayList<Integer>> aList,int visited[])
        {
            if(visited[start]==1) 
                return;
            
            
            visited[start]=1;
            
            pre[start]=time;
            time+=1;
            
            ArrayList<Integer> temp=aList.get(start);
            for(int i:temp)
            {
                if(visited[i]!=1)
                    DFS(i,pre,post,aList,visited);    
            }
            
            post[start]=time;
            time+=1;
            
            
        }
        
        
        public static void main()
        {
                int n=6;
                
                ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(n+1);
                
                for(int i=0;i<=n;i++)    
                    aList.add(new ArrayList<Integer>());
                
                int pre[]=new int[n+1];
                int post[]=new int[n+1];
                int visited[]=new int[n+1];
                
                Arrays.fill(pre,0);
                Arrays.fill(post,0);
                Arrays.fill(visited,0);
                
                aList.get(1).add(2);
                aList.get(2).add(1);
                aList.get(2).add(4);
                aList.get(4).add(2);
                aList.get(1).add(3);
                aList.get(3).add(1);
                aList.get(3).add(4);
                aList.get(4).add(3);
                aList.get(3).add(5);
                aList.get(5).add(3);
                aList.get(5).add(6);
                aList.get(6).add(5);
                
                DFS(1,pre,post,aList,visited);
                
                for(int i=1;i<=n;i++)
                System.out.println("Node "+i+" Pre Time :: "+pre[i]+" Post Time :: "+post[i]);
                
        }

}