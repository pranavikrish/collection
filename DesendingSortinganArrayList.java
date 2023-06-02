import java.util.*;
public class DesendingSortinganArrayList
{
public static void main(String args[])
{
List al=new ArrayList();
al.add(22);
al.add(7);
al.add(5);
al.add(9);
al.add(1);
System.out.println("original order of Arraylist");
System.out.println(al);

Collections.sort(al);
System.out.println("After ascending sorting");
System.out.println(al);

Collections.reverse(al);
System.out.println("After descending sorting");
for(int i=0;i<al.size();i++)
{
System.out.print(al.get(i));
}

}
}
