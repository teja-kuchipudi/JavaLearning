package java_learning;

class Calculator1
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class CalcAdv extends Calculator1  //Single Inheritance
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class CalcAdv1 extends CalcAdv  //Multi level inheritance
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalcAdv1 obj=new CalcAdv1();
		
		int result=obj.add(2, 3);
		int result1=obj.sub(2, 3);
		int result2=obj.mul(2, 3);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}

}
