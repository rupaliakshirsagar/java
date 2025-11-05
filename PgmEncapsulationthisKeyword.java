package moduleprogram;

public class PgmEncapsulationthisKeyword {

//	public class Cal
	
		private int age=50;
	
	 public void getAge()
	{
		
	}
	 public void setAge(int age)
	{
		 this.age = age;
	}
	
	public static void main(String[] args) {
		
	
		PgmEncapsulationthisKeyword variable = new PgmEncapsulationthisKeyword();
		variable.setAge(80);
		System.out.println(variable.age);
		

	}
	
//		int empid=19;
//		double salary=33000.3;
//		String name="ram";
//
//		void employeeDetails(int empid,double salary,String name)
//		{
//			System.out.println(empid+" "+ + salary+" "+ name);
//			System.out.println(this.empid+" "+ + this.salary+" "+ this.name);
//		}
//		public static void main(String[] args) 
//		{
//			PgmEncapsulationthisKeyword t1=new PgmEncapsulationthisKeyword();
//			t1.employeeDetails(100, 21.2, "laxman");
//			System.out.println("\n" + t1.empid);
//			System.out.println(t1.name);
//			System.out.println(t1.salary);	

			
		}
	



