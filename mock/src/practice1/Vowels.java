package practice1;

public class Vowels {
	public static void main(String[] args)
	{
		String s1="aeiou";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c=='a'||c=='a'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
