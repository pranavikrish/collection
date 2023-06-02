import java.util.*;
//add element in specific index
public class AddElementinArrayList
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
    al.add(3,17);
System.out.println("after adding element 17 in particular index 3");
System.out.println(al);


}
}
