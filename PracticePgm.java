package moduleprogram;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class PracticePgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the array size of a array");
		int [] a= new int[sc.nextInt()];
		System.out.println("Enter the numbers to the array");
		for(int i=0;i<a.length;i++)
		{
         a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		// One array copy to another array
		
		
		int[] b=new int [a.length];
		for(int i=0,j=0;i<a.length;i++,j++)
		{
			b[j]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//Copy one array in another array in reverse order
		
		int[] c=new int [a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			c[j]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		//find out avg ofvalues present in the array
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the values present in array is:-"+ sum);
		System.out.println("Avg is:-"+ sum/a.length);
		
		//Two arrays are equal or not check
		System.out.println(Arrays.equals(a, b));//can use if and msg
		
		//Highest and lowest number
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		//sort values without pre defined method
		
		for( int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int Dummy=a[i];
				a[i]=a[j];
				a[j]=Dummy;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		//Check given no is present in array or not
		int GivenNo=10;
		int Count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(GivenNo==a[i])
			{
				
				Count++;
				
			}
			
		}
		System.out.println("Yes number is present" + Count+ "times in array");*/
		//..............................................................................................
		//Programs of String
		
		//Reverse a string and check is it palindrom or not
		
		
		/*System.out.println("Enter string to reverse");
		
		String s1=sc.next();
		String Reversed="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			Reversed=Reversed+ s1.charAt(i);
		}
		
		System.out.println("Revered string is:- "+ Reversed);
		
		//Check string is palindrom or not
		
		if(s1.equalsIgnoreCase(Reversed))
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrom");
		}*/
		
		//Given string find out how many are characters ,numbers,spaces,special characters
		
	  /* System.out.println("enter a string in which you want to check anagrame or not");
		String string2=sc.next();
		String string3=sc.next();
		
	   if(string2.length()!=string3.length())
	    {
	    	System.out.println("String dont have same length so its not anagrame");
	    }
	    else
	    {
		char[] Covrt2=string2.toCharArray();
		char[] Covrt3=string3.toCharArray();
		
		Arrays.sort(Covrt2);
		Arrays.sort(Covrt3);
		
		if(Arrays.equals(Covrt2, Covrt3))
		{
			System.out.println("Strings are anagrame");
		}
		else
		{
			System.out.println("String are not anagrame");
		}
		
		
		
		
	    }
	   String str1="bhh uyuy 763";
	    String[] spt=str1.split(" ");
	    System.out.println(Arrays.toString(spt));
	   String[] f= str1.split(" ", 2);
	   System.out.println(Arrays.toString(f));
	   String[] spt1=str1.split(",");
	   System.out.println(Arrays.toString(spt1));*/
	   //...................
	   //Find characters,numbers,special char and white spaces
		String sss="Rupali Kshirsagar @ 10000";
	  char[] tochr=sss.toCharArray();
	  int count=0;
	  for(int i=0;i<tochr.length;i++)
	  {
	  //Character.isAlphabetic(tochr[i]);
		  if(Character.isAlphabetic(tochr[i]))
		  {
			  count++;
		  }
		  
	  }
	   System.out.println("Total characters present"+ count);
	   int count2=0;
	   for(int i=0;i<tochr.length;i++)
		  {
		  if(Character.isDigit(tochr[i]))
		  {
		  count2++;
		  }
		  }
	   System.out.println("Total digit present"+ count2);
	   
	   int count3=0;
	   for(int i=0;i<tochr.length;i++)
		  {
		  if(Character.isWhitespace(tochr[i]))
		  {
		  count3++;
		  }
		  }
	   System.out.println("Total spaces present"+ count3);
	   int splchr= tochr.length-(count3+count2+count);
	   System.out.println(splchr);
	   
	   //.................................................
	   //find doublicate characters in string
	   
	   String str12="Abcdbcc";
	   char[] chr=str12.toCharArray();
	   
	   for(int i=0;i<chr.length;i++)
	   {
		   int countM = 0;
		   for(int j=0;j<chr.length;j++)
		   {
			  if(chr[i] == chr[j])
			  {
				  countM++;
			  }
		   }
		   System.out.println("Char " + chr[i] + " is " + countM);
	   }
	   
	   //.....................
	   //Remove all whitespace from string
	   
	   String r="Dipali 20 @ gmail.com";
	   System.out.println(r);
	   String fg=r.replaceAll(" ", "");
	   System.out.println(fg);
	   //.....................find the non repeatative character in string
	   
	   String str90="Abcdbcc";
	   char[] chr1=str90.toCharArray();
	   
	   for(int i=0;i<chr1.length;i++)
	   {
		   int countM = 0;
		   for(int j=0;j<chr1.length;j++)
		   {
			  if(chr1[i] == chr1[j])
			  {
				  countM++;
				  if(countM>1)
				  {
				  break;
				  }
			  }
		   }
		   if(countM==1)
		   {
			   System.out.println("first non repeative character " + chr1[i] + " is " + countM);
			   break;
		   }
		   
	   }
	   
	   //..............................
	   //Longest word in the string and at which index
	   
	   String words="Is this my phone1212 number ?";
	   String[] sptstrng=words.split(" ");
	   
	   String str="";
	   for(int k=0;k<sptstrng.length;k++)
	   {
		   if(str.length() < sptstrng[k].length())
		   {
			   
			   str=sptstrng[k];
		   }
	   }
	   System.out.println("Largest word is "+ str);
	   //.......................
	   //Sort characters from string alphabetically
	   
	   String h="zvdrtsew";
	   char[] p=h.toCharArray();
	   Arrays.sort(p);
	   
	   System.out.println(p);
	   //.........................
	   //Replace all occurance of characters
	   
	   String b="nb34@ tt";
	  String c= b.replaceAll("[a-z]", "0");
	   System.out.println(c);
	   
	   
	   
	   
	   

		  
				  
		   
	   
	   
		
	   
	   sc.close();
		}
	
	
	
	

}
