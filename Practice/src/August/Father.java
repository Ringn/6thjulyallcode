package August;

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

