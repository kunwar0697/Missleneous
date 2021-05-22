import java.io.*;
import java.util.*;

class Base
{

    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int num=sc.nextInt();
        String str=getstr(n,num);
        System.out.println(str);
        
    }
    
    static String getstr(int n,int num)
    {
        char ch[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        int r=0;
        int q=0;
        StringBuffer sb=new StringBuffer();
        
        while(num>0)
        {
            q=num/n;
            r=num%n;
            num=q;
            
            if(r>9)
            sb.append(ch[r-10]);
            else sb.append(r);
            
        }
        
        sb.reverse();
        return sb.toString();
    }
}