
public class Vowels {
	public static void main(String[] args) 
	{
		String s1="ashvaghosh";
		int bcount=0;
		int ccount=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c = s1.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				bcount++;
			}
			else if(c>='a'&c<='z')
			{
				ccount++;
			}
		}
		System.out.println(bcount);
		System.out.println(ccount);
		
	}

}
