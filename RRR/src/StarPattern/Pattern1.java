package StarPattern;

public class Pattern1 {
	public static void main(String[] args) 
	{
	
        //******
        // *****
        //  ****
        //   ***
        //    **
        //     *
	
		int col=5;
		int space=0;
       for(int i=1;i<=6;i++)
       {
    	   for(int k=1;k<=space;k++)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=col;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   
    	   space=space+1;
    	   col=col-1;
    	   System.out.println();
       }
    }
}


