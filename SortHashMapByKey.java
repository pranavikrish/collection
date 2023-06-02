import java.util.*;
public class SortHashMapByKey
{
public static void main(String args[])
{
Map <Integer,String> hm =new HashMap <Integer,String> ();
    hm.put(8,"ram");
    hm.put(15,"kicha");
    hm.put(1,"raj");
    hm.put(22,"shyam");
    hm.put(104,"sai");
System.out.println(hm);

Map<Integer,String> tm=new TreeMap <Integer,String>();
    tm.putAll(hm);
System.out.println(tm);
}
}
