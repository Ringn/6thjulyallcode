package practice;

public class Class13 {
	//if constructer is not declared inside the class then at the time of compilation complier will provide the co
	//constructor called as default constructor
	//use to copy all the members of class into object
	//the constructor declared by user is called user defiend constructor
	//1.without parameter
	//2.with parameter
	//use for declaration of non static global variable 
	//use to copy all the members of class into object
	int a,b;//intialization
	Class13()
	{
		a=900;//declaration
		b=800;
	}
	public void m1()
	{
		System.out.println(a+b);
	}
	public void m2() 
	{
		System.out.println(a-b);
	}
	public static void m3()
	{
		//to call the non static variable in satic method we need to create object
		Class13 c13=new Class13();
		System.out.println(c13.b*c13.b);
	}
	public static void main(String[] args)
	{
		Class13 c13=new Class13();
		c13.m1();
		c13.m2();
		m3();
		
	}
	
}
