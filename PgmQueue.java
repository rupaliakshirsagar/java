package moduleprogram;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PgmQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(22);
		pq.add(20);
		pq.add(221);
		pq.add(232);
		pq.add(122);
		System.out.println(pq);
		Queue Q=new PriorityQueue();
		Q.add(33);
		Q.add(233);
		Q.add(333);
		Q.add(383);
		Q.add(313);
		System.out.println(Q);
		System.out.println(Q.contains(313));
		System.out.println(Q.containsAll(pq));
		Iterator i =pq.iterator();
		while(i.hasNext())
		{
			System.out.println( i.next());
		}
		pq.remove(20);
		System.out.println(pq);
	}

}
