package java_learning;

class Casio1
{
	int num1;
	int num2;
	String operation;
	
	public Casio1()
	{
		 num1=0;
		 num2=0;
		operation="Nothing";
		
	}
	
	public Casio1(int k)
	{
		num1=k;
		num2=0;
		operation="Nothing";
	}
	public Casio1(int k,int l,String op)
	{
		num1=k;
		num2=l;
		operation=op;
	}
}

public class ConstructorOverloading {
	public static void main(String args[])
	{
		Casio1 obj=new Casio1(2,3,"teja");
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);
		
		
	}

}
