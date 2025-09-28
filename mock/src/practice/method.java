package practice;

public class method {
	//there are two types of method 
	//main method
	//regular method
	//main method:= main method is a starting point of any java program
	//without ,main method we cant run any java program
	//regular method:=
	//there are two types of regular method static and non static
	//static method is a fixed method
	//we can directly call the static method using there name in main method
	//non static method is a variable method 
	//we can directly call the static method in main method
	//we have to create the object of class to call the non static method
	
	private static void m1(int a,int b) 
	{
		System.out.println(a+b);
		System.out.println("static method in same class");
		
	}
	public static void main(String[] args) 
	{
		m1(40,80);
		Method2.m2(60,80);
		
	}

}
