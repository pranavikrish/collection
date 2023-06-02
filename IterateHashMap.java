import java.util.*;
public class IterateHashMap
{
public static void main(String args[])
{
HashMap <Integer,String> hm =new HashMap <Integer,String> ();
    hm.put(8,"ram");
    hm.put(15,"kicha");
    hm.put(101,"raj");
    hm.put(12,"shyam");
    hm.put(74,"sai");
System.out.println(hm);
for(Map.Entry<Integer,String> e: hm.entrySet())
{
System.out.println(e.getKey()+" "+e.getValue());
}


}
}
