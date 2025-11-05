package moduleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class PgmOfArray {

	public static void main(String[] args) {
		String s1="Rupali";
	char[]	a=s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(a[i]);
	}
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array ar");
	int[] ar=new int[sc.nextInt()];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Enter the value of index"+i);
	  ar[i]=sc.nextInt();
	  
	}
	System.out.println(Arrays.toString(ar));
	}

}
