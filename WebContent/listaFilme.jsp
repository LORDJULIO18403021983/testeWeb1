<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.sql.*,java.util.*, dao.*, model.*,servlet.*,util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset=ISO-8859-1">
<title>..::Lista de Filme::..</title>
</head>
<body>
	<a href="index.html">Página principal </a>
	<h1>Listagem de filme</h1>
	<table Border="1">
		<tr>
			<td>Nome</td>
			<td>Valor</td>
		</tr>	
		<%for (Filme f : dao.buscarTodosDao()) {%>
		<tr>
			<td><%=f.getNome()%></td>
			<td><%=String.format("%,7.2f", f.getValor())%></td>
		</tr>
		<%}%>
	</table>	
</body>
</html>