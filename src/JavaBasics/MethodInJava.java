package JavaBasics;

public class MethodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInJava obj =new MethodInJava();
		obj.add();
		System.out.println(obj.sub());
		obj.multi(4, 8);
		System.out.println(obj.div(13, 8));
		
		
	}
//method which doen't return any value
public void add()
{
	int a=10;
	int b=20;
	System.out.println(a+b);
}

//method which returns some value
public int sub()
{
	int a=10;
	int b=20;
	
	return a-b;
}
	
//method with parameter
	public  void multi(int x,int y)
	{
		System.out.println(x*y);
	}
	
//method with parameter and which also return some value
	public int div(int x,int y)
	{
		return x/y;
	}
}
