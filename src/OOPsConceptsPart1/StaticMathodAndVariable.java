package OOPsConceptsPart1;

public class StaticMathodAndVariable {

	
	static String companyName="ABC";
	String empName="Varsha";
	
	public static void getComapnyName()
	{
		System.out.println(companyName);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMathodAndVariable obj=new StaticMathodAndVariable();
		getComapnyName();
		StaticMathodAndVariable.getComapnyName();
		System.out.println(obj.empName);
		StaticMathodAndVariable.companyName="Persistent";
		System.out.println(StaticMathodAndVariable.companyName);
		
	}

}
