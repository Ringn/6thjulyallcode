package practice;

public class Class10 {
	//there are two types of variable 
	//1.local
	//2.global
	//the variable declared within method is called local variable
	//the variable we can use only within that method only
	
	public void m1() 
	{
		int a;//local vaiable
		a=30;
		System.out.println(a);
		
	}
	public static void main(String[] args)
	{
		Class10 c10=new Class10();
		c10.m1();
	}

}
