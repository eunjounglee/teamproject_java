<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 제목 input text -->
<!-- 내용 text area -->

<form method="post" action="write_proc.jsp">
	제목 : <input type = "text" name = "title"><br>
	내용 : <textarea name = "content"></textarea>
	<input type = "submit" value = "작성완료">
</form>