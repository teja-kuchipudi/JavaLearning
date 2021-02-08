package java_learning;

class Calci
{
	int num1;
	int num2;
	int result;
	
	public Calci(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;   ///this is a current instance
		
	}
	
	public Calci()
	{
		num1=5;
		num2=5;   //default constructor
		System.out.println("constructor");
	}
	public Calci(int i)
	
	{
		num1=i;  
		num2=i;    //with parameters
	}
	public Calci(double d,int k)
	{
		num1=(int)d;
		num2=k;
	}
}




public class Constructordemo {
	public static void main(String args[]) {
		
		Calci obj=new Calci(2.9,8); //constructor    calls the constructor ith parameters
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
