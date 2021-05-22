/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KPS {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t!=0)
		{
		    int n=sc.nextInt();
		    int w=sc.nextInt();
		    int val[]=new int[n];
		    int wt[]=new int[n];
		    int i=0;
		    for(i=0;i<n;i++)
		    val[i]=sc.nextInt();
		    
		    for(i=0;i<n;i++)
		    wt[i]=sc.nextInt();
		    System.out.println(kp(w,wt,val,n));
		    
		    t--;
		    
		}
	}
	
	public static int kp(int w,int wt[], int val[],int n)
	{
	    if(n==0||w==0)
	    return 0;
	    
	    if(wt[n-1]>w)
	    return kp(w,wt,val,n-1);
	    
	    return (Math.max(val[n-1]+kp(w-wt[n-1],wt,val,n-1),kp(w,wt,val,n-1)));
	}
}