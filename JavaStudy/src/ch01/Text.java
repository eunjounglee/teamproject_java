package ch01;

public class Text {

	public static void main(String[] args) {
		// Unix time 
		System.out.println(System.currentTimeMillis());
		// 0.0 <= X < 1.0 사의의 랜덤한 숫자가 나온다. 
		System.out.println(Math.random());
		// 0~6까지의 랜덤한 숫자를 나타내고 싶다: 6을 곱하면 0 <= X < 6
		System.out.println(Math.random() * 6);
		// 강제 형변환: 오버 플로우. 
		// 소수점을 없애기 위해 (int)로 형변환, 오버플로우가 발생함. 
		System.out.println((int)(Math.random() * 6));
		// 0~5까지가 아니라 1~6까지의 랜덤한 숫자를 나오게 하고 싶다. 
		System.out.println((int)(Math.random() * 6) + 1);
		
	}

}
