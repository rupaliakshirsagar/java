package moduleprogram;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;


public class PgmMap {

	public static void main(String[] args) {
 Map <Integer,String>m1= new HashMap<Integer,String>();
 m1.put(1, "Rupali");
 m1.put(2, "Dipali");
 m1.put(3, "Suraj");
 m1.put(4, "Advita");
 System.out.println(m1);
 
 Map <Integer,String>m2= new HashMap<Integer,String>();
 m2.put(13, "Shankar");
 m2.put(12, "Ram");
 m2.put(23, "Lakshman");
 m2.put(54, "Durga");
 System.out.println(m2);
 
m2.putAll(m1); //all the values of m2 will overwrite by values of m1
System.out.println(m2);

 Boolean e=m1.isEmpty();
 System.out.println(e);
 // m1.clear();//return type of this is void so cant write in println statement so need to print m1 separately after this line
 //System.out.println(m1);
 
   Boolean b=m1.containsKey(3);
   System.out.println(b);
   Boolean b2=m1.containsValue("suraj");
   System.out.println(b2);
    String  r= m1.remove(4);
    System.out.println(m1);
   Boolean b3=m1.remove(3, "Suraj");
   System.out.println(m1);
 String s= m1.replace(1, "Sonali");
 System.out.println(m1);
 m1.replace(1, "Sonali", "Rupali");
 System.out.println(m1);
 //m1.replaceAll(m2);
 String p=m1.putIfAbsent(6, "Rakhi");
 System.out.println(m1);
 System.out.println(m1.size());
 
 //Set<Integer> ks=m1.keySet();
 for(Integer i1:m1.keySet())// this is for each loop
 {
	 System.out.println(i1);
 }
   
 for(String c:m1.values())
 {
	 System.out.println(c);
 }
   
   
 for(Map.Entry <Integer, String> es :m1.entrySet())
 {
	 System.out.println(es);
 }

	}

}
