import java.util.*;
import java.io.*;
class Sales
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            List<ArrayList<String>> list=new ArrayList<>();
            StringBuffer maxs=new StringBuffer();
           
            int c=Integer.parseInt(br.readLine());
            int maxc=-1;
            HashMap<Integer,ArrayList<String>> hm=new HashMap<>();
            for(int i=1;i<=c;i++)
            {   
                String str=br.readLine();
              
                if(str.equalsIgnoreCase("top"))
                {
                    ArrayList<String> temp=hm.get(maxc);
                    sorter(temp);
                    list.add(temp);
                    maxc=-1;
                    
                }
                else
                {
                    String inp[]=str.split(" ");
                    int count=Integer.parseInt(inp[1]);
                    if(!hm.containsKey(count))
                    {
                        ArrayList<String> l1=new ArrayList<>();
                        l1.add(inp[0]);
                        hm.put(count,l1);
                    }
                    else
                    {
                        List l2=hm.get(count);
                        l2.add(inp[0]);
                    }
                    if(count>=maxc)
                    {
                        maxc=count;
                        
                    }
                }
                
             }
             
            for(int i=0;i<list.size();i++)
            {
                ArrayList<String> tempo=list.get(i);
                Iterator<String> itr=tempo.iterator();
                while(itr.hasNext())
                {
                    System.out.print(itr.next()+" ");
                }
            }
        }
    
    }
 
    static void sorter(ArrayList<String> list)
    {
       Collections.sort(list,new Comparator<String>(){
        
          public int compare(String a,String b)
          {
          String ab=a+b;
          String ba=b+a;
          return ab.compareTo(ba)>0?1:-1;
          }
        });
        
       
    }
}