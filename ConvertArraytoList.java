import java.util.*;
public class A1
{
public static void main(String  args[])
{
String s="i am learning java";
String a[]=s.split(" ");
String s1="";
//converting string array to arraylist
List<String> al=new ArrayList<String>();
    for(int i=0;i<a.length;i++)
    {
     al.add(a[i]);
    }
System.out.println(al);

//converting string array to linked arraylist
List<String> lal=new LinkedList<String>();
    for(int i=0;i<a.length;i++)
    {
     lal.add(a[i]);
    }
System.out.println("linked list "+ lal);

//converting arraylist into string
for(int j=0;j<al.size();j++)
{
s1=s1+al.get(j);
}
System.out.println("string s1 is "+ s);
}
}
