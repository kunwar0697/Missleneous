import java.util.*;

class BalanceBrackets
{
    static void generate(String op,int open,int close,ArrayList<String> ans)
    {
        if(open<0 || close<0)
            return;
            
        if(open>close)
            return;
            
        if(open==0 && close==0)
        {
            ans.add(op);
            return;
        }
        
        generate(op+"(",open-1,close,ans);
        generate(op+")",open,close-1,ans);
    }
    
    public static void solve(int x)
    {
        ArrayList<String> ans=new ArrayList<String>();
        
        generate("",x,x,ans);
        
        ans.stream().forEach(i-> System.out.println(i));
    }
}