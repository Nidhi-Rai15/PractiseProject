package inheritance;

public class animalsTest {

	public static void main(String[] args) {
		dog obj = new dog();
		obj.animalFunc(obj.b);
		obj.animalFunc();
		
		cat obj1 = new cat();
		obj1.animalFunc(obj1.c);
		obj1.catFunc();
		obj1.animalFunc();

	}

}
