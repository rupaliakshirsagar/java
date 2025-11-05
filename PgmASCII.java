package moduleprogram;

import java.util.InputMismatchException;

public class PgmASCII {

	public static void main(String[] args) {
		int value='A';
		System.out.println(value);
		int value1='G';
		System.out.println(value1);
		int val=44;
		System.out.println(val);
		String s= "apple";
		int a=s.hashCode();
		System.out.println(a);
		
		if(-1>0)
		{
		
		throw new NullPointerException();
		}
		else
		{
			throw new InputMismatchException("Exception1");

		}


	}

}
