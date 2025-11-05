package moduleprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PgmOfCollectionsMethods {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(34);
		a.add(500);
		a.add(9);
		a.add(34);
ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(314);
		a1.add(540);
		a1.add(92);
		a1.add(84);
		Collections.sort(a);
		System.out.println(a);
		Integer min=Collections.min(a);
		System.out.println(min);
		Integer max=Collections.max(a);
		System.out.println(max);
		Integer t = Collections.frequency(a, 34);
		System.out.println(t);
		Collections.reverse(a);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		Integer g=Collections.binarySearch(a, 9);//ya method ch check karaw lagel
		System.out.println(g);
		Collections.rotate(a, 3);
		System.out.println(a);
		Collections.rotate(a, -3);
		System.out.println(a);
		Boolean b=Collections.disjoint(a, a1);
		System.out.println(b);
		Collections.fill(a, 50);
		System.out.println(a);
		Collections.copy(a1, a);
		System.out.println(a1);
		Collections.replaceAll(a, 50, 100);
		System.out.println(a);
      List<Integer> l=  Collections.synchronizedList(a);//vicharaych ahe
      Collections.singletonList(55);
      Collections.singletonList(55);
		
		
	
		

	}

}
