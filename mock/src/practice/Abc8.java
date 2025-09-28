package practice;

public class Abc8 {
	int a;
	int b;
	Abc8(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		Abc8 a8=new Abc8(40,70);
		
	}
	//we intialize non satic variable value in constructor because we can intialize the value at the time of object or consyrucor calling

}
