package methods;
import java.util.Scanner;

public class method1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.println("select 1 for addition, 2 for substarction, 3 for multiplication, 4 for division");
		int c =s.nextInt();
		if(c==1) 
		{
			int addition=a+b;
			System.out.println("addition is: "+addition);
			
		}
		else if (c==2) 
		{
			int substraction=a-b;
			System.out.println("substraction is: "+substraction);
			
		}
		else if (c==3) 
		{
			int multiplication=a*b;
			System.out.println("multiplication is: "+multiplication);
			
		}
		else if (c==4) 
		{
			int division=a/b;
			System.out.println("division is: "+division);
			
		}
		else 
		{
			System.out.println("please select other option(1 to 4)");
		}


		
	
		
	}
}
