package java_learning;

class Calculator
{
	//public int add(int i,int j)
	public int add(int ... n)  // variable length arguments
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		System.out.println(obj.add(1,2,56,94,63,83,59));

	}

}
