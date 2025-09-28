package August;

public class Demo1_ReverseString1 
{
	public static void main(String[] args) 
	{
		String s1="VALIDATION";
		String rev = "";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
//		
//		StringBuffer s2 = new StringBuffer("VALIDATION");
//		
//		StringBuffer reverse = s2.reverse();
//		System.out.println(reverse);
	}

}
