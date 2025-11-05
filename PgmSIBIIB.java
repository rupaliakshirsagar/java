package moduleprogram;

public class PgmSIBIIB {
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	
	public PgmSIBIIB()
	{
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		PgmSIBIIB b= new PgmSIBIIB();
		
		

	}
	{
		System.out.println("IIB 3");
	}


}
