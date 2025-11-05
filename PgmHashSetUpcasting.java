package moduleprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PgmHashSetUpcasting {

	public static void main(String[] args) {

HashSet h=new HashSet();//Here we do not specify the special any object type or data type so can store dynamic values but yellow warning will be diplayed then
h.add(24);
h.add("ABC");
Iterator I =h.iterator();
while(I.hasNext())
{
	System.out.println(I.next());
	}
System.out.println(h);//HashSet aslyamule output indexing yet nahi khali war hote
//Now upcasting 

Set uh=new HashSet();
uh.add("Null");
uh.add("PPP");
uh.add(34232.7776);
uh.add(54);
Iterator ii=uh.iterator();
while(ii.hasNext())
{
	System.out.println(ii.next());}

	}

}
