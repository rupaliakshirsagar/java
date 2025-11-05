package moduleprogram;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyVectorPgm {

	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(1234);
		v1.add("Rupali");
		System.out.println(v1);
		
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
