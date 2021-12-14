package JavaBasics;

public class ClassesAndObject {

	int bankbalance=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // object is an entity which can have variables and methods in it
		// consider bank as class we can withdrow money from back we can deposite money from bank 
		// thats why we can create withdrow and deposite methods in banck class
		ClassesAndObject obj=new ClassesAndObject();
		obj.withdow(1000);
		obj.deposite(1000);		
	}
	
	public void withdow(int amountToWithdrow)
	{
		bankbalance=bankbalance-amountToWithdrow;
		System.out.println(bankbalance);
	}
	
	public void deposite(int amountToDeposite)
	{
		bankbalance=bankbalance+amountToDeposite;
		System.out.println(bankbalance);
	}

}
