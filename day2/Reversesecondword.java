package week1.day2;

public class Reversesecondword {
	
	public static void main(String[] args) {
		
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		//Reverse the second word in sentence
		//iterate and even digit will be reverse looped
		//Declare string array as below
		//String[] splitInput = input.split(" ");
		String[] ss=input.split(" ");
		for (int i = 0; i < ss.length; i++) 
		{
			if(i%2 != 0) //modulus operator used
			{
				StringBuffer buffer = new StringBuffer(ss[i]); //Pass string array as argument
				ss[i] = buffer.reverse().toString(); //buffer is the object
			}
		}
		for (int i = 0; i < ss.length; i++) 
		{
			System.out.print(ss[i]+" ");
		}
	}


	}


