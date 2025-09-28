package practice;

public class Class1 {
	public static void main(String[] args) {
		//there are 8 types of primitive datatypes
		//that is byte short int long double float char boolean
		//primitive datatypes also called as keywords 
		//keywords starts with lowercase thats why primitive datatypes strat witrh lowercase
		//size of primitive datatyapes is fixed
		
		byte a=1;
		short b=20;
		int c=30;
		long d=77448385764L;
		float e=77.77F;
		double f=888.888d;
		char g='a';
		boolean h=true;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(e); 
		System.out.println(f); 
		System.out.println(g); 
		System.out.println(h); 
		
		//non primitive
		
		//there are 3 types of non primitive datatypes 
		//that is String , Classname , interface
		//non primitive datatypes also called as identifiers 
		//identifers starts with uppercase thats why
		//non primitive datatypes strats with uppercase
		//size is not fixed
		String name="ashvaghosh";
		System.out.println(name); 
		Class1 c1=new Class1();
		c1.m1();
		
		
		
	}
	public void m1() 
	{
		String name2="swapnil";
		System.out.println(name2); 
		
		
	}

}
