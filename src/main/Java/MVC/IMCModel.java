package mvc;

public class IMCModel {

	public static float calculaIMC(float altura, float peso) {
		float quadrado = altura * altura;
		return calculo = peso/quadrado;
	}
	
	public static String resultadoIMC(float calculo) {
		if(calculo < 18.5){
			return "Você está magro com esse indice";
			}
		else if(calculo>=18.5 && calculo<25){
			return "Você está normal com esse indice";
			}
		else if(calculo>=25 && calculo<30){
			return "Você está com sobre peso com esse indice";
			}
		else if(calculo>=30 && calculo<40){
			return "Você está com obesidade com esse indice";
			}
		else if (calculo>40){
			return "Você está com obesidade grave com esse indice";
			}
	}

	public static String descricaoIMC(float altura, float peso) {
		return resultadoIMC(calculaIMC(altura, peso));
	}
}