package moduleprogram;

public class MoreStringMethods {

	public static void main(String[] args) {
		String s="Automation";
		s.replace("A", "a");//One method of String
		System.out.println(s);//Here we will get Automation only because its Strig immutable and first we saved Automation to the s variable
        System.out.println(s.replace("A", "a"));
        
        String k="Kshirsagar";
        System.out.println(k);
        k.replace("Kshirsagar", "Rupali Kshirsagar");
        System.out.println( k.replace("Kshirsagar", "Rupali Kshirsagar"));
        
        String a="Advita Nerkar";
        System.out.println(a);
        a.replaceAll("[a-z]", "");
	    System.out.println(a.replaceAll("[a-z]", ""));
	    System.out.println(a.replaceAll("[a-z]", "R"));
	    System.out.println(a.replaceAll("[a-z]", "0"));
	    System.out.println(a.replaceAll("[A-Z]", "@"));
	    
	    
	    
	    String m="Superman";
	    System.out.println(m.matches("a(.*)"));
	    System.out.println(m.matches("s(.*)"));
	    System.out.println(m.matches("S(.*)"));
	    System.out.println(m.matches("(.*)n"));
	    boolean b =m.matches("(.*)per(.*)");
	    System.out.println(b);
	    String y="https://www.youtube.com/shorts/7uSW32FICYs";
	    System.out.println(y.matches("(.*)shorts(.*)"));
	    
	}

}
