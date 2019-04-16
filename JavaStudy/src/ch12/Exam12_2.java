package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		String[] files = file.split("/");
		
		for(String f : files) {
			if (!f.equals("")) {
		System.out.println("/" + f);
			}	
		
		}
	}
}


// 공백이 출력된 이유: 제일 앞에 / 가 있기 때문에 /를 공백으로 처리한다. 
// 조건식 처음에 !를 붙이면 'f안에 있는 문자열이 ""가 아니면' 이라는 조건이 됨.