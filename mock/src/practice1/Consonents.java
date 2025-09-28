package practice1;

public class Consonents {
	public static void main(String[] args)
	{
		String s1="aeioubc";
		String s2="";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c>='a'& c<='z'&&!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
			{
				count++;
				s2=s2+c;
			}
		}
		System.out.println(count);
		System.out.println(s2);
		
		
	}

}
