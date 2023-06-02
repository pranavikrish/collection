import java.util.*;
public class ReverseArrayList
{
public static void main(String args[])
{
List<Integer> al=new ArrayList<Integer>();
    al.add(21);
    al.add(15);
    al.add(19);
    al.add(7);
    al.add(5);
System.out.println(al);
//reverse printing Arraylist elements
for(int i=al.size()-1;i>=0;i--)
{
System.out.println(al.get(i));
}
//reversing the ArrayList elements
Collections.reverse(al);
System.out.println(al);


}
}
