package Inheritance;

public class BMW extends Car {
//inheritance - inheritance is implemented in java by creating parent child  so that child class can have access to parent class methos and variable

	
	public void start()
	{
		System.out.println("BMW car started");
	}
	
	public void feul()
	{
		System.out.println("Refill feaul");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BMW b1=new BMW();   //compile time polymorphism
       b1.start();
       b1.stop();
       b1.feul();
       
      Car c1= new BMW();   //run time polymorphism
      c1.start();
      c1.stop();
      
      
     BMW b2= (BMW)new Car();
	}
	
	

}
