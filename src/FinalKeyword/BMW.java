package FinalKeyword;

public class BMW extends FinalMethod{
	public final int wheels=4;
	public void stop()
	{
		System.out.println("stop method in child class");
	}
	
	public void refeul()
	{
		System.out.println("refeul method in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BMW b1=new BMW();  //compile time polymorphism 
    b1.start();
    b1.stop();
    b1.refeul();
    
    FinalMethod m1=new BMW(); //compile time polymorphism
    m1.start();
    m1.stop();
    
    //b1.wheels=2; not allowed
	}

}
