<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="db.DBManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 	request.setCharacterEncoding("utf-8");
	// [코드 작성] – request.getParameter()	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");

	try {
		DBManager db = DBManager.getInstance();
		Connection con = db.open(); 
		String sql = "insert into PERSON_INFO values(?, ?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, pw);
		stmt.setString(3, name);
		stmt.setString(4, phone);
		stmt.setString(5, email);
		
//		stmt.executeUpdate(); // 성공이면 1 이상, 실패면 0
	
//		if (result > 0) {
//			out.println("작성완료");
//		} else {
//			out.println("작성실패");
//		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>