package moduleprogram;

public class NonstaticMethods
{
	void add()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	}
	
	void sub()
	{
		int a=20;
		int b=5;
		int c=a-b;
		System.out.println(c);
		
	}
	static void mul()
	{
		int a=20;
		int b=5;
		int c=a*b;
		System.out.println(c);
	}
	
public static void main(String[] args) {
	
	NonstaticMethods N= new NonstaticMethods();
	N.add();
	N.sub();
	mul();
	/*NonstaticMethods N1= new NonstaticMethods();
	N1.add();
	N1.sub(); */
	
	
	
}
	

}
