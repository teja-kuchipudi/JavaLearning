package java_learning;

class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(float i,float j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
}

public class MethodOverloading {
	public static void main(String args[])
	{
		Casio obj=new Casio();
		obj.add(5,6);
		obj.add(2.8f, 3.9f);
		obj.add(4,5,8);
	}

}
