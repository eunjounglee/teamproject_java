package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 게시물등록 {

	public static void main(String[] args) {
		

		for (int i = 0; i < 100; i++) {
			
		String title = "title" + i;
		String content = "content" + i;
		String id = "michelle";
		
		try {
			DBManager db = DBManager.getInstance();
			Connection con = db.open();
			String sql = "insert into article values (null, ?, ?, 0, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, title);
			stmt.setString(2, content);
			stmt.setString(3, id);
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
}