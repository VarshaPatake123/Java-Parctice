package JavaPrograms;

public class PrimeNumber {
	//number which can be divisible by 1 and itself
	// i. e. 2 3 7 13
	//every number is divisible by 1 and itself ,if a number is divisible by any other number than this 2 then that is not a prime number
	
	public static  boolean isPrimeNumber(int num)
	{
	   if(num<2)
	   {
		   return false;
	   }
		
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PrimeNumber.isPrimeNumber(11));

	}

}
