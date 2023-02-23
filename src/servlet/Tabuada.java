package servlet;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tabuada {
	protected void doGet(HttpServletRequest request, @NotNull HttpServletResponse response)
			throws ServletException, IOException {

		// Captura a refer�ncia ao objeto PrintWriter que existe em response
		PrintWriter gravador = response.getWriter();

		// Escreve o c�digo HTML
		gravador.println("<html>");
		gravador.println("<head><title>Tabuada</title></head>");
		gravador.println("<body>");
		gravador.println("<a href=http://localhost:8081/testeWeb/tabuada>Tabuada</a>");
		gravador.println("<h1>Tabuada</h1>");
		for (int i = 0; i <= 10; i++) {
			gravador.println(i + "x 7 =" + (i * 7) + "<br/>");
		}
		gravador.println("</body>");
		gravador.println("</html>");
	}
}
