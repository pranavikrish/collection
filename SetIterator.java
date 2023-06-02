import java.util.*;

public class SetIterator
{
public static void main(String args[])
{
Set<Integer> ls= new LinkedHashSet<Integer>();
    ls.add(5);
    ls.add(7);
    ls.add(2);
    ls.add(9);
System.out.println(ls);

Iterator<Integer> itr= ls.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

//advance for loop
for(int i:ls)
{
System.out.println(i);
}

}
}
