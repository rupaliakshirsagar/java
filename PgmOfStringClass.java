package moduleprogram;


public class PgmOfStringClass {

	public static void main(String[] args) {
		String a="Automation";//No need to create obj of string class can access directly but if you want you can create obj and use that obj it also will work
		a.concat("Testing");//as we have not created new string to update the stored value in a variable it will print Automation only to update the value we need to use new variable to store upatated value
		System.out.println(a);//String class is immutable
		String b=a.concat(" Testing");// here we are storing updated value in variable b so it have concatinated value as automation testing
		System.out.println(b);
		
		StringBuffer sb=new StringBuffer("Original StringBuffer value");
		//sb=new StringBuffer("");//cant use directly String Buffer claa and need to create obj of it first
		System.out.println(sb);
		sb.append(" Now updating the values in same variable as StringBuffer class is mutable");//No need to stored updated value in new variable we can use same variable to modify the stored value
		System.out.println(sb);
		
		StringBuilder sbuild= new StringBuilder("Auto from StringBuffer Class");
		System.out.println(sbuild);
		sbuild.append("String updated here using StringBuffer Append method");
		System.out.println(sbuild);
		//As StringBuilder is also mutable we can use same variable to update the previously stored value
		
		//For String Class its not compulsary to create object of String class as its data type where we can declare and initialise the values no need to create obje where as for StringBuffer and StringBuilder they are class for which we need to create an object to use its methods
		
		
		
		

	}

}

