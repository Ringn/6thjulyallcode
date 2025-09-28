package practice;

public class primeornot {
	public static void main(String[] args)
	{
		int a=13;
		int count=0;
		
		for(int i=1;i<=13;i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==2)
		{
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("the number is not prime");
		}
		
	}

}
