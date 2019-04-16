package ch18;

import java.util.ArrayList;

public class ArrayListExam2 {
	
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];
		
		System.out.println(value);
		// 기본형은 담을 수 없다. Integer로 바꿔야된다. 
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