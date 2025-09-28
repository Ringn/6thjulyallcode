package practice;

public class Demo35 {
	public static void main(String[] args) 
	{
		int num=3;
		int count=0;
		for(int i=1;i<=num;i++)
		{        
			if(num%i==0)
			{
				count++;
			}
			
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
