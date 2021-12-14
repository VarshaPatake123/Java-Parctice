package OOPsConceptsPart1;

public class MethodOverloading {

	// method having same name but different arguments with different data types in the same class
	public void add()
	{
		int x=10;
		int y=20;
		System.out.println(x+y);
	}
	
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public double add(double x,double y)
	{
		System.out.println(x+y);
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj =new  MethodOverloading();
		obj.add();
		obj.add(10,20);
		obj.add(10.78, 20.32234);
	}

}
