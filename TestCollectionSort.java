import java.util.*;

class TestCollectionSort
{
    public static void main()
    {
            List<Pair> l=new ArrayList<Pair>();
            l.add(new Pair(1,2));
            l.add(new Pair(4,5));
            l.add(new Pair(5,3));
            l.add(new Pair(9,2));
            l.add(new Pair(8,10));
            
            
            Collections.sort(l,(x,y)-> y.b-x.b);
            
            for(Pair p:l)
            {
                System.out.println(p.a+" "+p.b);
            }
            
    }
}