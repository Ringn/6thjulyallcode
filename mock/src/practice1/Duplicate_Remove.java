package practice1;

public class Duplicate_Remove {
	public static void main(String[] args) 
	{
		String name="ashvaghosh";
		String result="";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char c = name.charAt(i);
			
			if(result.indexOf(c)==-1)
			{
				result=result+c;
			}
		}
		System.out.println(result);
		
	}

}
