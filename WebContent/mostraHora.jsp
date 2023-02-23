<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset=ISO-8859-1">
<title>Exibe hora pelo JSP</title>
</head>
<body>
<a href="index.html">Página principal</a>
<h1>Hora do servidor</h1>
<%
out.println(new java.util.Date());
%>
</body>
</html>