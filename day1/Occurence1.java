package week1.day1;

public class Occurence1 {
	
	//shortcut for main method is type main and press ctrl + space
	public static void main(String[] args)
	
	{
		String str = "You have no choice other than following me!";
		//Need to find no of 'o' in string
		//Create a counter variable to count the number of 'o'
		
		int count =0;
		
		//converting string into sequence of characters
		
		char[] array = str.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]=='o') {
				count = count+1;
			}
		}
		//Print the value of count
		System.out.println("Occurence of o is "+count);
	}
}
		
	
		
	
	
		 
		
		 
		 
		 
		 
		
		
		
		
	
