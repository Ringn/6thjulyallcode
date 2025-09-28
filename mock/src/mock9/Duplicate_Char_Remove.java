package mock9;

public class Duplicate_Char_Remove {
	public static void main(String[] args) 
	{
		String name="ashvaghosh";
		String result="";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char ab=name.charAt(i);
			if(result.indexOf(ab)==-1)
			{
				result=result+ab;
			}
		}
		System.out.println(result);
	}

}
