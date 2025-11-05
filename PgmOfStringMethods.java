package moduleprogram;

import java.util.Scanner;

public class PgmOfStringMethods {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String which you want to modify");
	String Str=sc.next();
	System.out.println(Str.length());
	System.out.println(Str.charAt(1));
	System.out.println(Str.toLowerCase());
	System.out.println(Str.toUpperCase());
	System.out.println(Str.equals("Mani"));
	System.out.println(Str.equals("Kshirsagar"));
	System.out.println(Str.equalsIgnoreCase("kshirsagar"));
	System.out.println(Str.trim());
	System.out.println(Str.contains("r"));
	
	System.out.println("Enter string which you want to reversed");
	String inputStr=sc.next();
	String Reversed="";
	for(int j=inputStr.length()-1;j>=0;j--)
	{
		Reversed = Reversed + inputStr.charAt(j);
	}
	System.out.println(Reversed);
	if(inputStr.equalsIgnoreCase(Reversed))
			{
	System.out.println("Yes this is Palindrome word");
			}
	else
	{
		System.out.println("Its not palindrome word");
	}
	sc.close();
	}
	

}
