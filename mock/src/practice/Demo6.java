package practice;

public class Demo6 {
	int a=80;
	public static void m1() 
	{Demo6 d6=new Demo6();
		System.out.println(d6.a);
		Demo7 d7=new Demo7();
		System.out.println(d7.c);
	}
	public void m2()
	{
		System.out.println(a);
		Demo7 d7=new Demo7();
		System.out.println(d7.c);
	}
	public static void main(String[] args)
	{
		
		Demo6 d6=new Demo6();
		Demo7 d7=new Demo7();
		
		m1();
		d6.m2();
	}

}
