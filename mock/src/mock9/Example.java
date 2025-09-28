package mock9;

public class Example {
	public static void m1(int a,int b) 
	{
		System.out.println(a+b);
	}
	public static int m1(int d) 
	{
		System.out.println(d);
		return d;
	}
	
	public static void main(String[] args)
	
	{
		m1(90,90);
		m1(70);
		Example e=new Example();
//		e.m1(45,45);
//		e.m1(30);
//		variables:= variables is used to store the data so that we can
//				    later use that in a program
//				    
//	    data types:=data types means type of data a variable can store
//	                there a 2 types of data type that is primitive and non primitive
//	                1)primitive datatyapes are the keywords always start with lower case
//                    size is fixed
//                   types:byte short int long float double char boolean
//                   2)non primitive datatypes are the operators starts with uppercase
//		             size is fixed
//		             types:=string classname interface
//		methods:= methods means block of code which runs when it is runs
//				there are two type of methods
//				1)main method:=main method is a starting point of any java program
//				without main method we cant run any java program
//				first jvm tells compiler to go and search for the main method in a program
//				if present then execute it.
//				2)regular method:=also called as user defined methods have two types
//				static regular method non static regular method
//				1)static regular method:=a method with static keyword called as static method
//				we can call static method without creating the object of class that the resons that 
//				main method is staic 
//		        non static:=we have to create the object of class to call the non static method
//		        and method with same name but with diff paramater is called method overloading
//		        
//		       can we overload main method :=yes
//		       can we overload static method:=yes
//		       can we overload non satic method:=yes
//		       if we chage the return type then it will overload or not:=no
		
//		
////		 if else:=we use if else statement when we have specific condition and based on that con
		  ///****   dition we have to execute the code
		     
	//	     we cant execute the else block without if
		
//		else if():= when we have multiple condition and from that we have to excute only one based on condition
		
//		nested if():= if under anoter if is called nested if       
//                     ex.:=if the age is > 20 then eligible to donate
		          //          another if weight>50 then only eligible
//		        	********//	
//		loops:- we use loops to run the particular code again and again
		//1)for loop:= in for loop first we have to intialize a variable then we have to give condition
		//and then increement or degreement operator.
//		2)while loop:- the diff between while and for loop is first we have to give
		//condition in while paranthesis and code in block and in last increment or degreement op
		
		//3)do while;-first we write the code in do block and in last we give ++ or --
		//then in last we give while condition
		//do while loop run at least one even if the con is false
		
		
		
		//variables:=there are two types of variable local and global
		//local:=the variable declared inside method or block is called local variable scope of local 
		//variable is within the method only
		//global:static:=the variable declared outside the method but within a class 
		//with static is called static variable scope is within the class
		//we can directly call in both static and non static method in same class
		//diff class:=class name.variable name
		//non static:= we can call the non static var in static methods directly
		//but in static method we have to crete the object of class to call the variable 
//                 
////		             
		
	}

}
