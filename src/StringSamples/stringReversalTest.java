package StringSamples;

import java.util.Scanner;

public class stringReversalTest {
	String s = "";
	String revS = "";
	
	public String reversalFunc(String a) {
		for(int i = a.length()-1; i >= 0; i--) {
			char c = a.charAt(i);
			revS = revS + c;
		} 
		return revS;
	}

	public static void main(String[] args) {
		stringReversalTest rt = new stringReversalTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string that you want to reverse: ");
		rt.s = sc.nextLine();
		
		String newVal = rt.reversalFunc(rt.s);
		System.out.println("Reverse string is: " + newVal);
		
		

	}

}
