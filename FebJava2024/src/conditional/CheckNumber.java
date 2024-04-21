package conditional;

public class CheckNumber {

	public static void main(String[] args) {
		int a = 21;
		
		if(a%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd Number");
		}
		System.out.println("Done");
		
		int b = 30;
		int c = 40;
		
		if(b>c) {
			System.out.println("B is greather than C");
		}else {
			System.out.println("C is greather than B");
		}

	}

}
