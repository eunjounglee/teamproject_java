package ch12;

public class Exam12_4 {
	
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		int idx = 0;
		
		while (true) {    // idx + 1 에 찾고자하는 문자열 " "이 없으면 
						  // idx에 idx + 1을 더한다. idx는 2가 되었다. 
						  // 반복한다. " "의 위치를 찾을 때까지 
			idx = str.indexOf(" ", idx + 1);
	
			if (idx == -1) {
				System.out.println(str);
				break;
			}
			System.out.println(str.substring(0, idx));
		}
	}
}