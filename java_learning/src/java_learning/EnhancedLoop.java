package java_learning;

public class EnhancedLoop {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		for(int k:a)             //1d array
		{
			System.out.print(" "+k);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int d[][]= {
				{1,2,3,4},
				{5,6,7},
				{8,9}
		
					};
		
		for(int i[]:d)
		{
			for(int l:i)
			{
				System.out.print(" "+l);  //2d array
			}
			System.out.println();
		}
		
	}

}
