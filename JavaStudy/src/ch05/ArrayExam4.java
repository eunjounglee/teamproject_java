package ch05;

public class ArrayExam4 {
	
	public static void main(String[] args) {
		
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		char temp = ' ';
							// 5���� ����ִ�. 1�� �۾���. 
		for (int i = 0; i < chars.length - 1; i++) {
									// 5���� ����ִ�. 
			for (int j = i + 1; j < chars.length; j++) {
						// b vs. e :  e�� �� ũ��.
						// b vs. z :  z�� �� ũ��. 
						// b vs. a :  'b'�� �� ũ��.
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