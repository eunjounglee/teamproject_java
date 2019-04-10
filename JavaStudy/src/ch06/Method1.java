package ch06;

public class Method1 {
	// 문자 하나와 숫자 하나를 넣으면 그 문자의 아스키 코드와 숫자를 더하는 기능을 하는 
	// 메서드를 만들고 싶다. 
	public static char sum(int a, char c) {
//		System.out.println(2);
		
		char trans = (char)(c + a); // c + 2
//		System.out.println(trans);
		
		return trans;
	}
	
	public static void main(String[] args) {
//		System.out.println(1);
//		
//		System.out.println(3);
		
		System.out.println(sum(2, 'f'));
		System.out.println(sum(2, 'm'));
		System.out.println(sum(2, 'n'));
		System.out.println(sum(2, 'c'));
	
	
	}

}
