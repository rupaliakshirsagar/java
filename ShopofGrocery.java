package accessSpecifierAssignments;

public class ShopofGrocery {
	static void AAA()
	{
		System.out.println("Static method of the ShopofGrocery class default specifier");
	}

 void BBB()
	{
		System.out.println("non static  method of the ShopofGrocery class of default specifier");
	}
 public void MethodS1()
 {
	 System.out.println("This is public method from ShopofGrocery class");
 }
 public ShopofGrocery()
 {
	 System.out.println("This is constructor of ShopofGrocery class of public specifier");
 }
 private void CCC()
 {
	 System.out.println("This is private method of the ShopofGrocery class");
	 
 }
 protected void RRR()
 {
	 System.out.println("This is protected method of the ShopofGrocery class");
 }
	public static void main(String[] args) {
		AAA();
		
		ShopofGrocery shop=new ShopofGrocery();
		shop.BBB();
		shop.CCC();
		shop.RRR();
		shop.MethodS1();
		
	}

}
