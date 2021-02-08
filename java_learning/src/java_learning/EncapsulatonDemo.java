//Encapsulation
package java_learning;

class Student1
{
	int RollNo;
	String name;
	
	//Getters and Setters
	public void setRollNo(int r)
	{
		RollNo=r;
	}
	public int getRollNo()
	{
		return RollNo;
	}
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name; 
	}
	
	
	
}

public class EncapsulatonDemo {
	public static void main(String args[])
	{
		Student1 s1= new Student1();
		s1.setRollNo(5);
		s1.setname("teja");
		
		System.out.println("Roll Number is:"+ s1.getRollNo());
		System.out.println("Name is "+ s1.getname());
	}

}
