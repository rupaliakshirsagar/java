package moduleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeSelf {

	public static void main(String[] args) {
		//To reverse the string
		
		Scanner sc= new Scanner (System.in);
		/*
		System.out.println("Enter the string which you want to reverse ");
		String s=sc.next();
		String Reverse="";
		for(int i= s.length()-1; i >= 0; i--)
		{
			Reverse=Reverse + s.charAt(i);
			
		}
	
		System.out.println("Reverse string is " + Reverse);
		
       String b="Rupali";
       System.out.println(b.equalsIgnoreCase(Reverse));
       System.out.println(b.length());
       //To check given string is palindrome or not
       if(s.equalsIgnoreCase(Reverse))
       {
    	   System.out.println("Yes this is palindrome string");
    	   
       }
       else
       {
    	   System.out.println("No this is not palindrome string");
       }
      // System.out.println(s.replaceAll("[a-z]", "*"));
       System.out.println(s.replace("q"," l"));
       //System.out.println(s.replace("automation", "Automation testing"));
       System.out.println(s.matches("a(.*)"));
       
    char[] c= s.toCharArray();
      for(int i=0;i<s.length();i++)
      {
    	  System.out.println(c[i]);
      }
      System.out.println(Arrays.toString(c));
      */
      //Pgm to accept array values at run time
      System.out.println("Enter the size of array");
      int[] rollno=new int[sc.nextInt()];
      System.out.println("Eneter the values in array");
      
      for(int i=0;i<rollno.length;i++)
      {
    	  rollno[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(rollno));
      
      //Copy one array in another
      int[] b=new int[rollno.length];
      for(int i=0,j=0;i<rollno.length;i++,j++)
      {
    	  b[i]=rollno[j];
      }
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.toString(rollno));
      
      //Copy one array in another array in reverse order
      int[] c=new int[rollno.length];
      for(int i=rollno.length-1,j=0;i>=0;i--,j++)
      {
    	  c[i]=rollno[j];
      }
      System.out.println(Arrays.toString(c));
      System.out.println(Arrays.toString(rollno));
      int noToFind=100;
      
      for(int i=0;i<rollno.length-1;i++)
      {
    	  if(c[i]==noToFind)
    	  {
    		  System.out.println("no is present");
    		  
    	  }
    	  
    	  
      }
    		 
      
	}

}
