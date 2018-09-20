<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="./custom01_proc.jsp" method="post">
    <table border='1'>
      <h3>회원 등록</h3>
      <tr>
        <th>아이디</th>
        <td><input type="text" name="id" /></td>
      </tr>
      <tr>
        <th>비밀번호</th>
        <td><input type="password" name="pw" /></td>
      </tr>
      <tr>
        <th>성명</th>
        <td><input type="text" name="name" /></td>
      </tr>
      <tr>
        <th>이메일</th>
        <td><input type="text" name="email" /></td>
      </tr>
      <tr>
        <th>연락처</th>
        <td><input type="text" name="phone" /></td>
      </tr>
      <tr>
        <td>
          <button type="submit">등록</button>
          <button type="button" onclick="location.href='./custom01_list.jsp'">조회</button>
        <td>
      </tr>
    </table>
  </form>
</body>
</html>