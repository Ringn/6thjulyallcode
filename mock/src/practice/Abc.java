package practice;

public class Abc {
	//there are two types of methods main method
	//2)user defined method
	//main method is a starting point of any java program
	//without main method we can,t run any java program
	//JVM tells compiler to check that the main method is present in a class or not
	//user defined method
	//1)static regular method:
	//static means fix we cant change its declaration 
	//we can call satic method directly using method name
	//if the main method is in different class then classname.method name
	//2)non static regular method
	//non static method is a method which is not fix 
	//and we have to create the object of a class to call the non static metrhods
	public static void name() 
	{
		
	}
	public void name1() 
	{
		
		
	}
	public static void main(String[] args) 
	{
		name();
		Abc a=new Abc();
		a.name1();
		
		
	}

}
