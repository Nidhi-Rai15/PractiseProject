package stringBufferMod;

public class stringBufferSampleTest {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.append("I am a String Buffer");
		System.out.println(str);
		int cap = str.capacity();
		System.out.println("Capacity of the string buffer is: " + cap);

	}

}
