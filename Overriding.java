package moduleprogram;
class b
{
	void login()
	
	{System.out.println("parent method");

	}
}
	
public class Overriding extends b {
	void login()
	{
		System.out.println("child method");
		super.login();
	}
	
	
	
	public static void main(String[] args) {
		
		Overriding o=new Overriding();
		o.login();
		
		
	}

}
