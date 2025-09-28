package August;

public class Multilevell {
	public static void main(String[] args) 
	{
		abc a1=new abc();
		a1.add();
		a1.sub();
		a1.mul();
		
	}
}
	class Father
	{
	int a=40;
	int b=20;
	void add()
	{
		System.out.println(a+b);
		
	}
		
	}
	class Son extends Father
	{
		void sub()
		{
			System.out.println(a-b);
			
		}
	}
	class abc extends Son
	{
		void mul()
		{
			System.out.println(a*b);
			
		}
	}



