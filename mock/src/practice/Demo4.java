package practice;

public class Demo4 {
	static int a=46;
	public static void m1() 
	{
		System.out.println(a);
	}

	public void m2() 
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		m1();
		Demo4 d4=new Demo4();
		d4.m2();
		Demo5 d5=new Demo5();
		d5.m3();
	}
}
