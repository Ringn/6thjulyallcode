package practice;

public class Abc4 {
	public static void main(String[] args) 
	{
		//we use nested if else when under if block we have again a if block
		//suppose
		//the persons age>18 is applicable to donate blood
		//but ther weight should be greater than 50
		int age=20;
		int weight=55;
		if(age>=20)
		{
			if(weight>=50)
			{
				System.out.println("u can donate blood");
			}
			else
			{
				System.out.println("your weight is less than 50");
			}
		}
		else
		{
			System.out.println("your age is not greater than 18");
		}
		
	}

}
