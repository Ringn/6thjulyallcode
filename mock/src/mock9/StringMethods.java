package mock9;

public class StringMethods
{
	//string is a inbuilt class in java.lang package
	//string object creation take place at the time of string declaration and defi
	//we can create string object using new keyword and without new keyword
	//string object are going to get store into string pool are of heaap memory
	//string pool area has two parts 
	//constant pool are:=when we not use new keyword for creating string object
	//then object store into constant pool are
	//duplicta object info is not allowed in constat pool area means if we define two object
	//with same info then this two object will point to same information duplicte info
	//is not allowed
	//non constant string pool area:when we use new keyword for creating the object of 
	//string 
	//duplicate object info is allowed means 
	//if we define two object with same info then it is valid
	
	public static void main(String[] args)
	{
		String s1="ashvaghosh";//without using new key(constant pool)
		//this we can use becuse it save memory
		String s3="ringne";
		String s2=new String("ashvaghosh_is_my_name");//with new keyword(non constant)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----------");
		System.out.println("string methods are following");
		
		System.out.println(s1+" ".concat(s3));
		System.out.println(s1.contains("a"));//case sensitive
		System.out.println(s1.equals(s2));
		System.out.println(s1.length()); 
		String[] ar=s2.split("_"); 
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(s1.substring(3));
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.isEmpty());
}
}
