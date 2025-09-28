package practice;

public class Method3 {
	public void m1() 
	{
		System.out.println("non static method from same class");
		
	}
	public static void main(String[] args)
	{
		Method3 m3=new Method3();
		m3.m1();
		Method4 m4=new Method4();
		m4.name();
		
	}

}
