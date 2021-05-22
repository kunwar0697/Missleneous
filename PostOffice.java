import java.util.*;

public class PostOffice
{
    public static void main(String srgs[])throws Exception
    {
        int n;
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        System.out.println(" ======/n th /n q  ");
        int x=sc.nextInt();
        int q=sc.nextInt();
        int req[][]=new int[q][2];
        for(int i=0;i<q;i++)
        {
            req[i][0]=sc.nextInt();
            req[i][1]=sc.nextInt();
            System.out.println(req[i][0]+" ==> "+req[i][1]);
        }
        
        
        boolean m[][]=new boolean[n][n];
        
        for(int i=0;i<n;i++)
        {
            int r=0;
            int c=i;
            int l=1;
            int h=n-i;
            
            while(l<=h)
            {
                if(r==c)
                m[r][c]=true;
                else if(c-r==1)
                m[r][c]=((ar[c]-ar[i])<=x)?true:false;
                else
                {
                    int d=ar[c]-ar[r];
                    if(d>x)
                    m[r][c]=(m[r][c-1] && m[c-1][c]);
                    else m[r][c]=true;
                }
                r++;
                c++;
                l++;
                
            }
        }
        
        int ans[]=new int[q];
        System.out.println("====== t/f =======");
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                 System.out.print(m[i][j]+" ");
             }
             System.out.println();
        }
         
        System.out.println("====== a n s w e r =======");
        for(int i=0;i<q;i++)
        {
            int ro;
            int co;
            ro=req[i][0]-1;
            co=req[i][1]-1;
            if(m[ro][co]==true)
            ans[i]=1;
            else ans[i]=0;
            
            System.out.print(ans[i]+"      ");
        }
    }
}