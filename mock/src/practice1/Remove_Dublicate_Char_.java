package practice1;

public class Remove_Dublicate_Char_ {
	public static void main(String[] args) 
	{
		String s1="ashvaghosh";
		
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);
		
		
	}

}
