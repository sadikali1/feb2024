package conditional;

public class NestedLoops {
	
	public static void main(String[] args) {
		
		// outer loop
		for(int i=1; i<=5; i++) {
			
			// inner loop
			for(int j=1; j<=10; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}
		
	}

}
