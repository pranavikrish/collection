import java.util.*;
public class RemoveElementinArraylist
{
public static void main(String args[])
{
List<Integer> al=new ArrayList<Integer>();
al.add(22);
al.add(7);
al.add(5);
al.add(9);
al.add(1);
System.out.println(al);
al.remove(4);
System.out.println("after removing element present in index 4");
System.out.println(al);
}
}
