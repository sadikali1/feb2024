package str;

public class Amstrong {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not a Amstrong number");
		}

	}

}
