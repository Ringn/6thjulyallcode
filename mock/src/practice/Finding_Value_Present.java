package practice;

public class Finding_Value_Present 
{
	public static void main(String[] args)
	
	{
		System.out.println("hiii");
		String[] arr1= {"a=2","b=2"};
		String[] arr2= {"a=2","c=3"};
		//print the b value
		for(int i=0;i<arr1.length;i++)//first array
		{
			boolean found=false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					found=true;//found in second array
					break;
				}
			}
			if(!found)
			{
				System.out.println("value not in second array:"+arr1[i]);
			}
		}
		
		
		
	}

}
