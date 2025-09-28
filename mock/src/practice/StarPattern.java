package practice;

public class StarPattern {
	//*
	//**
	//***
	//****
	//*****
	
	public static void main(String[] args) 
	{ int count=1;
		for(int i=1;i<=5;i++)//outer for loop row
		{
			
			for(int j=1;j<=count;j++)//inner for loop column
			{
				System.out.print("*");
				
			}
			count++;
			
			System.out.println();
		
		}
		
		
		
		
		
	}

}
