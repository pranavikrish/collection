import java.util.*;
public class ConvertArraytoSet
{
public static void main(String  args[])
{
int a[]={3,5,6,8,9,2,1};
Set<Integer> ts=new TreeSet<Integer>();
for(int i=0;i<a.length;i++)
{
ts.add(a[i]);

}
System.out.println(ts);

}
}
