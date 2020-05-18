package week2.day1;

	import java.util.LinkedHashSet;
	import java.util.Set;

	public class Duplicatechars1 {
	public static void main(String[] args) {
		Set<Character> set = new LinkedHashSet<Character>(); //Set for removing duplicates
		//A collection that contains no duplicate elements. 
		//More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2),
		//and at most one null element. 
		//As implied by its name, this interface models the mathematical set abstraction. 
		
		String str = "When life gives you lemons, make lemonade";
		for (int i = 0; i < str.length(); i++) {
			if(!set.add(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			}
		}
	}
	}


