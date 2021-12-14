package OOPsConceptsPart1;

public class LocalGlobalVariable {
	int i=10;
	
	public void add()
	{
		int x=10;
		int y=20;
		int i=30;
		System.out.println(x+y+i);
	}
	public static void main(String args[])
	{
		LocalGlobalVariable obj =new LocalGlobalVariable();
		obj.add();
	}

}
