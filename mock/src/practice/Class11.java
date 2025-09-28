package practice;

public class Class11 {
	//the variable declared outside the method body is called global variable
	//we can use the global variable throught the class
	//there are 2 types of global variable
	//1.static global 2. non static global
	static int a=100;
	static int b=900;
	//static global variable we can call directly using there name in 
	//both static and non staic regular method
	
	
	//non static global variable we can call directly only in a non staic method 
	//beacse there type is same
	//and in static method we have to create o bject and using that object we can call the variable
	int d=300;//non staic global variable
	public static void m1() 
	{
		System.out.println(a+" ststic variable call in static method");
		//we have to create a object of the calss in static method to call the non static global variable in static regular method
		Class11 c11=new Class11();
				System.out.println(c11.d+" non static variable call in static method");
	}
	public void m2() 
	{
		System.out.println(b+ " static variable in non staitic method");
		System.out.println(d+ " non staic variable call in non static method");
	}
	public static void main(String[] args) 
	{
		m1();
		Class11 c11=new Class11();
		c11.m2();
		System.out.println(Class12.c+" different class staic variable");
		Class12 c12=new Class12();
		System.out.println(c12.e+" different class nonstaic variable call");
		
	}

}
