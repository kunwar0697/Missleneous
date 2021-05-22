import java.io.*;
import java.util.*;
class bt_gen_n
{
   
    static void gen(int st,int end,int[] a)
    {
        if(st==end)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
                
            }
            System.out.println();
        }
        else
        {
            a[st]=0;
            gen(st+1,end,a);
            a[st]=1;
            gen(st+1,end,a);
        }
        
        
    }
    
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       int a[]=new int[n];
       gen(0,n,a);
       
    }
}