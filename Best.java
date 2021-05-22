import java.util.*;

public class Best
{
public static void main(String args[])
{

LinkedList<Box> list=new LinkedList<>();
Stack<Box> abl=new Stack<>();
Box a=new Box(5.1f,"india");
Box b=new Box(3.7f,"japam");
Box c=new Box(8.2f,"tha");

list.add(a);
list.add(b);
list.add(c);

abl.push(a);
abl.push(b);
abl.push(c);

System.out.println(list.poll().equals(abl.pop()));

}


}

