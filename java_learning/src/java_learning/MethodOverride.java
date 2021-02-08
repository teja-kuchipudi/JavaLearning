package java_learning;

class A1
{
	public void show()
	{
		System.out.println("A");
	}
}
class B1 extends A1
{
	@Override
	public void show()
	{
		super.show();  // to call both the show from classes A and B
		
		
		System.out.println("B");
	}
}
class C extends A1
{
	public void show()
	{
		System.out.println("in c");
	}
}

public class MethodOverride {
//compile time and runtime polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new B1();//runtime polymorphism
		obj.show();
		
		obj = new C();//Dynamic method dispatch
		obj.show();

	}

}
