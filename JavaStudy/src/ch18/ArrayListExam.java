package ch18;

import java.util.ArrayList;

public class ArrayListExam {
	
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		while (true) {
			int num = (int)(Math.random() * 150);
			lotto.add(num);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
		
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
		
		// �⺻���� ���� �� ����. Integer�� �ٲ�ߵȴ�. 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("sumi");
		String values = (String) list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
		}
		
	}
}