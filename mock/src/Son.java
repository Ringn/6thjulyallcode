
public class Son extends Father {
	public void bike() 
	{
		System.out.println("bike:honda");
	}
	public static void main(String[] args)
	{
		Son s1=new Son();
		s1.home();
		s1.car();
		s1.bike();
		
		
	}

}