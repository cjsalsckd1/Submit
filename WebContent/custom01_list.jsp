<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="custom01.*"%>


<% request.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
    CusDAO cusDAO = new CusDAO();
    ArrayList<CusVO> list = cusDAO.list();
  %>
  <form action="">
    <table border='1'>
      <h3>회원목록조회</h3>
      <tr>
        <th>회원아이디</th>
        <th>회원이름</th>
        <th>이메일</th>
        <th>연락처</th>
      </tr>
    <%
    	for (int index = 0; index < list.size(); index++) {
    		CusVO cusvo = list.get(index);
    %>
      <tr>
        <td><%=cusvo.getId()%></td>
        <td><%=cusvo.getName()%></td>
        <td><%=cusvo.getEmail()%></td>
        <td><%=cusvo.getTel()%></td>
      </tr>
    <%
    	}
    %>
    </table>
    <hr>
    <h5>HRDKOREA Copyrightⓒ2015 All rights reserved. Human Resources Developments Service of Korea</h5>
  </form>
</body>
</html>