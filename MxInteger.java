import java.util.*;
import java.io.*;

public class MxInteger
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int ar[] =new int[n];
        List<String> list=new ArrayList<String>();
        
        for(int i=0;i<n;i++)
        
        {
            ar[i]=sc.nextInt();
            list.add(Integer.toString(ar[i]));
            
        }
        
        Collections.sort(list,new Comparator<String>(){
        
          public int compare(String a,String b)
          {
          String ab=a+b;
          String ba=b+a;
          return ab.compareTo(ba)>0?-1:1;
          }
        });
        
        Iterator<String> itr=list.iterator();
        StringBuffer sb=new StringBuffer();
        while(itr.hasNext())
        {
            String s=itr.next();
            sb.append(s);
            
        }
        System.out.println(sb);
        
        
        
    }
}