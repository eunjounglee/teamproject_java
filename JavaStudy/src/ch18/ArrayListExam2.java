package ch18;

import java.util.ArrayList;

public class ArrayListExam2 {
	
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
		
		System.out.println(value);
		// �⺻���� ���� �� ����. Integer�� �ٲ�ߵȴ�. 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("sumi");
		String values = (String) list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}