package practice;

public class Exam2 extends Exam
{

	public void marks() 
	{
		System.out.println("marks per subject more than 75");
	}
	public void m1(int a)
	{
		
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Exam2 e2=new Exam2();
		e2.marks();
		e2.m1(20);
	}
	
}
