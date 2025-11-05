package moduleprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PgmArrayListUpcasting {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();//Here we do not specify any perticular data type of values for ArrayList so giving yellow warnings but as we dont specufy we can store dynamic values
		a.add(22);
		a.add("Rupali");
		a.add(3.98);
		a.add(null);
		a.add("True");
		System.out.println(a);
		
		ArrayList <String> a2= new ArrayList<String>();//As here we mention <String so can store string values only>
		a2.add("Deepali");
		a2.add("Kshirsagar");
		Iterator i = a2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	   List a3 = new ArrayList();//Upcasting to use methods from List interface as its parent of ArrayList as its interface we need to upcast it
	   a3.add(22);
	   a3.add(54);
	   Iterator i2 = a3.iterator();
	   while(i2.hasNext())
	   {
		   System.out.println(i2.next());
	   }
		

	}

}
