package moduleprogram;

import java.util.Arrays;

public class PredefinedStringMethods {
  
	public static void main(String[] args) {
		String s1="Rupali Kshirsagar 10@  34";
	   char[] c1= s1.toCharArray();
	   System.out.println("Given string is"+Arrays.toString(c1));
	   
	   //Counting alphabets
	    int NoOfTimeCount=0;
	   for(int i=0;i<c1.length;i++)
		   
	   { boolean b1 = Character.isAlphabetic(c1[i]);
		   if(b1)
		   {
       NoOfTimeCount++;
		   }
       
	   }
	   System.out.println("Alphabets are "+NoOfTimeCount +" Times in agiven string");
	   
	   //Counting digits
	   int NoOfTimeCountDigit =0; 
	   for(int i=0;i<c1.length;i++)
	   {
		   boolean b2 = Character.isDigit(c1[i]);
       if(b2)
       {
    	   NoOfTimeCountDigit++;
       
	   }
	   
	}
	   System.out.println("Numeric values are present"+NoOfTimeCountDigit+" times in a given string");
	   
	   //Counting whitespace
	   
	   int NoOfSpaces=0;
	   for(int i=0;i<c1.length;i++)
	   {
		   boolean b3= Character.isWhitespace(c1[i]);
				   if(b3)
				   {
					   NoOfSpaces++; 
				   }
	   }
	   System.out.println("Total "+NoOfSpaces +" Spaces are present in the given string");
	   
	   
	   int specialChar=c1.length-(NoOfSpaces+NoOfTimeCountDigit+NoOfTimeCount);
	   System.out.println(specialChar);
	   
	   
	 String str="Ekansh and Advita 10@";
	 String[] d=str.split(" ");
	
	 System.out.println(Arrays.toString(d));
	 String[] d1=str.split(" ",2);
	 System.out.println(Arrays.toString(d1));
	   
	 
	  // System.out.println(s1.repeat(2));
	}
	
	
}
