package java_learning;

public class OperatorDemo {
public static void main(String[] args)
{
	int m=2,n=4;
	int r1=m+n;
	int r2=m-n;
	int r3=m*n;
	double r4=(double)m/n;
	int r5=m%n;
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	n+=m;
	System.out.println(n);
	n++;
	System.out.println(n);
	n--;
	n--;
	n+=1;
	System.out.println(n);
//	++n;//pre increment
//  n++;//post increment
	m=++n;
	System.out.println(m);
	System.out.println(n);
	m=n++;
	System.out.println(m);
	System.out.println(n);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}