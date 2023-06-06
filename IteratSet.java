import java.util.*;
public class A
{
public static void main(String  args[])
{

Set<String> hs=new HashSet<String>();
    hs.add("ram");
    hs.add("kishore");
    hs.add("shyam");
    hs.add("sai");
    hs.add("surekha");
    hs.add("priya");

Iterator<String>  itr=hs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
