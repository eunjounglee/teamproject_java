package db;

public class Page2 {
	
	public static void main(String[] args) {
		int page = 10;
		
		int startPage = 0;
		startPage = (page - 1) / 10 * 10 + 1;

		int endPage = 0;		
		endPage = startPage + 9;
		
		System.out.println(startPage);
		System.out.println(endPage);
		// pagination
	}
}
