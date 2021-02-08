package java_learning;

public class TwoD_Array {

	public static void main(String[] args) {
		
		int d[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		
		{
			System.out.println();
			System.out.println();
			
			
		}
			
		int k[][]= {
				{1,2,3},
				{1,2,3,4},    //jagged array
				{1,2}
		};
		
		for (int l=0;l<k.length;l++)
		{
			
				for(int m=0;m<k[l].length;m++)
				{
					System.out.print(" "+k[l][m]);
				}
				System.out.println();
					
			
		}
		
		
		
		
		
	}

}
