package java_learning;

public class JumpDemo //break and continue statements
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i>=7)
			{
				break;//continue;
			}
			System.out.println("value is " + i);
		}
	}
}
