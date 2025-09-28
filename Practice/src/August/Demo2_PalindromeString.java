package August;

public class Demo2_PalindromeString 
{
	public static void main(String[] args) 
	{
		String s1 ="mom";
		
		String rev = "";
		
		for(int i=s1.length()-1;i>=0;i--) 
		{
			rev = rev+ s1.charAt(i);
		}
		
		if(rev.equals(s1))
		{
			System.out.println("mom is a palindrome string");
		}
		
	}

}
