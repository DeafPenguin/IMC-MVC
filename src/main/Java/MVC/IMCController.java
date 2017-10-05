package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/IMC-mvc")
public class IMCController extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Obtemos os parametros da requisicao.
		String pesoString = request.getParameter("peso");
		String alturaString = request.getParameter("altura");
		float peso = pesoString == null ? 0 : Float.parseFloat(pesoString);
		float altura = alturaString == null ? 0 : Float.parseFloat(alturaString);
		
		
		//Executa a regra de negocio chamando a MODEL.
		String resultado = IMCModel.descricaoIMC(altura, peso);
		
		//Chama a view.
		//Mandar mensagem para o JSP mostrar.
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("IMCView.jsp").forward(request, response);
	}
}
