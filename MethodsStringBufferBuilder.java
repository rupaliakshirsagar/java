package moduleprogram;

public class MethodsStringBufferBuilder {

	public static void main(String[] args) {
		//Constructor 1 of StringBuffer
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		//Constructor 1 of StringBuilder
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		
		String str=new String();
		//System.out.println(str.capacity);// string does not have default capacity because string is immutable
		//3 type of constructors in StringBuilder and StringBuffer
		//constructor 1;- StringBuffer s1=new StringBuffer(); and StringBuilder sb=new StringBuilder();
		//Constructor 2:-  StringBuffer s1=new StringBuffer("Automation"); and StringBuilder sb=new StringBuilder("Automatiomn");
		//Constructor 3:- StringBuffer s1=new StringBuffer(int capacity); and StringBuilder sb=new StringBuilder(int capacity);
		

		//Constructor 2 of StringBuffer
		StringBuffer sb1=new StringBuffer("Auto");
		System.out.println(sb1.append("mation"));
		
		//Constructor 2 of StringBuilder
				StringBuilder sb2=new StringBuilder("Auto");
				System.out.println(sb2.append("mation"));//String madhe append method nahi concat method ahe
				
	//in string insert,delete,reverse method are not there because string is immutable
				StringBuffer r=new StringBuffer("Rupali Kshirsagar");
				System.out.println(r.insert(7, "Arun "));
				
				StringBuilder p=new StringBuilder("Advita Nerkar");
				System.out.println(p.insert(7, "Atul "));
				
				//String madhe replace 3 method ahe replace chya pahile replace char char,dusari replace string string and third replace all
				//Stringbuffer madhe ek ahe replace
				StringBuffer sff=new StringBuffer("Pune is the good city");
				System.out.println(sff.replace(12, 16, "best"));//end indrx ek jast dyaycha karan te n-1 consider karte
				
				StringBuffer s4=new StringBuffer("Pune is the good city in india");
				System.out.println(s4.delete(21, 30));
				
				StringBuffer s3=new StringBuffer("Pune");
				System.out.println(s3.reverse());//same method in StringBuilder also
				//System.out.println(s3.substring(1));
				System.out.println(s3.substring(0, 2));
				
				
				
		
		
	}

}
