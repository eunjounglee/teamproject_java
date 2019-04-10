package ch07;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Exam7_3 {

	public static void main(String[] args) {
		Class7_3 class2 = new Class7_3();
		
		class2.method1();
	}
}
class Class7_3 {
	int a;
	
	public static void method1() {
		System.out.println("method1 실행 시작");
		Class7_3 class7 = new Class7_3();
		
		for (int i = 0; i < 5; i++) {
			class7.method2();
			
		}
		System.out.println("method1 실행 종료");
	}	
	public void method2() {
		a++;
		System.out.println(a);
	}
		
}