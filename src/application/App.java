package application;

public class App {

	public static void main(String[] args) {

		int value1 = 4;
		int value2 = 3;

		if (value1 != value2) {
			System.out.println("Values are not equal.");
		}
		// != is a binary operator that outputs a boolean
		
		String fruit1 = "orange";
		String fruit2 = "apple";
		
		if(!fruit1.equals(fruit2)) {
			System.out.println("Fruits are not the same.");
		}
		// can't use != for string comparison
		
		// can also use this format
		// but it's confusing
		if(fruit1.equals(fruit2) != true)  {
			System.out.println("Fruits are not the same.");
		}
	}

}