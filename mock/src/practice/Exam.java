package practice;

public class Exam {
	public void m1(int a,int b) 
	{
		int percentage=a+b;
		System.out.println(percentage);
		
	}
	public void m2(String name,int rollno) 
	{
	System.out.println(name);
	System.out.println(rollno);
	}
	public static void main(String[] args)
	{
		Exam e=new Exam();
		e.m1(30,50);
		e.m2("ashvaghosh", 43);
	}

}
