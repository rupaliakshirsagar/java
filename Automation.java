package moduleprogram;

public class Automation {
	
	public Automation()
	{
		System.out.println("executing construction as created object in main method");
		
	}
	public Automation(int a)
	{
		System.out.println("here second constructor is executing by creating a1 object in main method");
	}

	void methodNonestatic()
	{
		System.out.println("this is non static constructor we called it in main method using created object of our class");
	}
	public static void main(String[] args) {
		
 Automation a=new Automation(); //we can create obj like this also
 Automation a1=new Automation(1);
 new Automation();// also we can create obj like this also 
 new Automation(2);
 a.methodNonestatic();
 a1.methodNonestatic();
	}

}
//here we write different constructor with same name but different aur list is called constructor overloading