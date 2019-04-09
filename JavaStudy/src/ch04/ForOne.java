package ch04;

public class ForOne {

	public static void main(String[] args) {
		int i = 0;
				
		for (; i < 5; i++) {
			System.out.print(i);
		} // for 문이 다 돌고 나서 확인할 수 있는 i의 값은? 
		System.out.println(i); // 5
	}
}
