package str;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "QA";
		String str1 = "QA";
		String str2 = new String("QA");
		
		System.out.println(str.equals(str1));
		System.out.println(str == str1);
		
		System.out.println(str.equals(str2));
		System.out.println(str == str2);
		
		System.out.println(str.equalsIgnoreCase("qa"));
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		
		str = str.concat(" Automation");
		//System.out.println(str.concat(" Automation"));
		String str3 = "QA Automation Testing";
		System.out.println(str3.contains("Automation1"));
		System.out.println(str3.startsWith("QC"));
		System.out.println(str3.endsWith("Testing"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		String str4 = "			QA Automation Testing		";
		System.out.println(str4);

		System.out.println(str4.trim());
		String str5 = " ";
		System.out.println(str5.isBlank());
		System.out.println(str5.isEmpty());

	}


	// literal 
}
