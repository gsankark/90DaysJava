package week1.day1;

public class Palindrone2 {
	public static void main(String[] args) {
		String str = "malayalam"; // This is immutable create a new memory space
		              //Which will create new memory it will not update in same memory.
		               //Not change the value of string in same memory
		StringBuffer st = new StringBuffer(str);
		// This is mutable. New class. So we are using this. StringBuffer to override this.
		StringBuffer reverse = st.reverse(); // This will not create new memory and it will update in same memory space.
		String rev = reverse.toString();
		if (rev.equals(str)) {
			System.out.println("Palindrome");
		}
			else {
				System.out.println("Not Palindome");
				
		}
	}

}
