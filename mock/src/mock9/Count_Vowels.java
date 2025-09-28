package mock9;

public class Count_Vowels {
	public static void main(String[] args) 
	{
		String name="aeioui";
		
		String vowels="";
         int count=0;
         for(int i=0; i<=name.length()-1;i++)
         {
        	 char n=name.charAt(i);
        	
        	 if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
        	 {
        		 count++;
        		 
        	 }
        	 
        	 
       
        	
         }
         System.out.println(count);
         

}
}