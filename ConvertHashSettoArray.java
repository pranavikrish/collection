import java.util.*;
public class ConvertHashSettoArray
{
public static void main(String args[])
{
Set<Integer> hs=new HashSet<Integer>();
    hs.add(21);
    hs.add(15);
    hs.add(19);
    hs.add(7);
    hs.add(5);
    System.out.println(hs);
//converting hashSet to Array

int a[]=new int[hs.size()];
int i=0;
for(int x:hs)
  {
  a[i]=x;
  i++;
  }
//printing elements in array
for(int j=0;j<a.length;j++)
  {
  System.out.println(a[j]);
  }
}
}
