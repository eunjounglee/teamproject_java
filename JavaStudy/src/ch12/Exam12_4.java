package ch12;

public class Exam12_4 {
	
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		
		int idx = 0;
		
		while (true) {    // idx + 1 �� ã�����ϴ� ���ڿ� " "�� ������ 
						  // idx�� idx + 1�� ���Ѵ�. idx�� 2�� �Ǿ���. 
						  // �ݺ��Ѵ�. " "�� ��ġ�� ã�� ������ 
			idx = str.indexOf(" ", idx + 1);
	
			if (idx == -1) {
				System.out.println(str);
				break;
			}
			System.out.println(str.substring(0, idx));
		}
	}
}