package moduleprogram;

public class PgmUpDownTypeCasting {

	public static void main(String[] args) {
		int a=100;
		//upcasting
		long l=a;//Implicitly upcasting
		System.out.println(l);
		
		//Explicitly upcasting
		
		int a1=111;
		long l1=(long) a1;//explicitly upcasting
		System.out.println(l1);
		//downcasting
		
		int b=102;
		//downcasting
		byte v=(byte) b;//sysntax of explicitly down casting
		System.out.println(v);//downcasting should be done only one way as explicitly
		
		
		//long in to byte down casting
		long g=22678764;
		byte bb=(byte)g;
		System.out.println(bb);// we will give different output because this may result in data loss if the long value exceeds the byte range.

		

	}

}
