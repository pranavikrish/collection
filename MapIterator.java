import java.util.*;
public class MapIterator
{
public static void main(String args[])
{

Map<Integer,String> hs= new HashMap<>();
    hs.put(1,"hi");
    hs.put(8,"hello");
    hs.put(5,"hy");
    hs.put(9,"he");
System.out.println(hs);

Iterator<Map.Entry<Integer,String> > itr = hs.entrySet().iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

//advance for
for(Map.Entry<Integer,String> e : hs.entySet())
{
if((e.getValue()).length()>5)
{
e.remove();
}
}


}
}
