package ch05;

public class StickExample {

	public static void main(String[] args) {
		
		int[] stick = {5, 4, 4, 2, 2, 8};
		
		while(true) {
			// 1. 0���� ū �迭 ����� ������ ����Ѵ�. 
			int count = 0;
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < stick.length; i++) {
				
				if (stick[i] > 0) {
					// ���� ����
					count++;	
				}
			}
			for (int value : stick) {
				System.out.print(value);
				System.out.print(",");
			}
			System.out.println();
			System.out.println("stick �迭�� ���� 0���� ū �� : " + count);
			
			if (count <= 1) {
				break;
			}
			
			// 2. �迭 ��� �� 0�� �����ϰ� ���� ���� ���� ã�Ƴ���. 
			for (int i = 0; i < stick.length; i++) {
				
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
			// 3. ���� ���� ���� ��� �迭 ����� ���� ���ҽ�Ų��.  
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
			
//			for(int value : stick) {
//				System.out.println(value);
//				}
			}	
	}
}
