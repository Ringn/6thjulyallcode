package practice1;

import java.util.Arrays;

public class Anagram_String {
	public static void main(String[] args) 
	{
		//anagram means two string having same length with same letters
		//but order of leters might be different
		//exam 1.silent=listen
		
		//1.first check the length of two string
		String s1="listen";
		String s2="silent";
		
		
		if(s1.length()==s2.length())
		{
			//2. convert string into char array
			//because string objects are immutable means their charecter canot be
			//arranged directly
			char[] cr=s1.toCharArray();
			char[] cr1=s1.toCharArray();
			Arrays.sort(cr);
			System.out.println(cr);
			Arrays.sort(cr1);
			System.out.println(cr1);
			Arrays.equals(cr, cr1);
			if(Arrays.equals(cr, cr1))
			{
				System.out.println("string are anagrams");
			}
			else
			{
				System.out.println("not anagrams");
			}
			
		}
	
		
	}

}
