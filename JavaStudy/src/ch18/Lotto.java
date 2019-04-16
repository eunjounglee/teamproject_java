package ch18;

import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> my = new TreeSet<Integer>();
		
		lotto.add(10); lotto.add(16); lotto.add(20);
		lotto.add(30); lotto.add(40); lotto.add(44);
		
		int count = 0;
		// 1등 번호를 맞출때까지
		while(true) {
			// 내 번호가 6개 만들어질 때 까지
			while(true) {
				my.clear();
				int num = (int)(Math.random() * 45) + 1;
				my.add(num);
				
				if (my.size() == 6) {
					break;
				}
				count++;
				System.out.println(count);
				boolean isMatch = lotto.containsAll(my);
				
				if (isMatch) {
					break;
				}	
			}
		}
	}
}
