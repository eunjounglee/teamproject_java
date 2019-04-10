package ch12;

class IndexOf {
	
	public static void main(String args[]) {
		String str = " Java 개발자 양성을 통한 취업연계과정!!";
		int idx = -1;
		
//		int idx = str.indexOf(" ");
		
		int count = 0;
		while (true) {
			count++;
			idx = str.indexOf(" ", idx + 1);
				
			if (idx == -1) {
				break;
			}
			System.out.println(idx);
		}
		System.out.println("총 " + count + "번 만에 작업이 종료되었습니다.");
	}
}