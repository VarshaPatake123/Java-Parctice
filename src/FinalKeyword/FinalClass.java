package FinalKeyword;

public final class FinalClass {
	
	// we make class as final we can not create subclass of that class 
	// no other class can extend final class

	public void sum()
	{
		int a=3;
		int b=7;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass obj =new FinalClass();
		obj.sum();
	}

}
