package StringSamples;

import java.util.Scanner;

public class palindromeTest {
	String s = "";

	public static void main(String[] args) {
		palindromeTest o = new palindromeTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string that you want to reverse: ");
		o.s = sc.nextLine();
		
		int l = o.s.length();
		String revS = "";
		
		for(int i = l-1; i>=0; i--) {
			char c = o.s.charAt(i);
			revS = revS + c;
		}
		if(o.s.equalsIgnoreCase(revS)) {
			System.out.println("The provided string is a Palindrome");
		}
		else {
			System.out.println("The provided string is not a Palindrome");
		}

	}

}
