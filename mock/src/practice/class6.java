package practice;

public class class6 {
	public static void main(String[] args) 
	{
		//when we have more than one condition to be satisfied then we use else if 
		
		int marks=60;
		if(marks>=75)
		{
			System.out.println("pass with distiction");
		}
		else if(marks>=60 && marks<=74)
		{
			System.out.println("pass with first class");
		}
		else if(marks>=35 && marks<=59 )
		{
			System.out.println("pass second class");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
