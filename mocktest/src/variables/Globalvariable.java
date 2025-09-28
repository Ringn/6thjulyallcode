package variables;

public class Globalvariable {
	int a=20;//non satic global variable
	static int b=40;//static global variable
	public void name()
	{
		int c=50;//local variable
		
	}
	public static void main(String[] args)
	{
		Globalvariable g1=new Globalvariable();
		System.out.println(g1.a);
		System.out.println(b);
	}

}
