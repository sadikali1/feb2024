package array;

public class ArrayExample {

	public static void main(String[] args) {
		int a = 10;
		String name = "Java";

		int arr[] = new int[5]; // declaration
		arr[0] = 10; // initialization
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// arr[5] = 60;
		
		System.out.println(arr[0]);
		
		long phoneNumer[] = new long[10]; // declaration
		phoneNumer[0] = 1234567890L; // initialization
		phoneNumer[1] = 2345678901L;
		phoneNumer[2] = 3456789012L;
		phoneNumer[3] = 4567890123L;
		phoneNumer[4] = 5678901234L;
		phoneNumer[5] = 6789012345L;
		phoneNumer[6] = 7890123456L;
		phoneNumer[7] = 8901234567L;
		phoneNumer[8] = 9012345678L;
		phoneNumer[9] = 1234567890L;
			
		System.out.println(phoneNumer[0]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
				
		for (int i = 0; i < phoneNumer.length; i++) {
			System.out.println(phoneNumer[i]);
		}
		
		for (int number : arr) {
			System.out.println(number);
		}
		
		for (long number : phoneNumer) {
			System.out.println(number);
		}
		
	}

}
