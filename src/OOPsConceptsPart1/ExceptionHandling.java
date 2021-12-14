package OOPsConceptsPart1;

public class ExceptionHandling {
//errors (syntax errors,compile time errors )
//syntax error -	; not present at the end of line
//compile time error -same variable is define 2 times in same scope/method

//run time error are unknown errors also called as exceptions i.e divide by zero error ,file not found ,array index out of bound,null pointer exception 	
//when an exception occur in our program program will terminate and not execute subsequent lines of code 
//we can handle exceptions using try catch block and so that because of of exception our program will not terminate directly 
	
//throws keyword will just transfer exception from one method to other ,it will not handle it,at the end it will cause your program to be terminated when you call method which is throwing an exception and will not execute subsqent lines of code
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionHandling obj =new ExceptionHandling();
		obj.custumException();
		obj.getArrayValues();
		obj.div();

	}
	
	
	public void div()
	{
		int a=10;
		int b=0;
		int result;
		try {
	    result =a/b;
		System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		b=5;
		result=a/b;
		System.out.println(result);
	}
	
	
	public void getArrayValues()throws Exception
	{
		int a[]=new int[2];
		a[0]=2;
		a[1]=4;
		
		System.out.println(a[3]);
		
	}
	
	public void custumException() throws Exception
	{
		throw new Exception("user define exception");
	}

}
