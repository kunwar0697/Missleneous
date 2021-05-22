import java.io.*;
import java.util.*;

class Number2Subtract
{
    
    static int validArray(int[] arr)
    {
        int temp=0;
        if(arr[1]<=arr[0] && arr[1]<=arr[2])
        {
            temp=arr[1];
            arr[1]=arr[0];
            arr[0]=temp;
        }
        else if(arr[2]<=arr[0] && arr[2]<=arr[1])
        {
            temp=arr[2];
            arr[2]=arr[0];
            arr[0]=temp;
        }
        
        if(arr[1]>=arr[2])
        {
          temp=arr[1];
          arr[1]=arr[2];
          arr[2]=temp;
        }
        
        int c=0;
        
        for(int x:arr)
        {
            if(x==0)
            c++;
        }
        
        return c;
    }
    

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
        int ans=0;
        Arrays.sort(arr);
       
        if(arr[0]==arr[1] && arr[1]==arr[2])
        {
            ans+=1;
            arr[0]-=1;
            arr[1]-=1;
        }
        else if(arr[0]==arr[1])
        {
            arr[0]-=1;
            arr[2]-=1;
            ans+=1;
        }
        Arrays.sort(arr);
        ans+=arr[0];
        arr[0]=0;
        arr[2]-=ans;
        ans+=Math.min(arr[1],arr[2]);
        System.out.println(ans);

    }
        
    }
}