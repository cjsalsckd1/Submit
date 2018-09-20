<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="custom01.*"%>
<% request.setCharacterEncoding("utf-8"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
  String id = request.getParameter("id");
  String pw = request.getParameter("pw");
  String name = request.getParameter("name");
  String email = request.getParameter("email");
  String phone = request.getParameter("phone");
   
  CusVO cusvo = new CusVO();
  cusvo.setId(id);
  cusvo.setPassword(pw);
  cusvo.setName(name);
  cusvo.setEmail(email);
  cusvo.setTel(phone);
  
  CusDAO cusDAO = new CusDAO();
  int count = cusDAO.insert(cusvo);
%>
<div>회원이 <%=count %>건 등록되었습니다.</div>
</head>
<body>

</body>
</html>