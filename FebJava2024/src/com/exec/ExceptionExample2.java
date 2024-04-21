package com.exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {

		File myObj = new File("filename.txt");
		Scanner myReader = null;
		try {
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			myReader.close();
		}
		

	}

}
