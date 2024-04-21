package conditional;

public class NestedIfElse {

	public static void main(String[] args) {

		int age = 20;
		int weight = 55;
		
		if(age > 18) {
			if(weight > 50) {
				System.out.println("He is eligible for the blood donation");
			}else {
				System.out.println("he is not eligible for the blood donation");
			}
		}
		else {
			System.out.println("He is not eligible for the blood donation");
		}

	}

}
