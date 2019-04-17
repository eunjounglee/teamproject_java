<%@page import="db.DBManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String pageStr = request.getParameter("page");
	int pageNum = 0;
	pageNum = Integer.parseInt(pageStr);

	int startRow = 0;
	int endRow = 0;
	endRow = pageNum * 10;
	startRow = endRow - 9;

	try {
		DBManager db = DBManager.getInstance();
		Connection con = db.open();
		String sql = "select * from article order by id desc" + "			limit ?, 10";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, startRow);
		
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("id");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String hit = rs.getString("hit");
			String id2 = rs.getString("id2");
			// 절대 경로 	http://localhost/jspBoard.jsp?id=1
			// 상대 경로 	view.jsp?id=1
			out.print("<a href='view.jsp?id=" + id + "'>" + id + "/" + title + "/" + id2 + "</a><br>");
		}

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>