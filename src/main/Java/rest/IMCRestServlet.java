package rest;
 
 import java.io.IOException;
 import java.util.Date;
 
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
 @WebServlet(value = "/imcrest")
 public class IMCRestServlet extends HttpServlet {
 
     @Override
     protected void doGet(
             HttpServletRequest req,
             HttpServletResponse resp) throws ServletException, IOException {
 
    	 String pesoStr = req.getParameter("peso");
         float peso = pesoStr == null ? 0 : Float.parseFloat(pesoStr);
         
         String alturaStr = req.getParameter("altura");
         float altura = alturaStr == null ? 0 : Float.parseFloat(alturaStr);

 		float quadrado = altura * altura;
 		float calculo = peso/quadrado;
         
         String resultado = "";
         if(calculo < 18.5){
     		resultado = "Você está magro com esse indice";
     		}
     	 else if(calculo>=18.5 && calculo<25){
     		resultado = "Você está normal com esse indice";
     		}
     	else if(calculo>=25 && calculo<30){
     		resultado = "Você está com sobre peso com esse indice";
     		}
     	else if(calculo>=30 && calculo<40){
     			resultado = "Você está com obesidade com esse indice";
   			}
   		else if (calculo>40){
   			resultado = "Você está com obesidade grave com esse indice";
   			}
 
         resp.getOutputStream().print(
                 "{"
                 + "peso\":\"" + peso + "\","
                 + "altura\":\"" + altura + "\","
                 + "\"resultado\":\"" + resultado + "\","
                 + "\"dataDeProcessamento\":\"" + new Date() + "\""
               + "}");
     }
 
 }