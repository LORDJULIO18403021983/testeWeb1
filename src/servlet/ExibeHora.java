package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExibeHora extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// super.doGet(request, response);
		// Verifica a data do servidor
		Date hoje = new Date();

		// Captura a refer�ncia ao objeto PrintWriter que existe em response
		PrintWriter gravador = response.getWriter();

		// Escreve o c�digo HTML
		gravador.println("<html>");
		gravador.println("<head><title>Primeiro Servlet</title></head>");
		gravador.println("<body>");
		gravador.println("<h1>Hora do Servidor</h1><br/><br/>");
		gravador.println(hoje);
		gravador.println("</body>");
		gravador.println("</html>");
	}
}
