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


// ������ ��µ� ����: ���� �տ� / �� �ֱ� ������ /�� �������� ó���Ѵ�. 
// ���ǽ� ó���� !�� ���̸� 'f�ȿ� �ִ� ���ڿ��� ""�� �ƴϸ�' �̶�� ������ ��.