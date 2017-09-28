package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		input.close();

		if(isaPalindrome(s))
			System.out.print("This is a palindrome");
		else
			System.out.print("This is not a palindrome");

	}
	
	public static boolean isaPalindrome(String str)
	{	
		
		if(str.length()==0 || str.length()==1)
			return false;
		
		if(str.charAt(0)==(str.charAt(str.length()-1)))
			isaPalindrome(str.substring(1, str.length()-1));
		else
			return false;
		
	return true;
	}//end method

}//end class
