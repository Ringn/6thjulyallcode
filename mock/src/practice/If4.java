package practice;

public class If4 
{
	public static void main(String[] args) 
	{int a=23;
		if(a%2==0)
		{
			System.out.println("even");
			
			if(a%6==0)
			{
				System.out.println("the numer is divisible by 6");
			}
			else
			{
				
				System.out.println("the numer is not divi by 6");
			}
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
