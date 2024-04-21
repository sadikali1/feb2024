package array;

public class IntArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; // declaration and initialization
		
		System.out.println(arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int number : arr) {
			System.out.println(number);
		}

	}

}
