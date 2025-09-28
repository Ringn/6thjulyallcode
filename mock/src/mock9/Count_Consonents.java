package mock9;

public class Count_Consonents {

	//Consonants are the world in alphabet that are not vowels
	public static void main(String[] args) {
		String s1="ashvaghosh";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c>='a'&&c<='z'&& !(c=='a'||c=='e'||c=='i')||c=='o'||c=='u')
			{
				System.out.print(c);
			}
		}
		
	}
}
