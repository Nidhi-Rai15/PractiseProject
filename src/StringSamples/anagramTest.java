package StringSamples;

import java.util.Arrays;

public class anagramTest {

	public static void main(String[] args) {
		String s1 = "Nidhi";
		String s2 = "Hindi";
		
		char[] s1CharArray = s1.toLowerCase().toCharArray();
		char[] s2CharArray = s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1CharArray);
		Arrays.sort(s2CharArray);
		
		if(Arrays.equals(s1CharArray, s2CharArray)) {
			System.out.println("The Strings are Anagram.");
		}
		else {
			System.out.println("The Strings are not Anagram.");
		}
		

	}

}
