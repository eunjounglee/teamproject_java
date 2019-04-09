package ch04;

public class If {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// a는 10			a는 11이 된다. ++a로 인해. 
		if (a++ == 10 && a == 11) { 
			System.out.println("1번");
		}

		System.out.println("a : " + a);
		// a = 10 	or 은 앞쪽이 만족하면 뒤에를 
		// 실행하지 않는다. 그러므로 ++b가 실행되지 않고
		// 처음 b의 값인 20이 나온다. 
		if (--a == 10 || ++b == 21) {
			System.out.println("2번");
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
