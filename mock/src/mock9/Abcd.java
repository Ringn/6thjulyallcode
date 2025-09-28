package mock9;

import java.util.Enumeration;
import java.util.Vector;

public class Abcd {
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(101);
		v.add("ashvaghosh");
		v.add(102);
		v.add("swapnil");
		v.add(20.2);
	Enumeration	enu=v.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
		
	}
	
		
	}

}