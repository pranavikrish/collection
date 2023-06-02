import java.util.*;
public class ConvertLinkedlisttoArrayList
{
public static void main(String args[])
{
List<Integer> ll=new LinkedList<Integer>();
    ll.add(21);
    ll.add(15);
    ll.add(19);
    ll.add(7);
    ll.add(5);
    System.out.println(ll);
//converting linked list to array list
List<Integer> al=new ArrayList<Integer>();
    al.addAll(ll);
System.out.println("after conversion of linkedlist to arraylist");
System.out.println(al);
}
}
