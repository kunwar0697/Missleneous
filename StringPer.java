/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class StringPer {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t!=0)
		{
		    String str=sc.next();
		    permutation_gen(str,0);
		    System.out.println();
		    t--;
		}
		
	}
	
	public static void permutation_gen(String str,int ind)
	{
	    if(ind==str.length()-1)
	    System.out.print(str+" ");
	    else
	    {
	        StringBuilder sb=new StringBuilder(str);
	    
	        for(int i=ind;i<str.length();i++)
	        {
	            sb.setCharAt(i,str.charAt(ind));
	            sb.setCharAt(ind,str.charAt(i));
	            String str2=sb.toString();
	            permutation_gen(str2,ind+1);
	        }
	    }
	}
}