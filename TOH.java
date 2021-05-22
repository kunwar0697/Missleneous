class TOH
{

    public static void generate(int n,String s,String d, String h)
    {
        if(n==1)
        {
            System.out.println("Move disk "+n+" from "+s+" to "+d);
            return;
        }
        
        generate(n-1,s,h,d);
        System.out.println("Move disk "+n+" from "+s+" to "+d);
        generate(n-1,h,d,s);
    }
}