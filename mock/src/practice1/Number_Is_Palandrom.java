package practice1;

public class Number_Is_Palandrom {
	public static void main(String[] args)
	{
		String num="12121";
		
		String rev="";
		
		for(int i=num.length()-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
			
		}
		
		if(num.equals(rev))
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
