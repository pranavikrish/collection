import java.util.*;
public class IterateTreeMap
{
public static void main(String args[])
{
TreeMap <Integer,String> tm =new TreeMap <Integer,String> ();
    tm.put(18,"ram");
    tm.put(5,"kicha");
    tm.put(101,"raj");
    tm.put(12,"shyam");
    tm.put(74,"sai");
System.out.println(tm);
for(Map.Entry<Integer,String> e: tm.entrySet())
{
System.out.println(e.getKey()+" "+e.getValue());
}


}
}
