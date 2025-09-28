package practice;

import java.util.Arrays;


public class Array1 {
	public static void main(String[] args) 
	{
		int[] ar=new int[5];
		ar[0]=30;
		ar[1]=50;
		ar[2]=80;
		ar[3]=10;
		ar[4]=40;
		System.out.println(ar[0]);
		System.out.println(ar.length);
		Arrays.sort(ar);
		System.out.println(ar[0]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
