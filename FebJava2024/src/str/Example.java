package str;

public class Example {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.hashCode());
		
		str = str + " World";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		String str1 = "Hello";
		System.out.println(str1.hashCode());
	}

}
