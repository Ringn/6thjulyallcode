package practice;

public class Abc7 {
	//constructor is a speacial member of class
	//constructor dont have return type
	//the class name and constructor name is always same
	//we call constructor at the time of object creation
	//constructor use to copy all the membrs of the class
	//1)constructor with parametr
	//2)constructor without parameter
	//constructor use to initialize non static global variable
	Abc7()//without parametr
	
	{
		System.out.println("hiii");
	}
	Abc7(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Abc7 a7=new Abc7();
		Abc7 a8=new Abc7(20,60);
		
		
	}
	

}
