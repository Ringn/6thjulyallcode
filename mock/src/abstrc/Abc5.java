package abstrc;

public class Abc5 {
	static int a=40;
	public void name() 
	{
		System.out.println(a);
		Abc6 a6=new Abc6();
		System.out.println(a6.b);
		
	}
	public static void name1() 
	{
		System.out.println(a);

		System.out.println(Abc6.b);
		
	}
	public static void main(String[] args) 
	{
		//there are two types of variable local and global
		//there are two types of global variable
		//1)static 2)non static
		name1();
		Abc5 a5=new Abc5();
		a5.name();
		
		
	}

}
