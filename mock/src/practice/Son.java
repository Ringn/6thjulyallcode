package practice;

public class Son {
	public static void main(String[] args) 
	{
		int a=60;
		System.out.println(a);
		main("hello");
		main(50);
	}
	public static void main(String arg) 
	{
		System.out.println("dublicate main method with parameter:"+ arg);
	}
	public static void main(int arg) 
	{
		System.out.println("dublicate main method with parameter:"+ arg);
	}

}
