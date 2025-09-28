
public class Array1 {
	public static void main(String[] args)
	{
		String[] ar=new String[5];
		ar[0]="ashvaghosh";
		ar[1]="kiran";
		ar[2]="rishikesh";
		ar[3]="akash";
		ar[4]="swapnil";
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-------reverse order--------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
