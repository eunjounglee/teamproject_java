package ch01;

public class Text {

	public static void main(String[] args) {
		// Unix time 
		System.out.println(System.currentTimeMillis());
		// 0.0 <= X < 1.0 ������ ������ ���ڰ� ���´�. 
		System.out.println(Math.random());
		// 0~6������ ������ ���ڸ� ��Ÿ���� �ʹ�: 6�� ���ϸ� 0 <= X < 6
		System.out.println(Math.random() * 6);
		// ���� ����ȯ: ���� �÷ο�. 
		// �Ҽ����� ���ֱ� ���� (int)�� ����ȯ, �����÷ο찡 �߻���. 
		System.out.println((int)(Math.random() * 6));
		// 0~5������ �ƴ϶� 1~6������ ������ ���ڸ� ������ �ϰ� �ʹ�. 
		System.out.println((int)(Math.random() * 6) + 1);
		
	}

}
