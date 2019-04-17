package db;

public class Page1 {
	
	public static void main(String[] args) {
		int page = 2;
		
		int total = 32; //현재 전체 게시물 수
		int totalPage = 0; // 전체 페이지 수는  4가 되어야 한다. 
		if(total % 10 == 0) { // 10, 20, 30, 40 인 경우
			totalPage = total / 10;			
		} else {
			totalPage = total / 10 + 1;
		}
		System.out.println(totalPage);
		int startRow = 0;
		int endRow = 0;
		endRow = page * 10;
		startRow = endRow - 9;
		
		System.out.println(startRow);
		System.out.println(endRow);
		
		int startPage = 0;
		startPage = (page - 1) / 10 * 10 + 1;

		int endPage = 0;		
		endPage = startPage + 9;
		
		if (endPage > totalPage) {
			endPage = totalPage;
		}
		
		System.out.println(startPage);
		System.out.println(endPage);
		// pagination
	}
}
