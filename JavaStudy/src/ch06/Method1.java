package ch06;

public class Method1 {
	// ���� �ϳ��� ���� �ϳ��� ������ �� ������ �ƽ�Ű �ڵ�� ���ڸ� ���ϴ� ����� �ϴ� 
	// �޼��带 ����� �ʹ�. 
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
