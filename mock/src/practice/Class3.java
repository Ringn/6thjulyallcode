package practice;

public class Class3 {
	public static void main(String[] args) 
	{
		 //methad is a block of code use to do a specific task or perform certain action
		//methoda also called as functions
		//there are 2 types of method 
		//main method and regular method
		//regular method also have two types static and non staic regular
		//main method is a starting point of any java program witout main method we cant run any java program
		//
		int a=40;
		System.out.println(a);
		m1();
	}
	public static void m1() 
	{
		//static regular method we can identify using Static word
		//static regular method we can directly call using method name in a main method
		//static means copy of the class 
		String name="ashvaghosh";
		System.out.println(name); 
		Class3 c3=new Class3();//
		c3.m2();
		Class4.m3();
		Class4 c4=new Class4();
		c4.m4();
		
	}
	public void m2() 
	{
		//non staic regular method we can identify if there is no static word the it is non staic method
		//we cant direcly call the non sattic regular method directly in a main method first we need
		//to create the object of the class then using oblect name we can call the method
		float per=88.88f;
		System.out.println(per); 
		
	}

}
