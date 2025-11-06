package accessSpecifierAssignments;

public class Home {

	public static void main(String[] args) {
		ShopofGrocery Object=new ShopofGrocery();
		
		ShopofGrocery.AAA();
		Object.BBB();
		Object.RRR();
		Object.MethodS1();
	//	Object.CCC(); //not able to access from different class of same pkg because its specifier is private
		//Object.main(args);
	}

}
