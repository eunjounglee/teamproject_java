package ch15;

import java.io.File;
import java.io.IOException;

public class ExceptionExam1 {
	public static void main(String[] args) {
	
		try {
			String numStr = " 123";
			int num1 = Integer.parseInt(numStr); // NumberFormatException
			new File("").createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch(NumberFormatException a) {
			a.printStackTrace();
		} catch(Exception a) {
			a.printStackTrace();
		} finally {
			
		}
				
		try {
		Object obj = new String("a");
		int a = (Integer) obj; // ClassCastException
		} catch (ClassCastException a) {
			System.out.println("에외 발생");
		}
	}
}