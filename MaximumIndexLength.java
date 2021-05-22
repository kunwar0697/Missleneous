import java.io.*;
import java.util.*;


class MaximumIndexLength
{
static void make_matrix(int[] ar, int[][] m)
{
    for(int i=0;i<ar.length;i++)
    {
        for(int j=i;j<ar.length;j++)
        {
            if(i==j)
            m[i][j]=ar[j];
            else 
            m[i][j]=m[i][j-1]+ar[j];
            
        }
    }
}

public static void main(String args[]) throws IOException
{
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int ar1[]=new int[n];
    int ar2[]=new int[n];
    
    int m1[][]=new int[n][n];
    int m2[][]=new int[n][n];
    
    for(int i=0;i<n;i++)
    ar1[i]=sc.nextInt();
    
    for(int i=0;i<n;i++)
    ar2[i]=sc.nextInt();
    
    make_matrix(ar1,m1);
    make_matrix(ar2,m2);
    System.out.println("===========");
    printud(m1);
    System.out.println("===========");
    printud(m2);
    System.out.println("===========");
    int k=getresult(m1,m2);
    System.out.println(k);
    
}

static int getresult(int a[][],int b[][])
{
    int res=-1;
    int l=a.length;
    
    for(int i=0;i<a.length;i++)
    {
        int r=0;
        int c=i;
        int p=l-i;
        int x=1;
        while(x<=p)
        {
            if(a[r][c]==b[r][c])
            {
                if(res<(c-r+1))
                res=c-r+1;
            }
            x++;
            r++;
            c++;
        }
    }
    return res;
}
static void printud(int [][]m)
{
    for(int i=0;i<m.length;i++)
    {
        for(int j=i;j<m.length;j++)
        System.out.print(m[i][j]+" ");
        System.out.println();
    }
    
}

}