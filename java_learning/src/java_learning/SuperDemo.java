package java_learning;

class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);    //super class is used to call parameterised constructor 
					//of super class from the sub class
		   			// super class is automatically called by the compiler if there
					//are no parameters
		System.out.println("in B int");
	}
}
public class SuperDemo {
	
		public static void main(String args[])
		{
			B obj = new B(5);
		}
	

}
