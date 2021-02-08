package java_learning;

class student
{
	int rollno;
	String name;
}
public class ArrayDemo {

	public static void main(String[] args) {
		
		/*students[]=new int[5]; when values are unknown
	      or this one   int students[]= {23,24,25,26,28};
		
		
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[4]);
		System.out.println(students[3]);*/
	
		
		int student[]= {23,24,25,26,27};
		System.out.println(student[0]);//normal method to print array elements
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student[3]);
		System.out.println(student[4]);
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println(student[i]);/*thus we can print a array
											elements through for loop*/
			
		}
		
	}

}
