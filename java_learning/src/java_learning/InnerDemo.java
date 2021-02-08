package java_learning;
/*
 * inner class have
 *   member class
 *   static class
 *   anonymous class
 * 
 * 
 * 
 * 
 */
class outer
{
	static int i;
	public static void show()
	{
		
	}
	
	static class inner
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer obj=new outer();
		obj.show();
		
		outer.inner obj1=new outer.inner();
		obj1.display();
		

	}

}
