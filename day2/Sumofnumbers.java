package week1.day2;

public class Sumofnumbers {
	
	// Java program to find the sum of given numbers
	
	public static void main(String[] args) {
		
      String str = "asdf1qwer9as8d7";
      
       System.out.println("The exact value:"+str);
		
		str = str.replaceAll("\\D", ""); //Use Regular expression. Replace all non numeric to null
		
		System.out.println("After conversion:" +str);
		
		int intNumber = Integer.parseInt(str);
		//int intNumber = str -Type mismatch cannot convert string to int 
		//Integer.parseInt(): While operating upon strings, there are times when we need to convert a number represented as a string into an integer type. 
		//The method generally used to convert String to Integer in Java is parseInt().
		//This method belongs to Integer class in java.lang package.
		//It takes a valid string as a parameter and parses it into primitive data type int. It only accepts String as a parameter and on passing values of any other data type
		//The Integer class wraps a value of the primitive type int in an object.
		// Integer.parseInt() returns a primitive int.
		//Integer is Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)
		//https://www.w3schools.com/java/java_wrapper_classes.asp
		
		//methods convert the string into its integer equivalent
		
		System.out.println("Check after after parseint:" +intNumber);
		
		int sum = 0;
		
		while(intNumber>0)
		{
			int rem = intNumber%10; //Modulus
			intNumber = intNumber/10; //Remainder
			sum = sum+rem;
		}
		
		System.out.println("Sum of numbers = "+sum);
	}
	}
	


