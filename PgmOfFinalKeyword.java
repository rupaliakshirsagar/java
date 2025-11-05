package moduleprogram;

public class PgmOfFinalKeyword {
	final int s=399;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PgmOfFinalKeyword f=new PgmOfFinalKeyword();
		System.out.println(f.s);
		//s=44;//cant change the value of final variable
		
		final String t="rrrr";
		//f="hhh";//Cant change the value as its final 
		System.out.println(t);
		String l="pppp";
		l="kkkk";
		System.out.println(l);

	}

}
