package java_learning;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}

}
public class StaticDemo {

	static int i;
	
	public static void main(String[] args) {
		
		i=9;
		System.out.println(i);
		
		Emp teja = new Emp();
		teja.eid = 1 ;
		teja.salary = 5000 ;
		teja.ceo = "Abhi";
		
		Emp naveen = new Emp();
		naveen.eid = 2;
		naveen.salary = 6000;
		naveen.ceo = "Abhi";
		
		naveen.ceo = "kumari";
		
		teja.show();
		naveen.show();
		
	}

}
