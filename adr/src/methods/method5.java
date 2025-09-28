package methods;
import java.util.Scanner;

public class method5 {

	public static void main(String[] args) 
	{
	System.out.println("enter the value of a");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("the value of a is: "+a);
		n1();//static method calling from same class
		method6.n();// static calling from differenty class
		method5 m1=new method5();//non static from same class
		m1.name3();
		method6 m2=new method6();
		m2.name4();
	}
	public static void n1() //static method in same class
	{
		int b;
		System.out.println("enter the value of b");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("the value of b is: "+b);
	}
	
	public void name3() 
	{
		
		String c="Ringne";
		System.out.println(c);
	}
}
