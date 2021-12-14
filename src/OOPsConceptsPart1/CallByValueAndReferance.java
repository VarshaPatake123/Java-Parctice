package OOPsConceptsPart1;

public class CallByValueAndReferance {
//call by value-passing copy of variables as an argument to method, if any changes happens in method on those copy actual variable will not have any impact on that variable values
//call by reference-passing reference of actual values as an argument , if we perform any operation on those variable in method suppose we perform swap operation then actual values of variable will have an impact of this operation	
	int a1,a2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndReferance obj =new CallByValueAndReferance();
		int a=10;
		int b=20;
		obj.add(a, b);
		System.out.println(a+"\n"+b);
		obj.a1=30;
		obj.a2=50;
		obj.swap(obj);
		System.out.println(obj.a1+"\n"+obj.a2);
		
	}
	
	public void add(int x,int y)
	{
		x=20;
		y=30;
		System.out.println(x+y);
	}
	
	public void swap(CallByValueAndReferance t)
	{
		int temp=t.a1;
		t.a1=t.a2;
		t.a2=temp;
	}

}
