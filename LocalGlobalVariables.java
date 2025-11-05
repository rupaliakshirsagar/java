package moduleprogram;

public class LocalGlobalVariables {
 static int a=23;
 String s="Me";//we can do declaration and initialization of global variable in one single line
 int n;
 //n=10;//cant initialise the global variable in next line of declaration in globaly we can initialise it localy in our method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(a);//as its static we can use it directly as its in same class also
    LocalGlobalVariables lg=new LocalGlobalVariables();// as its instance means non static global variable we need to create its obj before use it
    System.out.println(lg.s);

    a=299;//We can update the global value in our function directly but dont write datatype before it if we write it it will become different variable as local variable
	System.out.println(a);
    lg.s="you";
	System.out.println(lg.s);
	int n=55;//initializing the value for variable which we declared globally
	System.out.println(n);
	
	String l="mm";
	l="ww";
	System.out.println(l);
	//char h="kiu";//why its not allowing to declare char data type in this pgm
	
	
	}

}
