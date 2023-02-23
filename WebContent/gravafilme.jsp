<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page
	import="java.sql.*,java.util.*, dao.*, model.*,servlet.*,util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset=ISO-8859-1">
<title>..::Gravando Filme::..</title>
</head>
<body>
<%
String nomeDoFilme = request.getParameter("nomeDoFilme");
Double valorDoFilme = Double.parseDouble(request.getParameter("valorDoFilme"));
%>
</body>
</html>