package ch04;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// ���� ��¥�� ���� ������ �ҷ�����. 
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		// month = 0 ~ 11���̰� �ҷ�����. 
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		// System.out.println(year + " " + month + " " + date);
		
		// ���� �� ���� ������ ��¥�� �˷��ִ� �ڵ�
		int lastDate = c.getActualMaximum(Calendar.DATE);
		// �Ͽ��� ~ ����� : 1 ~ 7
		int week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
//		System.out.println(lastDate);
//		
		// �޷��� ��¥�� ������ ������ ����. 
		c.set(year, month - 1, 1);
		week = c.get(Calendar.DAY_OF_WEEK);
// 		System.out.println(week);
		System.out.println(" SU MO TU WE TH FR SA");
		for (int i = 1; i < week; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i <= lastDate; i++, week++) {
			System.out.print(i < 10 ? "  " + i : " " + i);
			
			if (week % 7 == 0) {
				System.out.println();
			}
		}
	}
}
