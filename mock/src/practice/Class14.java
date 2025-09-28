package practice;

public class Class14 {
	int num1;
	int num2;
	Class14(int a, int b)
	{
		num1=a;
		num2=b;
	}
public void m1() 
{
	System.out.println(num1+num2);
}
public static void main(String[] args) {
	{
		Class14 c14=new Class14(30,70);
		c14.m1();
	}
}
	

}
