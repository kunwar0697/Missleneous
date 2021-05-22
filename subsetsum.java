import java.util.*;
class subsetsum
{
public static void main()
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int sum=sc.nextInt();
    
    if(subset(a,sum))
     System.out.println("yes");
     else System.out.println("no");
     
}

static boolean subset(int[] a,int sum)
{
    int row=a.length+1;
    
    boolean ss[][]=new boolean[row][sum+1];
    
    for(int i=1;i<=sum;i++)
    ss[0][i]=false;
    ss[0][0]=true;
    for(int i=1;i<row;i++)
    ss[i][0]=true;
    
    for(int i=1;i<row;i++)
    {
        for(int j=1;j<=sum;j++)
        {
            if(a[i-1]>j)
            ss[i][j]=ss[i-1][j];
            
            else ss[i][j]=(ss[i-1][j-a[i-1]] || ss[i-1][j]);
        }
    }
    return ss[a.length][sum];
}
}