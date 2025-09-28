package abstrc;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) 
	{
		int[] ar= {10,40,30,50,20};
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
