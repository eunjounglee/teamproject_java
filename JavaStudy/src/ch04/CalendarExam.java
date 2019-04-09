package ch04;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// 오늘 날짜에 대한 정보가 불려진다. 
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		// month = 0 ~ 11사이가 불려진다. 
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		// System.out.println(year + " " + month + " " + date);
		
		// 현재 이 달의 마지막 날짜를 알려주는 코드
		int lastDate = c.getActualMaximum(Calendar.DATE);
		// 일요일 ~ 토요일 : 1 ~ 7
		int week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
//		System.out.println(lastDate);
//		
		// 달력의 날짜를 지정된 값으로 변경. 
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
