package array;

public class StringArrayExample2 {

	public static void main(String[] args) {

		String name = "Java";
		
		String names[] = { "Java", "Python", "Ruby", "JavaScript", "C#" }; // declaration and initialization
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String name1 : names) {
			System.out.println(name1);
		}
		
		System.out.println(names[0]);

	}

}
