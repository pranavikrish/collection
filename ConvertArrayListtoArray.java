import java.util.*;
public class ConvertListtoArray
{
public static void main(String  args[])
{

List<String> al=new ArrayList<String>();
    al.add("ram");
    al.add("kishore");
    al.add("shyam");
    al.add("sai");
    al.add("surekha");
    al.add("priya");
        
System.out.println(al);

//convert list to array
String a[]=new String[al.size()];
for(int i=0;i<a.length;i++)
{
a[i]=al.get(i);
System.out.println(a[i]);
}


}
}
