<%@page import="db.DBManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%

	String id = request.getParameter("id");
	
	try {
		DBManager db = DBManager.getInstance();
		Connection con = db.open(); 
		String sql = "select * from article where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		
		ResultSet rs = stmt.executeQuery();	
	
		if (rs.next()) {
			String num = rs.getString("id");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String hit = rs.getString("hit");
			String id2 = rs.getString("id2");
			// 절대 경로 	http://localhost/jspBoard.jsp?id=1
			// 상대 경로 	view.jsp?id=1

%>
	<form method ="post" action="update_proc.jsp">
		제목 : <input type="text" name = "title" value= "<%=title%>"><br>
		내용 : <textarea name = "content"><%=content %></textarea><br>
		<input type ="hidden" name = "id" value="<%=id%>">		
		<input type ="submit" value="수정완료">
	</form>
<%		
		}		
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>