package JavaBasics;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if we want to store data in table format in  that case we use 2d array
		
		String i[][]=new String[3][4];
		i[0][0]="A";
		i[0][1]="B";
		i[0][2]="C";
		i[0][3]="D";
		
		i[1][0]="A1";
		i[1][1]="B1";
		i[1][2]="C1";
		i[1][3]="D1";
		
		i[2][0]="A2";
		i[2][1]="B2";
		i[2][2]="C2";
		i[2][3]="D2";
		
		
		for(int x=0;x<i.length;x++)
		{
			for(int y=0;y<i[0].length;y++)
			{
				System.out.println(i[x][y]);
			}
		}

	}

}
