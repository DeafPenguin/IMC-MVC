package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet/IMC-servlet")
public class IMCServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {

		resp.getOutputStream().print("<html>");
		resp.getOutputStream().print("<head>");
		resp.getOutputStream().print("<title>Calculo IMC - Servlet</title>");
		resp.getOutputStream().print("</head>");
		resp.getOutputStream().print("<body>");
		resp.getOutputStream().print("<h2>Calculo IMC - Servlet</h2>");
		resp.getOutputStream().print("<form>");
		resp.getOutputStream().print("Idade <input type=\"number\" name=\"idade\">");
		resp.getOutputStream().print("<button>Calcular</button>");
		resp.getOutputStream().print("</form>");
		resp.getOutputStream().print("<h3>");

		String calculoString = req.getParameter("calculo");
		float calculo = calculoString == null ? 0 : Float.parseFloat(calculoString);
		if (calculo != 0) {
			if(calculo < 18.5){
				resp.getOutputStream().print("Você está magro com esse indice");
				}
			else if(calculo>=18.5 && calculo<25){
				resp.getOutputStream().print("Você está normal com esse indice");
				}
			else if(calculo>=25 && calculo<30){
				resp.getOutputStream().print("Você está com sobre peso com esse indice");
				}
			else if(calculo>=30 && calculo<40){
				resp.getOutputStream().print("Você está com obesidade com esse indice");
				}
			else if (calculo>40){
				resp.getOutputStream().print("Você está com obesidade grave com esse indice");
				}
		} 
		resp.getOutputStream().print("</h3>");
		resp.getOutputStream().print("</body>");
        resp.getOutputStream().print("</html>");

	}

}
