package stringBuilderMod;

public class stringBuilderSampleTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Apple");
		System.out.println(str);
		str.append("_a");
		
		System.out.println(str);
		System.out.println("Capacity of the string builder is : " + str.capacity());

	}

}
