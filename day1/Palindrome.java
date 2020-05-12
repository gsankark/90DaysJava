package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		//String str = "malayalam";
		String str = "Testleaf";
		//create empty string to store the reverse value
		String rev = "";
		//Iterate over original string in reverse order
		for (int i = str.length()-1; i>=0; i--) {
			rev +=str.charAt(i);
		}
		System.out.println(str.equals(rev)?"Yes, Palindrome":"No, Not a Palindrome");
		//use Ternatory operator
	}
}
