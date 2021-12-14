package JavaBasics;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //store values of similar type
	  //once define array size can not be change
	   //array index start with zero
		
		int i[]=new int[4];                
		i[0]=1;
		i[1]=2;
		System.out.println(i[3]);
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		System.out.println(i[4]);
	}

}
