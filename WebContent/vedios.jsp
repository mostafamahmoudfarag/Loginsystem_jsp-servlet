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
{
	if(session.getAttribute("name")==null)
		response.sendRedirect("index.jsp");
}
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/i79kZfIBvXA" frameborder="0" allow="accelerometer; 
autoplay; encrypted-media; gyroscope; 
picture-in-picture" allowfullscreen></iframe>
</body>
</html>