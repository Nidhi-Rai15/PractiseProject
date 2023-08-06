package StringSamples;

public class noOfCharTest {

	public static void main(String[] args) {
		String s = "The Indian State of Maharashatra";
		char alpabetInQuestion = 'a';
		int counter = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c==alpabetInQuestion) {
				counter++;
			}
		}
		System.out.println("No Of 'A' in the given sentence is equal to: " + counter);

	}

}
