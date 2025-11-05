package moduleprogram;

import java.util.ArrayList;

public class ProgramArrayListMethods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Rupali");
		a1.add(1);
		System.out.println(a1);
		a1.add(1, "Kshirsagar");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("Atul");
		a2.add("Nerkar");
		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2);
		a2.addAll(0, a1);
		System.out.println(a2);
		boolean b=a1.equals(a2);
		System.out.println(b);
		a2.remove(1);
		System.out.println(a2);
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a1.isEmpty());
		Object a3 =a1.clone();
		

	}

}
