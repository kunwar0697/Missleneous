import java.util.*;

class Josephus
{
    public static Integer solve(ArrayList<Integer> al,int st,int k)
    {
        if(al.size()==1)
        {
            return al.get(0);
        }
        
        int indextokill=st+k;
        indextokill=indextokill%al.size();
        
        al.remove(indextokill);
        
        return solve(al,indextokill,k);
        
    }
    
    public static void test(int n,int k)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        for(int i=1;i<=n;i++)
        {
            al.add(i);
        }
        
        System.out.println(solve(al,0,k-1));
    }
}