<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

<%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("name")==null)
	response.sendRedirect("index.jsp");

%>
welcome ${name}
<a href="vedios.jsp">vedios</a>
<br>
<form action="logout" method="post">
<input type="submit" value="logout">
</form>

</body>
</html>