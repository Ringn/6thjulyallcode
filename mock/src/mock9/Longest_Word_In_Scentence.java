package mock9;

public class Longest_Word_In_Scentence {

	public static void main(String[] args) 
	{
		String s1="ashvaghosh deepak ringne";
		
		String[] arr=s1.split(" ");
		System.out.println(arr[0]);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(	arr[i].length());
		}
		
	}
}
