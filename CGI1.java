import java.io.*;
import java.util.*;

class CGI1
{
    
    

    public static void main(String args[])throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
        String inp=br.readLine();
        
        String ar[]=inp.split(" ");
        int[] arr=new int[3];
        for(int i=0;i<=2;i++)
        {
            arr[i]=Integer.parseInt(ar[i]);
        }
        Arrays.sort(arr);
        
        int c=0;
       while(!(arr[0]==0 && arr[1]==0))
        {
           if(arr[0]==arr[2] && arr[1]==arr[0])
           {
               arr[0]-=1;
               arr[1]-=1;
           }
           else if(arr[0]==arr[1])
           {
               arr[0]-=1;
               arr[2]-=1;
           }
           else if(arr[0]>arr[1])
           {
             arr[0]-=1;
             arr[2]-=1;
           }
           else if(arr[0]<arr[1])
           {
            arr[1]-=1;
            arr[2]-=1; 
           }
          
           c++;
           
        }
        
       System.out.println(c);
      }
   }

}