package practice;

public class Prime {
	public static void main(String[] args)
	{
		//if the number is divisble by 1 and only that number and remender is 0 then
		//that is prime nuber
//		int a=9;
//		int count=0;
//		for(int i=1;i<=a;i++)
//		{
//			if(a%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("number is prime");
//		}
//		else
//		{
//			System.out.println("not prime");
//		}
		
		//calucalate how many prime nubers is present between 1 to 10
		
		int a=0;
		for(int i=1;i<=10;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				a++;
				
			}
		}
		System.out.println(a);
		
	}

}
