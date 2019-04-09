package ch05;

public class ArrayExam4 {
	
	public static void main(String[] args) {
		
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		char temp = ' ';
							// 5개가 들어있다. 1씩 작아짐. 
		for (int i = 0; i < chars.length - 1; i++) {
									// 5개가 들어있다. 
			for (int j = i + 1; j < chars.length; j++) {
						// b vs. e :  e가 더 크다.
						// b vs. z :  z가 더 크다. 
						// b vs. a :  'b'가 더 크다.
				if (chars[i] > chars[j]) {
					temp = chars[i]; 		// temp = b;
					chars[i] = chars[j]; 	// b = a; 
					chars[j] = temp;		// a = temp;
				}
			}
		}
		System.out.println(chars);
	}
}