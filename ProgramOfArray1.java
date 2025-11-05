package moduleprogram;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ProgramOfArray1 {

	public static void main(String[] args) {
		//Program to copy the values of array a to b
		/*int [] a= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(Arrays.toString(a));
		
		int [] b= new int[3];//to copy array a in to array b
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		System.out.println(Arrays.toString(b));*/
		//Another way to write copy program using scanner class 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array w");
		int s=sc.nextInt();
		int[] w=new int[s];
		System.out.println("Enter the values for array to save");
		for(int i=0;i<s ;i++)
		{
			w[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(w));
		
		int[] f=new int[w.length];
		for(int i=0,j=0;i<w.length;i++,j++)
		{
			f[i]=w[i];
		}
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(w));
		if(Arrays.equals(w, f))
		{
			System.out.println("Yes both arrays are equal in size and values also same");
		}
		else
		{
			System.out.println("Arrays are not equals");
		}
		
		//Copy one array in another in reverse order
		//Way one
		/*for(int i=0;i<w.length;i++)
		{
			f[0]=w[2];
			f[1]=w[1];
			f[2]=w[0];
		}
		System.out.println(Arrays.toString(w));
		System.out.println(Arrays.toString(f));*/
		
		//Second way to store one array in another in reverse order
		
		for(int i=0,j=w.length-1;i<w.length;i++,j--)
		{
			f[i]=w[j];
			

	}
		System.out.println(Arrays.toString(w));
		System.out.println(Arrays.toString(f));
		
		//Program to find average of the array values
		
		double sum=0;
		
		for(int i=0;i<s;i++)
		{
			sum=sum+f[i];
		}
		System.out.println(sum);
		System.out.println("Avarage is:");
		double avarage =sum/f.length;
		System.out.println(avarage);
		
		//Pgm of checking whether arrays are equal or not
		

}
}
